package ru.skillbox.diplom.group40.social.network.impl.service.task;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.skillbox.diplom.group40.social.network.api.dto.comment.CommentDto;
import ru.skillbox.diplom.group40.social.network.api.dto.search.BaseSearchDto;
import ru.skillbox.diplom.group40.social.network.api.dto.task.TaskDTO;
import ru.skillbox.diplom.group40.social.network.domain.comment.Comment;
import ru.skillbox.diplom.group40.social.network.domain.task.Task;
import ru.skillbox.diplom.group40.social.network.domain.task.Task_;
import ru.skillbox.diplom.group40.social.network.impl.mapper.comment.CommentMapper;
import ru.skillbox.diplom.group40.social.network.impl.mapper.task.TaskMapper;
import ru.skillbox.diplom.group40.social.network.impl.repository.comment.CommentRepository;
import ru.skillbox.diplom.group40.social.network.impl.repository.task.TaskRepository;
import ru.skillbox.diplom.group40.social.network.impl.utils.auth.AuthUtil;
import ru.skillbox.diplom.group40.social.network.impl.utils.specification.SpecificationUtils;

import java.util.UUID;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class TaskService {

    private final TaskMapper taskMapper;
    private final CommentMapper commentMapper;
    private  final TaskRepository taskRepository;
    private  final CommentRepository commentRepository;
    private static String NOT_FOUND_MESSAGE = "Задача не найдена";

    public TaskDTO create(TaskDTO taskDTO) {
        log.info("TaskService: create(TaskDTO taskDTO) startMethod, taskDTO:{}", taskDTO);
        taskDTO.setAuthorId(AuthUtil.getUserId());
        return taskMapper.toTaskDTO(taskRepository.save(taskMapper.toTask(taskDTO)));
    }

    /** Все таски где передается айдишник из логина - в автора таски */
    public Page<TaskDTO> getAllMeAuthorId(Pageable page) {
        return getAllByAuthorId(AuthUtil.getUserId(), page);
    }

    public Page<TaskDTO> getAllMeExecutorId(Pageable page) {
        return getAllByExecutorId(AuthUtil.getUserId(), page);
    }

    /** Все таски где передается айдишник из логина - в исполнителя таски */
    public Page<TaskDTO> getAllByAuthorId(UUID id, Pageable page) {

        BaseSearchDto baseSearchDto = new BaseSearchDto();
        baseSearchDto.setIsDeleted(false);

        Specification taskSpecification = SpecificationUtils.getBaseSpecification(baseSearchDto)
                .and(SpecificationUtils.in(Task_.AUTHOR_ID, id));

        Page<Task> tasks = taskRepository.findAll(taskSpecification, page);
        Page<TaskDTO> tasksDto = tasks.map(taskMapper::toTaskDTO);
        return tasksDto;
    }

    /** Все таски где переданный айдишник - исполнитель таски */
    public Page<TaskDTO> getAllByExecutorId(UUID id, Pageable page) {

        /*
        BaseSearchDto baseSearchDto = new BaseSearchDto();
        baseSearchDto.setIsDeleted(false);
        */


        Specification taskSpecification = SpecificationUtils.getBaseSpecification(getBaseSearchDto())
                .and(SpecificationUtils.in(Task_.EXECUTOR_ID, id));

        Page<Task> tasks = taskRepository.findAll(taskSpecification, page);
        Page<TaskDTO> tasksDto = tasks.map(taskMapper::toTaskDTO);
        return tasksDto;
    }

    private BaseSearchDto getBaseSearchDto(){
        BaseSearchDto baseSearchDto = new BaseSearchDto();
        baseSearchDto.setIsDeleted(false);
        return  baseSearchDto;
    }

    public void deleteById(UUID id) {
        log.info("TaskService: deleteById(UUID id) startMethod, id: {}", id);

        Specification taskSpecification = SpecificationUtils.getBaseSpecification(getBaseSearchDto())
                .and(SpecificationUtils.in(Task_.AUTHOR_ID, AuthUtil.getUserId()))
                .and(SpecificationUtils.in(Task_.ID, id));

        Task task = (Task) taskRepository.findOne(taskSpecification).orElseThrow();
        task.setIsDeleted(true);

        // TODO: Подключить после добавления комментов
        /*
        List<Comment> comments = commentService.getAllByPatentId(id);
        for (Comment comment : comments) {
            deleteComment(id, comment.getId());
        }
        */

        log.info("TaskService: deleteById(UUID id) endMethod, save Task: {}", taskRepository.save(task));
    }

    public TaskDTO update(TaskDTO taskDTO) {
        log.info("TaskService: update(TaskDTO taskDTO) startMethod, TaskDTO: {}", taskDTO);

        Specification taskSpecification = SpecificationUtils.getBaseSpecification(getBaseSearchDto())
                .and(SpecificationUtils.in(Task_.AUTHOR_ID, AuthUtil.getUserId()))
                .and(SpecificationUtils.in(Task_.ID, taskDTO.getId()));

        Task task = (Task) taskRepository.findOne(taskSpecification).orElseThrow(/*NotFoundException(NOT_FOUND_MESSAGE)::new*/);

        return taskMapper.toTaskDTO(taskRepository.save(taskMapper.toTask(taskDTO, task)));
    }

    public TaskDTO updateStatus(TaskDTO taskDTO) {
        log.info("TaskService: updateStatus(TaskDTO taskDTO) startMethod, TaskDTO: {}", taskDTO);

        Specification taskSpecification = SpecificationUtils.getBaseSpecification(getBaseSearchDto())
                .and(SpecificationUtils.in(Task_.AUTHOR_ID, AuthUtil.getUserId())
                        .or(SpecificationUtils.in(Task_.EXECUTOR_ID, AuthUtil.getUserId())))
                .and(SpecificationUtils.in(Task_.ID, taskDTO.getId()));

        Task task = (Task) taskRepository.findOne(taskSpecification).orElseThrow();

        return taskMapper.toTaskDTO(taskRepository.save(taskMapper.toTaskStatus(taskDTO, task)));

    }

    public TaskDTO updateExecutor(TaskDTO taskDTO) {
        log.info("TaskService: updateExecutor(TaskDTO taskDTO) startMethod, TaskDTO: {}", taskDTO);

        Specification taskSpecification = SpecificationUtils.getBaseSpecification(getBaseSearchDto())
                .and(SpecificationUtils.in(Task_.AUTHOR_ID, AuthUtil.getUserId()))
                .and(SpecificationUtils.in(Task_.ID, taskDTO.getId()));

        Task task = (Task) taskRepository.findOne(taskSpecification).orElseThrow();

        return taskMapper.toTaskDTO(taskRepository.save(taskMapper.toTaskExecutor(taskDTO, task)));
    }

    public TaskDTO getById(UUID id) {
        log.info("TaskService: getById(UUID idO) startMethod, id: {}", id);

        Specification taskSpecification = SpecificationUtils.getBaseSpecification(getBaseSearchDto())
                .and(SpecificationUtils.in(Task_.ID, id));

        Task task = (Task) taskRepository.findOne(taskSpecification).orElseThrow();

        return taskMapper.toTaskDTO(task);
    }

    public TaskDTO createComment(CommentDto commentDto) {
        log.info("TaskService: createComment(CommentDto commentDto) startMethod, TaskDTO: {}", commentDto);

        commentDto.setAuthorId(AuthUtil.getUserId());

        Specification taskSpecification = SpecificationUtils.getBaseSpecification(getBaseSearchDto())
//                .and(SpecificationUtils.in(Task_.AUTHOR_ID, AuthUtil.getUserId()))
                .and(SpecificationUtils.in(Task_.ID, commentDto.getTaskId()));

        Task task = (Task) taskRepository.findOne(taskSpecification).orElseThrow();

        Comment comment = commentMapper.dtoToModel(commentDto);
        comment.setTask(task);
        Comment afterComment = commentRepository.save(comment);
        log.info("TaskService: createComment Comment: {}, aftrComment: {}", comment, afterComment);


//        task.addComment(comment);
//        Task afterTask = taskRepository.save(task);
//        log.info("TaskService: createComment after save TASK: {}", afterTask);

        return taskMapper.toTaskDTO(task);
    }


    /** Исправить ниже: */ // TODO:

          /*

    private final PostMapper postMapper;
    private final PostRepository postRepository;
    private final CommentService commentService;

    private final LikeService likeService;
    private final AccountService accountService;
    private String notFoundMessage = "Пользователь не найден";



    public PostDto update(PostDto postDto) {
        log.info("PostService: update(PostDto postDto), postDto = " + postDto + " (Start method)");
        Post currentPost = postRepository.findById(postDto.getId()).orElseThrow(()
                -> new NotFoundException(notFoundMessage));

        return postMapper.toDto(postRepository.save(postMapper.toPost(postDto, currentPost)));
    }

    public PostDto get(UUID id) {
        log.info("PostService: get(UUID id), id = " + id + " (Start method)");
        return postMapper.toDto(postRepository.findById(id).orElseThrow(()
                -> new NotFoundException(notFoundMessage)));
    }


    public Page<PostDto> getAll(PostSearchDto postSearchDto, Pageable page) throws AccountException {
        log.info("PostService: getAll() Start method " + postSearchDto);

        BaseSearchDto baseSearchDto = new BaseSearchDto();
        baseSearchDto.setIsDeleted(postSearchDto.getIsDeleted());

        Specification postDtoSpecification = SpecificationUtils.getBaseSpecification(baseSearchDto)
                .and(SpecificationUtils.in(Post_.AUTHOR_ID, postSearchDto.getAccountIds()))
                .and(SpecificationUtils.in(Post_.ID, postSearchDto.getIds()))
                .and(SpecificationUtils.like(Post_.POST_TEXT, postSearchDto.getText()))
                .and(SpecificationUtils.betweenDate(Post_.PUBLISH_DATE, postSearchDto.getDateFrom(), postSearchDto.getDateTo()))
                .and(SpecificationUtils.in(Post_.AUTHOR_ID, uuidListFromAccount(postSearchDto)));

        Page<Post> posts = postRepository.findAll(postDtoSpecification, page);

        Page<PostDto> postDtos = posts.map(postMapper::toDto);

//        for (PostDto postDto : postDtos) {
//            List<Like> likes = likeService.getByAuthorAndItem(AuthUtil.getUserId(), postDto.getId());
//            for (Like like : likes) {
//                if (!like.getIsDeleted()) {
//                    postDto.setMyLike(true);
//                    String reaction = like.getReactionType();
//                    postDto.setMyReaction(reaction);
//                    //postDto.setReactionType(reaction);
//                }
//            }
//        }
        for (PostDto postDto : postDtos){
            List<Like> likes = likeService.getByAuthorAndItem(AuthUtil.getUserId(), postDto.getId());
            for(Like like : likes) {
                if (!like.getIsDeleted()) {
                    postDto.setMyLike(true);
                    String reaction = like.getReactionType();
                    postDto.setMyReaction(reaction);
                    List<Like> likesForPost = likeService.getAllByItemId(postDto.getId());
                    List<String> reactions = new ArrayList<>();
                    Set<String> reactionTypes = new HashSet<>();
                    for (Like likeForPost : likesForPost){
                        if(!likeForPost.getIsDeleted()) {
                            String reactionType = likeForPost.getReactionType();
                            reactions.add(reactionType);
                            reactionTypes.add(reactionType);
                        }
                    }
                }
            }
        }


        return postDtos;
    }

    public List<UUID> uuidListFromAccount(PostSearchDto postSearchDto) throws AccountException {
        AccountSearchDto accountSearchDto = new AccountSearchDto();
        accountSearchDto.setFirstName(postSearchDto.getAuthor());
        accountSearchDto.setLastName(postSearchDto.getAuthor());
        Page<AccountDto> accounts = accountService.getAll(accountSearchDto, Pageable.unpaged());

        return accounts.stream().map(BaseDto::getId).toList();
    }

    public void deleteById(UUID id) {
        log.info("PostService: deleteById(PostDto postDto), id = " + id + " (Start method)");
        Post post = postRepository.findById(id).orElseThrow(() -> new NotFoundException(notFoundMessage));
        post.setIsDeleted(true);
        List<Comment> comments = commentService.getAllByPatentId(id);

        List<Like> likes = likeService.getAllByItemId(id);

        postRepository.save(post);
    }

    */

}
