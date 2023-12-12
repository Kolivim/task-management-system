package ru.skillbox.diplom.group40.social.network.impl.mapper.task;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import ru.skillbox.diplom.group40.social.network.api.dto.task.TaskDTO;
import ru.skillbox.diplom.group40.social.network.domain.task.Task;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    //    @Mapping(target = "rating", ignore = true)
    @Mappings({
//            @Mapping(target = "isDeleted", source = "isDeleted", defaultValue = "false"),
            @Mapping(target = "status", source = "status", defaultValue = "PENDING")})
    Task toTask(TaskDTO taskDTO);

    TaskDTO toTaskDTO(Task task);

}
