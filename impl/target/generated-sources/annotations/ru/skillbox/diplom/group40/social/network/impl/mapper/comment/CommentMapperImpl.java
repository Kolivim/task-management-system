package ru.skillbox.diplom.group40.social.network.impl.mapper.comment;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.skillbox.diplom.group40.social.network.api.dto.base.BaseDto;
import ru.skillbox.diplom.group40.social.network.api.dto.comment.CommentDto;
import ru.skillbox.diplom.group40.social.network.domain.base.BaseEntity;
import ru.skillbox.diplom.group40.social.network.domain.comment.Comment;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-17T21:38:35+0300",
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
        if ( comment.getAuthorId() != null ) {
            commentDto.setAuthorId( comment.getAuthorId() );
        }
        if ( comment.getCommentText() != null ) {
            commentDto.setCommentText( comment.getCommentText() );
        }

        return commentDto;
    }

    @Override
    public Comment dtoToModel(CommentDto commentDto) {
        if ( commentDto == null ) {
            return null;
        }

        Comment comment = new Comment();

        if ( commentDto.getIsDeleted() != null ) {
            comment.setIsDeleted( commentDto.getIsDeleted() );
        }
        else {
            comment.setIsDeleted( false );
        }
        if ( commentDto.getId() != null ) {
            comment.setId( commentDto.getId() );
        }
        if ( commentDto.getAuthorId() != null ) {
            comment.setAuthorId( commentDto.getAuthorId() );
        }
        if ( commentDto.getCommentText() != null ) {
            comment.setCommentText( commentDto.getCommentText() );
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
        if ( commentDto.getAuthorId() != null ) {
            comment.setAuthorId( commentDto.getAuthorId() );
        }
        if ( commentDto.getCommentText() != null ) {
            comment.setCommentText( commentDto.getCommentText() );
        }

        return comment;
    }
}
