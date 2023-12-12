package ru.skillbox.diplom.group40.social.network.impl.mapper.post;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.skillbox.diplom.group40.social.network.api.dto.base.BaseDto;
import ru.skillbox.diplom.group40.social.network.api.dto.post.LikeDto;
import ru.skillbox.diplom.group40.social.network.domain.base.BaseEntity;
import ru.skillbox.diplom.group40.social.network.domain.post.Like;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-12T15:43:02+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class LikeMapperImpl implements LikeMapper {

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
    public LikeDto modelToDto(Like like) {
        if ( like == null ) {
            return null;
        }

        LikeDto likeDto = new LikeDto();

        if ( like.getId() != null ) {
            likeDto.setId( like.getId() );
        }
        if ( like.getIsDeleted() != null ) {
            likeDto.setIsDeleted( like.getIsDeleted() );
        }
        if ( like.getAuthorId() != null ) {
            likeDto.setAuthorId( like.getAuthorId() );
        }
        if ( like.getTime() != null ) {
            likeDto.setTime( like.getTime() );
        }
        if ( like.getItemId() != null ) {
            likeDto.setItemId( like.getItemId() );
        }
        if ( like.getType() != null ) {
            likeDto.setType( like.getType() );
        }
        if ( like.getReactionType() != null ) {
            likeDto.setReactionType( like.getReactionType() );
        }

        return likeDto;
    }

    @Override
    public Like dtoToModel(LikeDto likeDto) {
        if ( likeDto == null ) {
            return null;
        }

        Like like = new Like();

        if ( likeDto.getId() != null ) {
            like.setId( likeDto.getId() );
        }
        if ( likeDto.getIsDeleted() != null ) {
            like.setIsDeleted( likeDto.getIsDeleted() );
        }
        if ( likeDto.getAuthorId() != null ) {
            like.setAuthorId( likeDto.getAuthorId() );
        }
        if ( likeDto.getTime() != null ) {
            like.setTime( likeDto.getTime() );
        }
        if ( likeDto.getItemId() != null ) {
            like.setItemId( likeDto.getItemId() );
        }
        if ( likeDto.getType() != null ) {
            like.setType( likeDto.getType() );
        }
        if ( likeDto.getReactionType() != null ) {
            like.setReactionType( likeDto.getReactionType() );
        }

        return like;
    }
}
