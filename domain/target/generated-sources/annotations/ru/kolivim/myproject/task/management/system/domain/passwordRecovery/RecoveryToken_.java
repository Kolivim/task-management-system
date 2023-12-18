package ru.kolivim.myproject.task.management.system.domain.passwordRecovery;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import ru.kolivim.myproject.task.management.system.domain.account.Account;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RecoveryToken.class)
public abstract class RecoveryToken_ extends ru.kolivim.myproject.task.management.system.domain.base.BaseEntity_ {

	public static volatile SingularAttribute<RecoveryToken, LocalDateTime> expirationTime;
	public static volatile SingularAttribute<RecoveryToken, Account> account;

	public static final String EXPIRATION_TIME = "expirationTime";
	public static final String ACCOUNT = "account";

}

