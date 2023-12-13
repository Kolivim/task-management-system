package ru.skillbox.diplom.group40.social.network.api.dto.task;

import lombok.Data;
import ru.skillbox.diplom.group40.social.network.api.dto.base.BaseDto;

import java.util.UUID;

@Data
public class TaskSearchDTO extends BaseDto {

    private UUID authorId;

}
