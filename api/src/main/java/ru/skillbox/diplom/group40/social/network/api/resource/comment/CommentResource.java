package ru.skillbox.diplom.group40.social.network.api.resource.comment;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.skillbox.diplom.group40.social.network.api.dto.comment.CommentDto;

@RequestMapping("/api/v1/task/comment")
public interface CommentResource {

    @PostMapping("")
    ResponseEntity<CommentDto> create(@RequestBody CommentDto commentDto);

}
