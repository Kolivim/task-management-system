package ru.skillbox.diplom.group40.social.network.impl.mapper.task;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.skillbox.diplom.group40.social.network.api.dto.comment.CommentDto;
import ru.skillbox.diplom.group40.social.network.api.dto.task.StatusType;
import ru.skillbox.diplom.group40.social.network.api.dto.task.TaskDTO;
import ru.skillbox.diplom.group40.social.network.domain.comment.Comment;
import ru.skillbox.diplom.group40.social.network.domain.task.Task;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-17T19:54:59+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public Task toTask(TaskDTO taskDTO) {
        if ( taskDTO == null ) {
            return null;
        }

        Task task = new Task();

        if ( taskDTO.getIsDeleted() != null ) {
            task.setIsDeleted( taskDTO.getIsDeleted() );
        }
        else {
            task.setIsDeleted( false );
        }
        if ( taskDTO.getStatus() != null ) {
            task.setStatus( taskDTO.getStatus() );
        }
        else {
            task.setStatus( StatusType.PENDING );
        }
        task.setId( taskDTO.getId() );
        task.setPriority( taskDTO.getPriority() );
        task.setTitle( taskDTO.getTitle() );
        task.setDescription( taskDTO.getDescription() );
        task.setAuthorId( taskDTO.getAuthorId() );
        task.setExecutorId( taskDTO.getExecutorId() );
        task.setComments( commentDtoListToCommentList( taskDTO.getComments() ) );

        return task;
    }

    @Override
    public TaskDTO toTaskDTO(Task task) {
        if ( task == null ) {
            return null;
        }

        TaskDTO taskDTO = new TaskDTO();

        taskDTO.setId( task.getId() );
        taskDTO.setIsDeleted( task.getIsDeleted() );
        taskDTO.setStatus( task.getStatus() );
        taskDTO.setPriority( task.getPriority() );
        taskDTO.setTitle( task.getTitle() );
        taskDTO.setDescription( task.getDescription() );
        taskDTO.setAuthorId( task.getAuthorId() );
        taskDTO.setExecutorId( task.getExecutorId() );
        taskDTO.setComments( commentListToCommentDtoList( task.getComments() ) );

        return taskDTO;
    }

    @Override
    public Task toTask(TaskDTO taskDTO, Task task) {
        if ( taskDTO == null ) {
            return task;
        }

        if ( taskDTO.getId() != null ) {
            task.setId( taskDTO.getId() );
        }
        if ( taskDTO.getIsDeleted() != null ) {
            task.setIsDeleted( taskDTO.getIsDeleted() );
        }
        if ( taskDTO.getStatus() != null ) {
            task.setStatus( taskDTO.getStatus() );
        }
        if ( taskDTO.getPriority() != null ) {
            task.setPriority( taskDTO.getPriority() );
        }
        if ( taskDTO.getTitle() != null ) {
            task.setTitle( taskDTO.getTitle() );
        }
        if ( taskDTO.getDescription() != null ) {
            task.setDescription( taskDTO.getDescription() );
        }
        if ( taskDTO.getAuthorId() != null ) {
            task.setAuthorId( taskDTO.getAuthorId() );
        }
        if ( taskDTO.getExecutorId() != null ) {
            task.setExecutorId( taskDTO.getExecutorId() );
        }
        if ( task.getComments() != null ) {
            List<Comment> list = commentDtoListToCommentList( taskDTO.getComments() );
            if ( list != null ) {
                task.getComments().clear();
                task.getComments().addAll( list );
            }
        }
        else {
            List<Comment> list = commentDtoListToCommentList( taskDTO.getComments() );
            if ( list != null ) {
                task.setComments( list );
            }
        }

        return task;
    }

    @Override
    public Task toTaskStatus(TaskDTO taskDTO, Task task) {
        if ( taskDTO == null ) {
            return task;
        }

        if ( taskDTO.getStatus() != null ) {
            task.setStatus( taskDTO.getStatus() );
        }
        if ( task.getComments() != null ) {
            List<Comment> list = commentDtoListToCommentList( taskDTO.getComments() );
            if ( list != null ) {
                task.getComments().clear();
                task.getComments().addAll( list );
            }
        }
        else {
            List<Comment> list = commentDtoListToCommentList( taskDTO.getComments() );
            if ( list != null ) {
                task.setComments( list );
            }
        }

        return task;
    }

    @Override
    public Task toTaskExecutor(TaskDTO taskDTO, Task task) {
        if ( taskDTO == null ) {
            return task;
        }

        if ( taskDTO.getExecutorId() != null ) {
            task.setExecutorId( taskDTO.getExecutorId() );
        }
        if ( task.getComments() != null ) {
            List<Comment> list = commentDtoListToCommentList( taskDTO.getComments() );
            if ( list != null ) {
                task.getComments().clear();
                task.getComments().addAll( list );
            }
        }
        else {
            List<Comment> list = commentDtoListToCommentList( taskDTO.getComments() );
            if ( list != null ) {
                task.setComments( list );
            }
        }

        return task;
    }

    protected Comment commentDtoToComment(CommentDto commentDto) {
        if ( commentDto == null ) {
            return null;
        }

        Comment comment = new Comment();

        comment.setId( commentDto.getId() );
        comment.setIsDeleted( commentDto.getIsDeleted() );
        comment.setAuthorId( commentDto.getAuthorId() );
        comment.setCommentText( commentDto.getCommentText() );

        return comment;
    }

    protected List<Comment> commentDtoListToCommentList(List<CommentDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Comment> list1 = new ArrayList<Comment>( list.size() );
        for ( CommentDto commentDto : list ) {
            list1.add( commentDtoToComment( commentDto ) );
        }

        return list1;
    }

    protected CommentDto commentToCommentDto(Comment comment) {
        if ( comment == null ) {
            return null;
        }

        CommentDto commentDto = new CommentDto();

        commentDto.setId( comment.getId() );
        commentDto.setIsDeleted( comment.getIsDeleted() );
        commentDto.setAuthorId( comment.getAuthorId() );
        commentDto.setCommentText( comment.getCommentText() );

        return commentDto;
    }

    protected List<CommentDto> commentListToCommentDtoList(List<Comment> list) {
        if ( list == null ) {
            return null;
        }

        List<CommentDto> list1 = new ArrayList<CommentDto>( list.size() );
        for ( Comment comment : list ) {
            list1.add( commentToCommentDto( comment ) );
        }

        return list1;
    }
}
