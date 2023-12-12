package ru.skillbox.diplom.group40.social.network.domain.task;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.UUID;
import javax.annotation.processing.Generated;
import ru.skillbox.diplom.group40.social.network.api.dto.task.PriorityType;
import ru.skillbox.diplom.group40.social.network.api.dto.task.StatusType;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Task.class)
public abstract class Task_ extends ru.skillbox.diplom.group40.social.network.domain.base.BaseEntity_ {

	public static volatile SingularAttribute<Task, UUID> itemId;
	public static volatile SingularAttribute<Task, UUID> executorId;
	public static volatile SingularAttribute<Task, String> description;
	public static volatile SingularAttribute<Task, String> comment;
	public static volatile SingularAttribute<Task, PriorityType> priority;
	public static volatile SingularAttribute<Task, String> title;
	public static volatile SingularAttribute<Task, UUID> authorId;
	public static volatile SingularAttribute<Task, StatusType> status;

	public static final String ITEM_ID = "itemId";
	public static final String EXECUTOR_ID = "executorId";
	public static final String DESCRIPTION = "description";
	public static final String COMMENT = "comment";
	public static final String PRIORITY = "priority";
	public static final String TITLE = "title";
	public static final String AUTHOR_ID = "authorId";
	public static final String STATUS = "status";

}

