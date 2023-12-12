package ru.skillbox.diplom.group40.social.network.impl.service.task;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.skillbox.diplom.group40.social.network.api.dto.task.TaskDTO;
import ru.skillbox.diplom.group40.social.network.domain.task.Task;
import ru.skillbox.diplom.group40.social.network.impl.mapper.task.TaskMapper;
import ru.skillbox.diplom.group40.social.network.impl.repository.task.TaskRepository;
import ru.skillbox.diplom.group40.social.network.impl.utils.auth.AuthUtil;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class TaskService {

    private final TaskMapper taskMapper;
    private  final TaskRepository taskRepository;

    public TaskDTO create(TaskDTO taskDTO) {
        log.info("TaskService: create(TaskDTO taskDTO) startMethod, taskDTO:{}", taskDTO);
        taskDTO.setAuthorId(AuthUtil.getUserId());

        Task task = taskRepository.save(taskMapper.toTask(taskDTO));
        return taskMapper.toTaskDTO(taskRepository.save(taskMapper.toTask(taskDTO)));
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
