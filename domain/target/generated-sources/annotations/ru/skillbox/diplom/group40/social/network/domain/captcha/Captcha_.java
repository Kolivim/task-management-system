package ru.skillbox.diplom.group40.social.network.domain.captcha;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Captcha.class)
public abstract class Captcha_ extends ru.skillbox.diplom.group40.social.network.domain.base.BaseEntity_ {

	public static volatile SingularAttribute<Captcha, String> answer;
	public static volatile SingularAttribute<Captcha, LocalDateTime> expirationTime;

	public static final String ANSWER = "answer";
	public static final String EXPIRATION_TIME = "expirationTime";

}

