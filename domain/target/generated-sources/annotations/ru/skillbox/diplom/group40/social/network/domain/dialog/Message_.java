package ru.skillbox.diplom.group40.social.network.domain.dialog;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.annotation.processing.Generated;
import ru.skillbox.diplom.group40.social.network.api.dto.dialog.ReadStatus;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Message.class)
public abstract class Message_ extends ru.skillbox.diplom.group40.social.network.domain.base.BaseEntity_ {

	public static volatile SingularAttribute<Message, ReadStatus> readStatus;
	public static volatile SingularAttribute<Message, String> messageText;
	public static volatile SingularAttribute<Message, UUID> conversationPartner2;
	public static volatile SingularAttribute<Message, UUID> conversationPartner1;
	public static volatile SingularAttribute<Message, LocalDateTime> time;
	public static volatile SingularAttribute<Message, UUID> dialogId;

	public static final String READ_STATUS = "readStatus";
	public static final String MESSAGE_TEXT = "messageText";
	public static final String CONVERSATION_PARTNER2 = "conversationPartner2";
	public static final String CONVERSATION_PARTNER1 = "conversationPartner1";
	public static final String TIME = "time";
	public static final String DIALOG_ID = "dialogId";

}

