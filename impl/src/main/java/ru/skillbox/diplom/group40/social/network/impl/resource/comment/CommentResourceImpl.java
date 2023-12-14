package ru.skillbox.diplom.group40.social.network.impl.resource.comment;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.skillbox.diplom.group40.social.network.api.dto.comment.CommentDto;
import ru.skillbox.diplom.group40.social.network.api.resource.comment.CommentResource;
import ru.skillbox.diplom.group40.social.network.impl.service.comment.CommentService;

@RestController
@RequiredArgsConstructor
public class CommentResourceImpl implements CommentResource {

    private final CommentService commentService;

    @Override
    public ResponseEntity<CommentDto> create(CommentDto commentDto) {
        return ResponseEntity.ok(commentService.create(commentDto));
    }
}
