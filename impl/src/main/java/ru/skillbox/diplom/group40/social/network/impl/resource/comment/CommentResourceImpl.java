package ru.skillbox.diplom.group40.social.network.impl.resource.comment;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.skillbox.diplom.group40.social.network.api.dto.comment.CommentDto;
import ru.skillbox.diplom.group40.social.network.api.resource.comment.CommentResource;
import ru.skillbox.diplom.group40.social.network.impl.service.comment.CommentService;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class CommentResourceImpl implements CommentResource {

    private final CommentService commentService;

    @Override
    public ResponseEntity<CommentDto> create(CommentDto commentDto) {
        return ResponseEntity.ok(commentService.create(commentDto));
    }

    @Override
    public ResponseEntity<Page<CommentDto>> getByMeAuthorId(Pageable page) {
        return ResponseEntity.ok(commentService.getAllMeAuthorId(page));
    }


    @Override
    public ResponseEntity<CommentDto> getById(UUID id) {
        return ResponseEntity.ok(commentService.getById(id));
    }

    @Override
    public ResponseEntity<Page<CommentDto>> getByAuthorId(UUID id, Pageable page) {
        return ResponseEntity.ok(commentService.getAllByAuthorId(id, page));
    }

//    @Override
//    public ResponseEntity<Page<CommentDto>> getByTaskId(UUID id, Pageable page) {
//        return ResponseEntity.ok(commentService.getAllByTaskId(id, page));
//    }

    @Override
    public ResponseEntity deleteById(UUID id) {
        commentService.deleteById(id);
        return ResponseEntity.ok().body("Комментарий удален успешно");
    }
}
