package ru.skillbox.diplom.group40.social.network.impl.service.comment;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.skillbox.diplom.group40.social.network.api.dto.comment.CommentDto;
import ru.skillbox.diplom.group40.social.network.api.dto.search.BaseSearchDto;
import ru.skillbox.diplom.group40.social.network.domain.comment.Comment;
import ru.skillbox.diplom.group40.social.network.domain.comment.Comment_;
import ru.skillbox.diplom.group40.social.network.impl.exception.NotFoundException;
import ru.skillbox.diplom.group40.social.network.impl.mapper.comment.CommentMapper;
import ru.skillbox.diplom.group40.social.network.impl.mapper.task.TaskMapper;
import ru.skillbox.diplom.group40.social.network.impl.repository.comment.CommentRepository;
import ru.skillbox.diplom.group40.social.network.impl.service.task.TaskService;
import ru.skillbox.diplom.group40.social.network.impl.utils.auth.AuthUtil;
import ru.skillbox.diplom.group40.social.network.impl.utils.specification.SpecificationUtils;

import java.util.UUID;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class CommentService {

    private final CommentMapper commentMapper;
    private final CommentRepository commentRepository;
    private final TaskService taskService;
    private final TaskMapper taskMapper;

    //    private final TaskRepository taskRepository; // Рабочее

    public CommentDto create(CommentDto commentDto) throws Throwable {
        log.info("CommentService: createComment(CommentDto commentDto) startMethod, CommentDTO: {}", commentDto);

        commentDto.setAuthorId(AuthUtil.getUserId());

//        Task task = taskMapper.toTask(taskService.getById(commentDto.getTaskId()));

        Comment comment = commentMapper.dtoToModel(commentDto);
        comment.setTask(taskMapper.toTask(taskService.getById(commentDto.getTaskId())));

        log.info("CommentService: createComment(CommentDto commentDto) получен к сохранению Comment: {}", comment);

//        Comment afterComment = commentRepository.save(comment);
//        log.info("CommentService: createComment Comment: {}, afterComment: {}", comment, afterComment);
//        return commentMapper.modelToDto(afterComment);

        return commentMapper.modelToDto(commentRepository.save(comment));
    }

    /**
     * Все комменты где передается айдишник из логина - в автора таски
     */
    public Page<CommentDto> getAllMeAuthorId(Pageable page) {
        return getAllByAuthorId(AuthUtil.getUserId(), page);
    }


    /**
     * Все комменты где передается айдишник из логина - в исполнителя таски
     */
    public Page<CommentDto> getAllByAuthorId(UUID id, Pageable page) {
        log.info("CommentService: getAllByAuthorId(UUID id, Pageable page) startMethod, id: {}", id);
        Specification taskSpecification = SpecificationUtils.getBaseSpecification(getBaseSearchDto())
                .and(SpecificationUtils.in(Comment_.AUTHOR_ID, id));

        Page<Comment> comments = commentRepository.findAll(taskSpecification, page);
        Page<CommentDto> commentsDto = comments.map(commentMapper::modelToDto);
        return commentsDto;
    }

    public CommentDto getById(UUID id) throws Throwable {
        log.info("CommentService: getById(UUID id) startMethod, id: {}", id);
        Specification commentSpecification = SpecificationUtils.getBaseSpecification(getBaseSearchDto())
                .and(SpecificationUtils.in(Comment_.ID, id));
        Comment comment = (Comment) commentRepository.findOne(commentSpecification).orElseThrow(()
                -> new NotFoundException("Комментария с таким UUID не существует"));
        return commentMapper.modelToDto(comment);

    }

    //    @SneakyThrows
    public void deleteById(UUID id) throws Throwable {
        log.info("CommentService: deleteById(UUID id) startMethod, id: {}", id);

        Specification commentSpecification = SpecificationUtils.getBaseSpecification(getBaseSearchDto())
                .and(SpecificationUtils.in(Comment_.AUTHOR_ID, AuthUtil.getUserId()))
                .and(SpecificationUtils.in(Comment_.ID, id));
        Comment comment = (Comment) commentRepository.findOne(commentSpecification).orElseThrow(()
                -> new NotFoundException("Комментария с таким UUID не существует либо вы не являетесь его автором"));
        comment.setIsDeleted(true);

        log.info("CommentService: deleteById(UUID id) endMethod, save Comment: {}", commentRepository.save(comment));
    }

    private BaseSearchDto getBaseSearchDto() {
        BaseSearchDto baseSearchDto = new BaseSearchDto();
        baseSearchDto.setIsDeleted(false);
        return baseSearchDto;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*
    public Page<CommentDto> getAllByTaskId(UUID id, Pageable page) {
        log.info("CommentService: getAllByTaskId(UUID id, Pageable page) startMethod, id: {}", id);
        Specification taskSpecification = SpecificationUtils.getBaseSpecification(getBaseSearchDto())
                .and(SpecificationUtils.in(Comment_.TASK, id));

        Page<Comment> comments = commentRepository.findAll(taskSpecification, page);
        Page<CommentDto> commentsDto = comments.map(commentMapper::modelToDto);
        return commentsDto;
    }
    */
