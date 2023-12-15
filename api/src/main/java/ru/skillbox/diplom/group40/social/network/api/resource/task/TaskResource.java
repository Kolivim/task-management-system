package ru.skillbox.diplom.group40.social.network.api.resource.task;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.skillbox.diplom.group40.social.network.api.dto.comment.CommentDto;
import ru.skillbox.diplom.group40.social.network.api.dto.task.TaskDTO;

import java.util.UUID;

@RequestMapping("/api/v1/task")
public interface TaskResource {

    @PostMapping("")
    ResponseEntity<TaskDTO> create(@RequestBody TaskDTO taskDTO);

    @PutMapping("")
    ResponseEntity update(@RequestBody TaskDTO taskDTO);

    @PutMapping("/status")
    ResponseEntity updateStatus(@RequestBody TaskDTO taskDTO);

    @PutMapping("/executor")
    ResponseEntity updateExecutor(@RequestBody TaskDTO taskDTO);

    @GetMapping("/filter/me")
    ResponseEntity<Page<TaskDTO>> getAllMeByFilter(@RequestBody TaskDTO taskDTO, Pageable page);

    @GetMapping("/filter")
    ResponseEntity<Page<TaskDTO>> getAllByFilter(@RequestBody TaskDTO taskDTO, Pageable page);

    @GetMapping("/author")
    ResponseEntity<Page<TaskDTO>> getAllMeAuthorId(Pageable page);

    @GetMapping("/executor")
    ResponseEntity<Page<TaskDTO>> getAllMeExecutorId(Pageable page);


    @GetMapping("/author/{id}")
    ResponseEntity<Page<TaskDTO>> getAllByAuthorId(@PathVariable UUID id, Pageable page);

    @GetMapping("/executor/{id}")
    ResponseEntity<Page<TaskDTO>> getAllByExecutorId(@PathVariable UUID id, Pageable page);

    @DeleteMapping("/{id}")
    ResponseEntity deleteById(@PathVariable UUID id);

    @GetMapping("/{id}")
    ResponseEntity<TaskDTO> getById(@PathVariable UUID id);

    @PostMapping("/addcomment")
    ResponseEntity<TaskDTO> createComment(@RequestBody CommentDto commentDto);

//    @PutMapping("/{id}/comment")
//    public ResponseEntity<CommentDto> updateComment(@RequestBody CommentDto commentDto);
//    @PostMapping("/{id}/comment")
//    @ResponseBody
//    public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto commentDto,
//                                                    @PathVariable UUID id);

}
