package ru.skillbox.diplom.group40.social.network.api.dto.task;

import lombok.Data;
import ru.skillbox.diplom.group40.social.network.api.dto.base.BaseDto;
import ru.skillbox.diplom.group40.social.network.api.dto.comment.CommentDto;

import java.util.List;
import java.util.UUID;

@Data
public class TaskDTO  extends BaseDto {

    private StatusType status;

    private PriorityType priority;

    private String title;

    private String description;

//    private String comment;

    private UUID authorId;

    private UUID executorId;

    private List<CommentDto> comments;

}
