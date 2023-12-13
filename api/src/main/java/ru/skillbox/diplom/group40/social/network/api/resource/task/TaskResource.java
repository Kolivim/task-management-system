package ru.skillbox.diplom.group40.social.network.api.resource.task;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.skillbox.diplom.group40.social.network.api.dto.task.TaskDTO;

import java.util.UUID;

@RequestMapping("/api/v1/task")
public interface TaskResource {

    @PostMapping("")
    ResponseEntity<TaskDTO> create(@RequestBody TaskDTO taskDTO);

    @PutMapping("")
    ResponseEntity update(TaskDTO taskDTO);

    @PutMapping("/status")
    ResponseEntity updateStatus(TaskDTO taskDTO);

    @GetMapping("/author")
    ResponseEntity<Page<TaskDTO>> getAllMeAuthorId(Pageable page);

    @GetMapping("/executor")
    ResponseEntity<Page<TaskDTO>> getAllMeExecutorId(Pageable page);


    @GetMapping("/author/{id}")
    ResponseEntity<Page<TaskDTO>> getAllByAuthorId(@PathVariable UUID id, Pageable page);

    @GetMapping("/executor/{id}")
    ResponseEntity<Page<TaskDTO>> getAllByExecutorId(@PathVariable UUID id, Pageable page);

    @DeleteMapping("/{id}")
    ResponseEntity deleteById(UUID id);

//    @PutMapping("/{id}/comment")
//    public ResponseEntity<CommentDto> updateComment(@RequestBody CommentDto commentDto);
//    @PostMapping("/{id}/comment")
//    @ResponseBody
//    public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto commentDto,
//                                                    @PathVariable UUID id);

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
