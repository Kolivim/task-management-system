package ru.skillbox.diplom.group40.social.network.impl.resource.task;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.skillbox.diplom.group40.social.network.api.dto.task.TaskDTO;
import ru.skillbox.diplom.group40.social.network.api.resource.task.TaskResource;
import ru.skillbox.diplom.group40.social.network.impl.service.task.TaskService;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class TaskResourceImpl implements TaskResource {

    private final TaskService taskService;

    @Override
    @PostMapping("")
    public ResponseEntity<TaskDTO> create(@RequestBody TaskDTO taskDTO) {
        return ResponseEntity.ok(taskService.create(taskDTO));
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

    /** Исправить ниже: */ // TODO:

            /*

    private final PostService postService;

    private final CommentService commentService;

    @Override
    @PutMapping("")
    public ResponseEntity update(PostDto postDto) {
        return ResponseEntity.ofNullable(postService.update(postDto));
    }

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
    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(UUID id) {
        postService.deleteById(id);
        return ResponseEntity.ok().body("Пользователь удалён успешно");
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
