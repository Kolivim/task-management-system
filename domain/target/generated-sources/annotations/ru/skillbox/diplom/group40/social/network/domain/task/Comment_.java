package ru.skillbox.diplom.group40.social.network.domain.task;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Comment.class)
public abstract class Comment_ extends ru.skillbox.diplom.group40.social.network.domain.base.BaseEntity_ {

	public static volatile SingularAttribute<Comment, UUID> authorId;
	public static volatile SingularAttribute<Comment, String> commentText;
	public static volatile SingularAttribute<Comment, UUID> taskId;

	public static final String AUTHOR_ID = "authorId";
	public static final String COMMENT_TEXT = "commentText";
	public static final String TASK_ID = "taskId";

}

