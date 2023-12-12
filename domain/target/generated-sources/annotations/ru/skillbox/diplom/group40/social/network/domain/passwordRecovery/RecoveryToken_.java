package ru.skillbox.diplom.group40.social.network.domain.passwordRecovery;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import ru.skillbox.diplom.group40.social.network.domain.account.Account;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RecoveryToken.class)
public abstract class RecoveryToken_ extends ru.skillbox.diplom.group40.social.network.domain.base.BaseEntity_ {

	public static volatile SingularAttribute<RecoveryToken, LocalDateTime> expirationTime;
	public static volatile SingularAttribute<RecoveryToken, Account> account;

	public static final String EXPIRATION_TIME = "expirationTime";
	public static final String ACCOUNT = "account";

}

