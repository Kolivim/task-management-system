package ru.skillbox.diplom.group40.social.network.domain.post;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.annotation.processing.Generated;
import ru.skillbox.diplom.group40.social.network.api.dto.post.LikeType;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Like.class)
public abstract class Like_ extends ru.skillbox.diplom.group40.social.network.domain.base.BaseEntity_ {

	public static volatile SingularAttribute<Like, UUID> itemId;
	public static volatile SingularAttribute<Like, String> reactionType;
	public static volatile SingularAttribute<Like, LocalDateTime> time;
	public static volatile SingularAttribute<Like, UUID> authorId;
	public static volatile SingularAttribute<Like, LikeType> type;

	public static final String ITEM_ID = "itemId";
	public static final String REACTION_TYPE = "reactionType";
	public static final String TIME = "time";
	public static final String AUTHOR_ID = "authorId";
	public static final String TYPE = "type";

}

