package ru.kolivim.myproject.task.management.system.domain.role;

import jakarta.persistence.metamodel.SetAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;
import ru.kolivim.myproject.task.management.system.domain.user.User;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Role.class)
public abstract class Role_ extends ru.kolivim.myproject.task.management.system.domain.base.BaseEntity_ {

	public static volatile SingularAttribute<Role, String> role;
	public static volatile SetAttribute<Role, User> users;

	public static final String ROLE = "role";
	public static final String USERS = "users";

}

