package ru.skillbox.diplom.group40.social.network.impl.service.comment;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.skillbox.diplom.group40.social.network.api.dto.comment.CommentDto;
import ru.skillbox.diplom.group40.social.network.domain.comment.Comment;
import ru.skillbox.diplom.group40.social.network.impl.mapper.comment.CommentMapper;
import ru.skillbox.diplom.group40.social.network.impl.repository.comment.CommentRepository;
import ru.skillbox.diplom.group40.social.network.impl.repository.task.TaskRepository;
import ru.skillbox.diplom.group40.social.network.impl.utils.auth.AuthUtil;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class CommentService {

    private  final CommentMapper commentMapper;
    private final CommentRepository commentRepository;
    private final TaskRepository taskRepository;

    public CommentDto create(CommentDto commentDto) {
        log.info("CommentService: create(CommentDto commentDto) startMethod, CommentDto:{}", commentDto);
        commentDto.setAuthorId(AuthUtil.getUserId());
        Comment comment = commentMapper.dtoToModel(commentDto);
        return commentMapper.modelToDto(commentRepository.save(comment));
    }
}
