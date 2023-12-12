package ru.skillbox.diplom.group40.social.network.domain.dialog;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Dialog.class)
public abstract class Dialog_ extends ru.skillbox.diplom.group40.social.network.domain.base.BaseEntity_ {

	public static volatile SingularAttribute<Dialog, UUID> conversationPartner2;
	public static volatile SingularAttribute<Dialog, UUID> conversationPartner1;
	public static volatile SingularAttribute<Dialog, UUID> lastMessage;
	public static volatile SingularAttribute<Dialog, Integer> unreadCount;

	public static final String CONVERSATION_PARTNER2 = "conversationPartner2";
	public static final String CONVERSATION_PARTNER1 = "conversationPartner1";
	public static final String LAST_MESSAGE = "lastMessage";
	public static final String UNREAD_COUNT = "unreadCount";

}

