package ru.skillbox.diplom.group40.social.network.domain.account;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import ru.skillbox.diplom.group40.social.network.api.dto.account.StatusCode;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Account.class)
public abstract class Account_ extends ru.skillbox.diplom.group40.social.network.domain.user.User_ {

	public static volatile SingularAttribute<Account, String> country;
	public static volatile SingularAttribute<Account, String> city;
	public static volatile SingularAttribute<Account, String> profileCover;
	public static volatile SingularAttribute<Account, String> about;
	public static volatile SingularAttribute<Account, Boolean> isBlocked;
	public static volatile SingularAttribute<Account, String> photo;
	public static volatile SingularAttribute<Account, Boolean> isOnline;
	public static volatile SingularAttribute<Account, LocalDateTime> birthDate;
	public static volatile SingularAttribute<Account, LocalDateTime> deletionTimestamp;
	public static volatile SingularAttribute<Account, String> emojiStatus;
	public static volatile SingularAttribute<Account, String> phone;
	public static volatile SingularAttribute<Account, String> messagePermission;
	public static volatile SingularAttribute<Account, LocalDateTime> lastOnlineTime;
	public static volatile SingularAttribute<Account, StatusCode> statusCode;

	public static final String COUNTRY = "country";
	public static final String CITY = "city";
	public static final String PROFILE_COVER = "profileCover";
	public static final String ABOUT = "about";
	public static final String IS_BLOCKED = "isBlocked";
	public static final String PHOTO = "photo";
	public static final String IS_ONLINE = "isOnline";
	public static final String BIRTH_DATE = "birthDate";
	public static final String DELETION_TIMESTAMP = "deletionTimestamp";
	public static final String EMOJI_STATUS = "emojiStatus";
	public static final String PHONE = "phone";
	public static final String MESSAGE_PERMISSION = "messagePermission";
	public static final String LAST_ONLINE_TIME = "lastOnlineTime";
	public static final String STATUS_CODE = "statusCode";

}

