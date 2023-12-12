package ru.skillbox.diplom.group40.social.network.domain.post;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.annotation.processing.Generated;
import ru.skillbox.diplom.group40.social.network.api.dto.post.CommentType;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Comment.class)
public abstract class Comment_ extends ru.skillbox.diplom.group40.social.network.domain.base.BaseEntity_ {

	public static volatile SingularAttribute<Comment, Integer> likeAmount;
	public static volatile SingularAttribute<Comment, Integer> commentsCount;
	public static volatile SingularAttribute<Comment, String> imagePath;
	public static volatile SingularAttribute<Comment, CommentType> commentType;
	public static volatile SingularAttribute<Comment, Boolean> isBlocked;
	public static volatile SingularAttribute<Comment, LocalDateTime> timeChanged;
	public static volatile SingularAttribute<Comment, LocalDateTime> time;
	public static volatile SingularAttribute<Comment, UUID> postId;
	public static volatile SingularAttribute<Comment, UUID> authorId;
	public static volatile SingularAttribute<Comment, String> commentText;
	public static volatile SingularAttribute<Comment, UUID> parentId;
	public static volatile SingularAttribute<Comment, Boolean> myLike;

	public static final String LIKE_AMOUNT = "likeAmount";
	public static final String COMMENTS_COUNT = "commentsCount";
	public static final String IMAGE_PATH = "imagePath";
	public static final String COMMENT_TYPE = "commentType";
	public static final String IS_BLOCKED = "isBlocked";
	public static final String TIME_CHANGED = "timeChanged";
	public static final String TIME = "time";
	public static final String POST_ID = "postId";
	public static final String AUTHOR_ID = "authorId";
	public static final String COMMENT_TEXT = "commentText";
	public static final String PARENT_ID = "parentId";
	public static final String MY_LIKE = "myLike";

}

