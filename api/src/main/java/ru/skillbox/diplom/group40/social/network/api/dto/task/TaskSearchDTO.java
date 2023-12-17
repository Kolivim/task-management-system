package ru.skillbox.diplom.group40.social.network.api.dto.task;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import ru.skillbox.diplom.group40.social.network.api.dto.base.BaseDto;

import java.util.UUID;

@Data
public class TaskSearchDTO extends BaseDto {

    @Schema(description = "Идентификатор автора задачи")
    private UUID authorId;

}
