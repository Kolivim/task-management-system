package ru.skillbox.diplom.group40.social.network.domain.task;

import jakarta.persistence.*;
import lombok.*;
import ru.skillbox.diplom.group40.social.network.api.dto.task.PriorityType;
import ru.skillbox.diplom.group40.social.network.api.dto.task.StatusType;
import ru.skillbox.diplom.group40.social.network.domain.base.BaseEntity;

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

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

//    @Column(name = "comment")
//    private String comment;

    @Column(name = "author_id")
    private UUID authorId;

    @Column(name = "executor_id")
    private UUID executorId;

}
