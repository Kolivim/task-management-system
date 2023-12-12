package ru.skillbox.diplom.group40.social.network.impl.mapper.post;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.skillbox.diplom.group40.social.network.api.dto.base.BaseDto;
import ru.skillbox.diplom.group40.social.network.api.dto.post.CommentDto;
import ru.skillbox.diplom.group40.social.network.domain.base.BaseEntity;
import ru.skillbox.diplom.group40.social.network.domain.post.Comment;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-12T16:01:05+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class CommentMapperImpl implements CommentMapper {

    @Override
    public BaseDto modelToDto(BaseEntity baseEntity) {
        if ( baseEntity == null ) {
            return null;
        }

        BaseDto baseDto = new BaseDto();

        if ( baseEntity.getId() != null ) {
            baseDto.setId( baseEntity.getId() );
        }
        if ( baseEntity.getIsDeleted() != null ) {
            baseDto.setIsDeleted( baseEntity.getIsDeleted() );
        }

        return baseDto;
    }

    @Override
    public BaseEntity dtoToModel(BaseDto baseDto) {
        if ( baseDto == null ) {
            return null;
        }

        BaseEntity baseEntity = new BaseEntity();

        if ( baseDto.getId() != null ) {
            baseEntity.setId( baseDto.getId() );
        }
        if ( baseDto.getIsDeleted() != null ) {
            baseEntity.setIsDeleted( baseDto.getIsDeleted() );
        }

        return baseEntity;
    }

    @Override
    public CommentDto modelToDto(Comment comment) {
        if ( comment == null ) {
            return null;
        }

        CommentDto commentDto = new CommentDto();

        if ( comment.getId() != null ) {
            commentDto.setId( comment.getId() );
        }
        if ( comment.getIsDeleted() != null ) {
            commentDto.setIsDeleted( comment.getIsDeleted() );
        }
        if ( comment.getCommentType() != null ) {
            commentDto.setCommentType( comment.getCommentType() );
        }
        if ( comment.getTime() != null ) {
            commentDto.setTime( comment.getTime() );
        }
        if ( comment.getTimeChanged() != null ) {
            commentDto.setTimeChanged( comment.getTimeChanged() );
        }
        if ( comment.getAuthorId() != null ) {
            commentDto.setAuthorId( comment.getAuthorId() );
        }
        if ( comment.getParentId() != null ) {
            commentDto.setParentId( comment.getParentId() );
        }
        if ( comment.getCommentText() != null ) {
            commentDto.setCommentText( comment.getCommentText() );
        }
        if ( comment.getPostId() != null ) {
            commentDto.setPostId( comment.getPostId() );
        }
        if ( comment.getIsBlocked() != null ) {
            commentDto.setIsBlocked( comment.getIsBlocked() );
        }
        if ( comment.getLikeAmount() != null ) {
            commentDto.setLikeAmount( comment.getLikeAmount() );
        }
        if ( comment.getMyLike() != null ) {
            commentDto.setMyLike( comment.getMyLike() );
        }
        if ( comment.getCommentsCount() != null ) {
            commentDto.setCommentsCount( comment.getCommentsCount() );
        }
        if ( comment.getImagePath() != null ) {
            commentDto.setImagePath( comment.getImagePath() );
        }

        return commentDto;
    }

    @Override
    public Comment dtoToModel(CommentDto commentDto) {
        if ( commentDto == null ) {
            return null;
        }

        Comment comment = new Comment();

        if ( commentDto.getId() != null ) {
            comment.setId( commentDto.getId() );
        }
        if ( commentDto.getIsDeleted() != null ) {
            comment.setIsDeleted( commentDto.getIsDeleted() );
        }
        if ( commentDto.getCommentType() != null ) {
            comment.setCommentType( commentDto.getCommentType() );
        }
        if ( commentDto.getTime() != null ) {
            comment.setTime( commentDto.getTime() );
        }
        if ( commentDto.getTimeChanged() != null ) {
            comment.setTimeChanged( commentDto.getTimeChanged() );
        }
        if ( commentDto.getAuthorId() != null ) {
            comment.setAuthorId( commentDto.getAuthorId() );
        }
        if ( commentDto.getParentId() != null ) {
            comment.setParentId( commentDto.getParentId() );
        }
        if ( commentDto.getCommentText() != null ) {
            comment.setCommentText( commentDto.getCommentText() );
        }
        if ( commentDto.getPostId() != null ) {
            comment.setPostId( commentDto.getPostId() );
        }
        if ( commentDto.getIsBlocked() != null ) {
            comment.setIsBlocked( commentDto.getIsBlocked() );
        }
        if ( commentDto.getLikeAmount() != null ) {
            comment.setLikeAmount( commentDto.getLikeAmount() );
        }
        if ( commentDto.getMyLike() != null ) {
            comment.setMyLike( commentDto.getMyLike() );
        }
        if ( commentDto.getCommentsCount() != null ) {
            comment.setCommentsCount( commentDto.getCommentsCount() );
        }
        if ( commentDto.getImagePath() != null ) {
            comment.setImagePath( commentDto.getImagePath() );
        }

        return comment;
    }

    @Override
    public Comment dtoToModel(CommentDto commentDto, Comment comment) {
        if ( commentDto == null ) {
            return comment;
        }

        if ( commentDto.getId() != null ) {
            comment.setId( commentDto.getId() );
        }
        if ( commentDto.getIsDeleted() != null ) {
            comment.setIsDeleted( commentDto.getIsDeleted() );
        }
        if ( commentDto.getCommentType() != null ) {
            comment.setCommentType( commentDto.getCommentType() );
        }
        if ( commentDto.getTime() != null ) {
            comment.setTime( commentDto.getTime() );
        }
        if ( commentDto.getTimeChanged() != null ) {
            comment.setTimeChanged( commentDto.getTimeChanged() );
        }
        if ( commentDto.getAuthorId() != null ) {
            comment.setAuthorId( commentDto.getAuthorId() );
        }
        if ( commentDto.getParentId() != null ) {
            comment.setParentId( commentDto.getParentId() );
        }
        if ( commentDto.getCommentText() != null ) {
            comment.setCommentText( commentDto.getCommentText() );
        }
        if ( commentDto.getPostId() != null ) {
            comment.setPostId( commentDto.getPostId() );
        }
        if ( commentDto.getIsBlocked() != null ) {
            comment.setIsBlocked( commentDto.getIsBlocked() );
        }
        if ( commentDto.getLikeAmount() != null ) {
            comment.setLikeAmount( commentDto.getLikeAmount() );
        }
        if ( commentDto.getMyLike() != null ) {
            comment.setMyLike( commentDto.getMyLike() );
        }
        if ( commentDto.getCommentsCount() != null ) {
            comment.setCommentsCount( commentDto.getCommentsCount() );
        }
        if ( commentDto.getImagePath() != null ) {
            comment.setImagePath( commentDto.getImagePath() );
        }

        return comment;
    }
}
