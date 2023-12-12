package ru.skillbox.diplom.group40.social.network.domain.notification;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.ZonedDateTime;
import java.util.UUID;
import javax.annotation.processing.Generated;
import ru.skillbox.diplom.group40.social.network.api.dto.notification.Status;
import ru.skillbox.diplom.group40.social.network.api.dto.notification.Type;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EventNotification.class)
public abstract class EventNotification_ extends ru.skillbox.diplom.group40.social.network.domain.base.BaseEntity_ {

	public static volatile SingularAttribute<EventNotification, UUID> receiverId;
	public static volatile SingularAttribute<EventNotification, ZonedDateTime> sentTime;
	public static volatile SingularAttribute<EventNotification, Type> notificationType;
	public static volatile SingularAttribute<EventNotification, UUID> authorId;
	public static volatile SingularAttribute<EventNotification, String> content;
	public static volatile SingularAttribute<EventNotification, Status> status;

	public static final String RECEIVER_ID = "receiverId";
	public static final String SENT_TIME = "sentTime";
	public static final String NOTIFICATION_TYPE = "notificationType";
	public static final String AUTHOR_ID = "authorId";
	public static final String CONTENT = "content";
	public static final String STATUS = "status";

}

