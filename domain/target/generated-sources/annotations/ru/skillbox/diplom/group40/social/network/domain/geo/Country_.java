package ru.skillbox.diplom.group40.social.network.domain.geo;

import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Country.class)
public abstract class Country_ extends ru.skillbox.diplom.group40.social.network.domain.base.BaseEntity_ {

	public static volatile ListAttribute<Country, City> cities;
	public static volatile SingularAttribute<Country, String> title;

	public static final String CITIES = "cities";
	public static final String TITLE = "title";

}

