package ru.skillbox.diplom.group40.social.network.api.dto.task;

import lombok.Data;

import java.util.UUID;

@Data
public class TaskDTO {

    private StatusType status;

    private PriorityType priority;

    private String title;

    private String description;

//    private String comment;

    private UUID authorId;

    private UUID executorId;

}
