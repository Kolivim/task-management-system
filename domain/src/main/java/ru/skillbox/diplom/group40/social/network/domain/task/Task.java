package ru.skillbox.diplom.group40.social.network.domain.task;

import jakarta.persistence.*;
import lombok.*;
import ru.skillbox.diplom.group40.social.network.api.dto.post.LikeType;
import ru.skillbox.diplom.group40.social.network.api.dto.task.PriorityType;
import ru.skillbox.diplom.group40.social.network.api.dto.task.StatusType;
import ru.skillbox.diplom.group40.social.network.domain.base.BaseEntity;

import java.time.LocalDateTime;
import java.util.UUID;

@Table(name = "task")
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Task extends BaseEntity {

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusType status;

    @Column(name = "priority")
    @Enumerated(EnumType.STRING)
    private PriorityType priority;

    private UUID itemId;
    @Column(name = "title")
    String title;

    @Column(name = "description")
    String description;

    @Column(name = "comment")
    String comment;

    @Column(name = "author_id")
    private UUID authorId;

    @Column(name = "executor_id")
    private UUID executorId;

}
