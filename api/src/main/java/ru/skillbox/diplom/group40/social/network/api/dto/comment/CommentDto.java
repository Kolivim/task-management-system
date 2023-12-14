package ru.skillbox.diplom.group40.social.network.api.dto.comment;

import lombok.Data;
import ru.skillbox.diplom.group40.social.network.api.dto.base.BaseDto;

import java.util.UUID;

@Data
public class CommentDto extends BaseDto {

    private UUID authorId;
    private String commentText;
    private UUID taskId;

}