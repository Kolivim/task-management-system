package ru.skillbox.diplom.group40.social.network.api.resource.comment;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.skillbox.diplom.group40.social.network.api.dto.comment.CommentDto;

import java.util.UUID;

@RequestMapping("/api/v1/task/comment")
public interface CommentResource {

    @PostMapping("")
    ResponseEntity<CommentDto> create(@RequestBody CommentDto commentDto) throws Throwable;
    @GetMapping("")
    ResponseEntity<Page<CommentDto>> getByMeAuthorId(Pageable page);

    @GetMapping("/{id}")
    ResponseEntity<CommentDto> getById(@PathVariable UUID id) throws Throwable;

    @GetMapping("/author/{id}")
    ResponseEntity<Page<CommentDto>> getByAuthorId(@PathVariable UUID id, Pageable page);

//    @GetMapping("/task/{id}")
//    ResponseEntity<Page<CommentDto>> getByTaskId(@PathVariable UUID id, Pageable page);

    @DeleteMapping("/{id}")
    ResponseEntity deleteById(@PathVariable UUID id) throws Throwable;

}
