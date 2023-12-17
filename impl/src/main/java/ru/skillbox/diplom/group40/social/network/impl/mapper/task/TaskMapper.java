package ru.skillbox.diplom.group40.social.network.impl.mapper.task;

import org.mapstruct.*;
import ru.skillbox.diplom.group40.social.network.api.dto.task.TaskDTO;
import ru.skillbox.diplom.group40.social.network.domain.task.Task;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TaskMapper {

    @Mappings({
            @Mapping(target = "isDeleted", source = "isDeleted", defaultValue = "false"),
            @Mapping(target = "status", source = "status", defaultValue = "PENDING")})
    Task toTask(TaskDTO taskDTO);

    TaskDTO toTaskDTO(Task task);

    Task toTask(TaskDTO taskDTO, @MappingTarget Task task);

    @Mappings({
            @Mapping(target = "priority", ignore = true),
            @Mapping(target = "title", ignore = true),
            @Mapping(target = "description", ignore = true),
            @Mapping(target = "authorId", ignore = true),
            @Mapping(target = "executorId", ignore = true),
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "isDeleted", ignore = true),
    })
    Task toTaskStatus(TaskDTO taskDTO, @MappingTarget Task task);

    @Mappings({
            @Mapping(target = "priority", ignore = true),
            @Mapping(target = "title", ignore = true),
            @Mapping(target = "description", ignore = true),
            @Mapping(target = "authorId", ignore = true),
            @Mapping(target = "status", ignore = true),
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "isDeleted", ignore = true),
    })
    Task toTaskExecutor(TaskDTO taskDTO, @MappingTarget Task task);
}
