package ru.kolivim.myproject.task.management.system.domain.task;

import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.UUID;
import javax.annotation.processing.Generated;
import ru.kolivim.myproject.task.management.system.api.dto.task.PriorityType;
import ru.kolivim.myproject.task.management.system.api.dto.task.StatusType;
import ru.kolivim.myproject.task.management.system.domain.comment.Comment;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Task.class)
public abstract class Task_ extends ru.kolivim.myproject.task.management.system.domain.base.BaseEntity_ {

	public static volatile ListAttribute<Task, Comment> comments;
	public static volatile SingularAttribute<Task, UUID> executorId;
	public static volatile SingularAttribute<Task, String> description;
	public static volatile SingularAttribute<Task, PriorityType> priority;
	public static volatile SingularAttribute<Task, String> title;
	public static volatile SingularAttribute<Task, UUID> authorId;
	public static volatile SingularAttribute<Task, StatusType> status;

	public static final String COMMENTS = "comments";
	public static final String EXECUTOR_ID = "executorId";
	public static final String DESCRIPTION = "description";
	public static final String PRIORITY = "priority";
	public static final String TITLE = "title";
	public static final String AUTHOR_ID = "authorId";
	public static final String STATUS = "status";

}

