package ru.skillbox.diplom.group40.social.network.impl.resource.task;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.skillbox.diplom.group40.social.network.api.dto.comment.CommentDto;
import ru.skillbox.diplom.group40.social.network.api.dto.task.TaskDTO;
import ru.skillbox.diplom.group40.social.network.api.resource.task.TaskResource;
import ru.skillbox.diplom.group40.social.network.impl.service.task.TaskService;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class TaskResourceImpl implements TaskResource {

    private final TaskService taskService;

    @Override
//    @PostMapping("")
    public ResponseEntity<TaskDTO> create(@RequestBody TaskDTO taskDTO) {
        return ResponseEntity.ok(taskService.create(taskDTO));
    }

    @Override
//    @PutMapping("")
    public ResponseEntity update(TaskDTO taskDTO) {
        return ResponseEntity.ofNullable(taskService.update(taskDTO));
    }

    @Override
    public ResponseEntity updateStatus(TaskDTO taskDTO) {
        return ResponseEntity.ofNullable(taskService.updateStatus(taskDTO));
    }

    @Override
    public ResponseEntity updateExecutor(TaskDTO taskDTO) {
        return ResponseEntity.ofNullable(taskService.updateExecutor(taskDTO));
    }

    @Override
    public ResponseEntity<Page<TaskDTO>> getAllMeAuthorId(Pageable page) {
        return ResponseEntity.ok(taskService.getAllMeAuthorId(page));
    }

    @Override
    public ResponseEntity<Page<TaskDTO>> getAllMeExecutorId(Pageable page) {
        return ResponseEntity.ok(taskService.getAllMeExecutorId(page));
    }

    @Override
    public ResponseEntity<Page<TaskDTO>> getAllByAuthorId(UUID id, Pageable page) {
        return ResponseEntity.ok(taskService.getAllByAuthorId(id, page));
    }

    @Override
    public ResponseEntity<Page<TaskDTO>> getAllByExecutorId(UUID id, Pageable page) {
        return ResponseEntity.ok(taskService.getAllByExecutorId(id, page));
    }

    @Override
    public ResponseEntity deleteById(UUID id) {
        taskService.deleteById(id);
        return ResponseEntity.ok().body("Задача удалёна успешно");
    }

    @Override
    public ResponseEntity<TaskDTO> getById(UUID id) {
        return ResponseEntity.ok(taskService.getById(id));
    }

    @Override
    public ResponseEntity<TaskDTO> createComment(CommentDto commentDto) {
        return ResponseEntity.ok(taskService.createComment(commentDto));
    }



    /** Исправить ниже: */ // TODO:

            /*

    private final PostService postService;

    private final CommentService commentService;



    @Override
    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable UUID id) {
        return ResponseEntity.ofNullable(postService.get(id));
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorMessage> handleException(NotFoundException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorMessage(exception.getMessage()));
    }

    @Override
    @GetMapping("")
    public ResponseEntity getAll(PostSearchDto postSearchDto, Pageable page) throws AccountException {
        return ResponseEntity.ok(postService.getAll(postSearchDto, page));
    }



    @Override
    @PutMapping("/{id}/comment")
    public ResponseEntity<CommentDto> updateComment(@RequestBody CommentDto commentDto){
        return ResponseEntity.ok(commentService.update(commentDto));
    }
    @Override
    @PostMapping("/{id}/comment")
    public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto commentDto,
                                                    @PathVariable UUID id){
        return ResponseEntity.ok(postService.createComment(commentDto, id));
    }
    @Override
    @PutMapping("/{id}/comment/{commentId}")
    public ResponseEntity<CommentDto> updateSubComment(@RequestBody CommentDto commentDto, @PathVariable UUID commentId){
        return ResponseEntity.ok(commentService.updateSub(commentDto, commentId));
    }
    @DeleteMapping("/{id}/comment/{commentId}")
    public ResponseEntity deleteComment(@PathVariable UUID id, @PathVariable UUID commentId) {
        postService.deleteComment(id, commentId);
        return ResponseEntity.ok().body("Comment deleted");
    }
             */
}
