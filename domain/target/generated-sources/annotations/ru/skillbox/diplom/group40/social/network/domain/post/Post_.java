package ru.skillbox.diplom.group40.social.network.domain.post;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.annotation.processing.Generated;
import ru.skillbox.diplom.group40.social.network.api.dto.post.Type;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Post.class)
public abstract class Post_ extends ru.skillbox.diplom.group40.social.network.domain.base.BaseEntity_ {

	public static volatile SingularAttribute<Post, String> imagePath;
	public static volatile SingularAttribute<Post, Boolean> isBlocked;
	public static volatile SingularAttribute<Post, LocalDateTime> publishDate;
	public static volatile SingularAttribute<Post, UUID> authorId;
	public static volatile SingularAttribute<Post, String> title;
	public static volatile SingularAttribute<Post, Type> type;
	public static volatile SingularAttribute<Post, Boolean> myLike;
	public static volatile SingularAttribute<Post, Integer> likeAmount;
	public static volatile SingularAttribute<Post, String> postText;
	public static volatile SingularAttribute<Post, String> reactionType;
	public static volatile SingularAttribute<Post, Integer> commentsCount;
	public static volatile SingularAttribute<Post, String> myReaction;
	public static volatile SingularAttribute<Post, LocalDateTime> timeChanged;
	public static volatile SingularAttribute<Post, LocalDateTime> time;

	public static final String IMAGE_PATH = "imagePath";
	public static final String IS_BLOCKED = "isBlocked";
	public static final String PUBLISH_DATE = "publishDate";
	public static final String AUTHOR_ID = "authorId";
	public static final String TITLE = "title";
	public static final String TYPE = "type";
	public static final String MY_LIKE = "myLike";
	public static final String LIKE_AMOUNT = "likeAmount";
	public static final String POST_TEXT = "postText";
	public static final String REACTION_TYPE = "reactionType";
	public static final String COMMENTS_COUNT = "commentsCount";
	public static final String MY_REACTION = "myReaction";
	public static final String TIME_CHANGED = "timeChanged";
	public static final String TIME = "time";

}

