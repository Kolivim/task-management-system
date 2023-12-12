package ru.skillbox.diplom.group40.social.network.api.resource.task;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.skillbox.diplom.group40.social.network.api.dto.task.TaskDTO;

@RequestMapping("/api/v1/task")
public interface TaskResource {

    @PostMapping("")
    ResponseEntity<TaskDTO> create(@RequestBody TaskDTO taskDTO);

    /** Исправить ниже: */ // TODO:

    /*
    @PutMapping("")
    ResponseEntity<PostDto> update(@RequestBody PostDto postDto);

    @GetMapping("/{id}")
    ResponseEntity get(@PathVariable UUID id);

    @GetMapping("/")
    ResponseEntity getAll(PostSearchDto postSearchDto, Pageable page) throws AccountException;

    @DeleteMapping("/{id}")
    ResponseEntity deleteById(@PathVariable UUID id);

    @PutMapping("/{id}/comment")
    public ResponseEntity<CommentDto> updateComment(@RequestBody CommentDto commentDto);
    @PostMapping("/{id}/comment")
    @ResponseBody
    public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto commentDto,
                                                    @PathVariable UUID id);
    @PutMapping("/{id}/comment/{commentId}")
    public ResponseEntity<CommentDto> updateSubComment(@RequestBody CommentDto commentDto, @PathVariable UUID commentId);
    @DeleteMapping("/{id}/comment/{commentId}")
    public ResponseEntity deleteComment(@PathVariable UUID id, @PathVariable UUID commentId);

    */



    /** */

}
