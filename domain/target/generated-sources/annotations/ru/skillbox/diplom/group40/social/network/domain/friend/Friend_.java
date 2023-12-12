package ru.skillbox.diplom.group40.social.network.domain.friend;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.UUID;
import javax.annotation.processing.Generated;
import ru.skillbox.diplom.group40.social.network.api.dto.friend.StatusCode;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Friend.class)
public abstract class Friend_ extends ru.skillbox.diplom.group40.social.network.domain.base.BaseEntity_ {

	public static volatile SingularAttribute<Friend, UUID> accountTo;
	public static volatile SingularAttribute<Friend, StatusCode> previousStatusCode;
	public static volatile SingularAttribute<Friend, Integer> rating;
	public static volatile SingularAttribute<Friend, UUID> accountFrom;
	public static volatile SingularAttribute<Friend, StatusCode> statusCode;

	public static final String ACCOUNT_TO = "accountTo";
	public static final String PREVIOUS_STATUS_CODE = "previousStatusCode";
	public static final String RATING = "rating";
	public static final String ACCOUNT_FROM = "accountFrom";
	public static final String STATUS_CODE = "statusCode";

}

