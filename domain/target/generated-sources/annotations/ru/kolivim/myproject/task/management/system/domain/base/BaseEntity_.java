package ru.kolivim.myproject.task.management.system.domain.base;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(BaseEntity.class)
public abstract class BaseEntity_ {

	public static volatile SingularAttribute<BaseEntity, Boolean> isDeleted;
	public static volatile SingularAttribute<BaseEntity, UUID> id;

	public static final String IS_DELETED = "isDeleted";
	public static final String ID = "id";

}

