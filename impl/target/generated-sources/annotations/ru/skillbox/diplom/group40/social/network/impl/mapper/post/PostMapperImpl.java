package ru.skillbox.diplom.group40.social.network.impl.mapper.post;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.skillbox.diplom.group40.social.network.api.dto.post.PostDto;
import ru.skillbox.diplom.group40.social.network.domain.post.Post;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-12T16:01:05+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class PostMapperImpl implements PostMapper {

    @Override
    public Post toPost(PostDto dto) {
        if ( dto == null ) {
            return null;
        }

        Post post = new Post();

        if ( dto.getId() != null ) {
            post.setId( dto.getId() );
        }
        if ( dto.getIsDeleted() != null ) {
            post.setIsDeleted( dto.getIsDeleted() );
        }
        if ( dto.getTime() != null ) {
            post.setTime( dto.getTime() );
        }
        if ( dto.getTimeChanged() != null ) {
            post.setTimeChanged( dto.getTimeChanged() );
        }
        if ( dto.getAuthorId() != null ) {
            post.setAuthorId( dto.getAuthorId() );
        }
        if ( dto.getTitle() != null ) {
            post.setTitle( dto.getTitle() );
        }
        if ( dto.getType() != null ) {
            post.setType( dto.getType() );
        }
        if ( dto.getPostText() != null ) {
            post.setPostText( dto.getPostText() );
        }
        if ( dto.getIsBlocked() != null ) {
            post.setIsBlocked( dto.getIsBlocked() );
        }
        if ( dto.getCommentsCount() != null ) {
            post.setCommentsCount( dto.getCommentsCount() );
        }
        if ( dto.getReactionType() != null ) {
            post.setReactionType( dto.getReactionType() );
        }
        if ( dto.getMyReaction() != null ) {
            post.setMyReaction( dto.getMyReaction() );
        }
        if ( dto.getLikeAmount() != null ) {
            post.setLikeAmount( dto.getLikeAmount() );
        }
        if ( dto.getMyLike() != null ) {
            post.setMyLike( dto.getMyLike() );
        }
        if ( dto.getImagePath() != null ) {
            post.setImagePath( dto.getImagePath() );
        }
        if ( dto.getPublishDate() != null ) {
            post.setPublishDate( dto.getPublishDate() );
        }

        return post;
    }

    @Override
    public PostDto toDto(Post post) {
        if ( post == null ) {
            return null;
        }

        PostDto postDto = new PostDto();

        if ( post.getId() != null ) {
            postDto.setId( post.getId() );
        }
        if ( post.getIsDeleted() != null ) {
            postDto.setIsDeleted( post.getIsDeleted() );
        }
        if ( post.getTime() != null ) {
            postDto.setTime( post.getTime() );
        }
        if ( post.getTimeChanged() != null ) {
            postDto.setTimeChanged( post.getTimeChanged() );
        }
        if ( post.getAuthorId() != null ) {
            postDto.setAuthorId( post.getAuthorId() );
        }
        if ( post.getTitle() != null ) {
            postDto.setTitle( post.getTitle() );
        }
        if ( post.getType() != null ) {
            postDto.setType( post.getType() );
        }
        if ( post.getPostText() != null ) {
            postDto.setPostText( post.getPostText() );
        }
        if ( post.getIsBlocked() != null ) {
            postDto.setIsBlocked( post.getIsBlocked() );
        }
        if ( post.getCommentsCount() != null ) {
            postDto.setCommentsCount( post.getCommentsCount() );
        }
        if ( post.getReactionType() != null ) {
            postDto.setReactionType( post.getReactionType() );
        }
        if ( post.getMyReaction() != null ) {
            postDto.setMyReaction( post.getMyReaction() );
        }
        if ( post.getLikeAmount() != null ) {
            postDto.setLikeAmount( post.getLikeAmount() );
        }
        if ( post.getMyLike() != null ) {
            postDto.setMyLike( post.getMyLike() );
        }
        if ( post.getImagePath() != null ) {
            postDto.setImagePath( post.getImagePath() );
        }
        if ( post.getPublishDate() != null ) {
            postDto.setPublishDate( post.getPublishDate() );
        }

        return postDto;
    }

    @Override
    public Post toPost(PostDto dto, Post post) {
        if ( dto == null ) {
            return post;
        }

        if ( dto.getId() != null ) {
            post.setId( dto.getId() );
        }
        if ( dto.getIsDeleted() != null ) {
            post.setIsDeleted( dto.getIsDeleted() );
        }
        if ( dto.getTime() != null ) {
            post.setTime( dto.getTime() );
        }
        if ( dto.getTimeChanged() != null ) {
            post.setTimeChanged( dto.getTimeChanged() );
        }
        if ( dto.getAuthorId() != null ) {
            post.setAuthorId( dto.getAuthorId() );
        }
        if ( dto.getTitle() != null ) {
            post.setTitle( dto.getTitle() );
        }
        if ( dto.getType() != null ) {
            post.setType( dto.getType() );
        }
        if ( dto.getPostText() != null ) {
            post.setPostText( dto.getPostText() );
        }
        if ( dto.getIsBlocked() != null ) {
            post.setIsBlocked( dto.getIsBlocked() );
        }
        if ( dto.getCommentsCount() != null ) {
            post.setCommentsCount( dto.getCommentsCount() );
        }
        if ( dto.getReactionType() != null ) {
            post.setReactionType( dto.getReactionType() );
        }
        if ( dto.getMyReaction() != null ) {
            post.setMyReaction( dto.getMyReaction() );
        }
        if ( dto.getLikeAmount() != null ) {
            post.setLikeAmount( dto.getLikeAmount() );
        }
        if ( dto.getMyLike() != null ) {
            post.setMyLike( dto.getMyLike() );
        }
        if ( dto.getImagePath() != null ) {
            post.setImagePath( dto.getImagePath() );
        }
        if ( dto.getPublishDate() != null ) {
            post.setPublishDate( dto.getPublishDate() );
        }

        return post;
    }
}
