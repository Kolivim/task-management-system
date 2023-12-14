package ru.skillbox.diplom.group40.social.network.domain.task;

import jakarta.persistence.*;
import lombok.*;
import ru.skillbox.diplom.group40.social.network.api.dto.task.PriorityType;
import ru.skillbox.diplom.group40.social.network.api.dto.task.StatusType;
import ru.skillbox.diplom.group40.social.network.domain.base.BaseEntity;
import ru.skillbox.diplom.group40.social.network.domain.comment.Comment;

import java.util.ArrayList;
import java.util.List;
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

//    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
//            CascadeType.DETACH, CascadeType.REFRESH}, fetch = FetchType.EAGER)
//    @JoinTable(
//            name = "task_comment",
////            joinColumns = @JoinColumn(name = "id"),
////            inverseJoinColumns = @JoinColumn(name = "task_id")
//            joinColumns = @JoinColumn(name="task_id", referencedColumnName="id"),
//            inverseJoinColumns = @JoinColumn(name="comment_id", referencedColumnName="id")
//    )
    @OneToMany(mappedBy = "task")
    private List<Comment> comments = new ArrayList<>();


    public void addComment(Comment comment){
        comment.setTask(this);
        this.comments.add(comment);

    }
    public void removeComment(Comment comment){
        comment.setTask(null);
        this.comments.remove(comment);
    }

}


