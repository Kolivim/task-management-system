package ru.skillbox.diplom.group40.social.network.domain.geo;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(City.class)
public abstract class City_ extends ru.skillbox.diplom.group40.social.network.domain.base.BaseEntity_ {

	public static volatile SingularAttribute<City, Country> country;
	public static volatile SingularAttribute<City, String> title;

	public static final String COUNTRY = "country";
	public static final String TITLE = "title";

}

