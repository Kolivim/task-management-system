package ru.skillbox.diplom.group40.social.network.domain.notification;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Settings.class)
public abstract class Settings_ extends ru.skillbox.diplom.group40.social.network.domain.base.BaseEntity_ {

	public static volatile SingularAttribute<Settings, Boolean> enableMessage;
	public static volatile SingularAttribute<Settings, Boolean> enableFriendBirthday;
	public static volatile SingularAttribute<Settings, UUID> accountId;
	public static volatile SingularAttribute<Settings, Boolean> enablePostComment;
	public static volatile SingularAttribute<Settings, Boolean> enablePost;
	public static volatile SingularAttribute<Settings, Boolean> enableFriendRequest;
	public static volatile SingularAttribute<Settings, Boolean> enableCommentComment;
	public static volatile SingularAttribute<Settings, Boolean> enableLike;
	public static volatile SingularAttribute<Settings, Boolean> enableSendEmailMessage;

	public static final String ENABLE_MESSAGE = "enableMessage";
	public static final String ENABLE_FRIEND_BIRTHDAY = "enableFriendBirthday";
	public static final String ACCOUNT_ID = "accountId";
	public static final String ENABLE_POST_COMMENT = "enablePostComment";
	public static final String ENABLE_POST = "enablePost";
	public static final String ENABLE_FRIEND_REQUEST = "enableFriendRequest";
	public static final String ENABLE_COMMENT_COMMENT = "enableCommentComment";
	public static final String ENABLE_LIKE = "enableLike";
	public static final String ENABLE_SEND_EMAIL_MESSAGE = "enableSendEmailMessage";

}

