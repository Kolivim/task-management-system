package ru.skillbox.diplom.group40.social.network.domain.comment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;
import ru.skillbox.diplom.group40.social.network.domain.base.BaseEntity;
import ru.skillbox.diplom.group40.social.network.domain.task.Task;

import java.util.UUID;
@Table (name = "comment")
@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Comment extends BaseEntity {

    @Column (name = "author_id")
    private UUID authorId;

    @Column (name = "comment_text")
    private String commentText;

    @ManyToOne
//    @JoinColumn(name = "task_id", nullable = false)
    private Task task;

//    @Column (name = "task_id")
//    private UUID taskId;
}
