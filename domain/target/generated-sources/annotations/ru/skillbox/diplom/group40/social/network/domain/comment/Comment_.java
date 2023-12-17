package ru.skillbox.diplom.group40.social.network.domain.comment;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.UUID;
import javax.annotation.processing.Generated;
import ru.skillbox.diplom.group40.social.network.domain.task.Task;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Comment.class)
public abstract class Comment_ extends ru.skillbox.diplom.group40.social.network.domain.base.BaseEntity_ {

	public static volatile SingularAttribute<Comment, Task> task;
	public static volatile SingularAttribute<Comment, UUID> authorId;
	public static volatile SingularAttribute<Comment, String> commentText;

	public static final String TASK = "task";
	public static final String AUTHOR_ID = "authorId";
	public static final String COMMENT_TEXT = "commentText";

}

