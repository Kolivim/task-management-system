package ru.skillbox.diplom.group40.social.network.impl.mapper.task;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.skillbox.diplom.group40.social.network.api.dto.task.StatusType;
import ru.skillbox.diplom.group40.social.network.api.dto.task.TaskDTO;
import ru.skillbox.diplom.group40.social.network.domain.task.Task;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-14T00:39:50+0300",
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

        if ( taskDTO.getStatus() != null ) {
            task.setStatus( taskDTO.getStatus() );
        }
        else {
            task.setStatus( StatusType.PENDING );
        }
        task.setId( taskDTO.getId() );
        task.setIsDeleted( taskDTO.getIsDeleted() );
        task.setPriority( taskDTO.getPriority() );
        task.setTitle( taskDTO.getTitle() );
        task.setDescription( taskDTO.getDescription() );
        task.setAuthorId( taskDTO.getAuthorId() );
        task.setExecutorId( taskDTO.getExecutorId() );

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

        return task;
    }
}
