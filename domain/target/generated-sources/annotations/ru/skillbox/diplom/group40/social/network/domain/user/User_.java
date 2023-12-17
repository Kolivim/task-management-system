package ru.skillbox.diplom.group40.social.network.domain.user;

import jakarta.persistence.metamodel.SetAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import ru.skillbox.diplom.group40.social.network.domain.role.Role;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ extends ru.skillbox.diplom.group40.social.network.domain.base.audit.BaseAuditedEntity_ {

	public static volatile SingularAttribute<User, String> firstName;
	public static volatile SingularAttribute<User, String> lastName;
	public static volatile SingularAttribute<User, String> password;
	public static volatile SetAttribute<User, Role> roles;
	public static volatile SingularAttribute<User, LocalDateTime> registrationDate;
	public static volatile SingularAttribute<User, String> email;

	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String PASSWORD = "password";
	public static final String ROLES = "roles";
	public static final String REGISTRATION_DATE = "registrationDate";
	public static final String EMAIL = "email";

}

