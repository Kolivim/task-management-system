package ru.skillbox.diplom.group40.social.network.domain.task;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.skillbox.diplom.group40.social.network.domain.base.BaseEntity;

import java.util.UUID;
@Table (name = "comment")
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Comment extends BaseEntity {
    @Column (name = "author_id")
    private UUID authorId;
    @Column (name = "comment_text")
    private String commentText;
    @Column (name = "task_id")
    private UUID taskId;
}
