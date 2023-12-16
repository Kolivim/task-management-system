package ru.skillbox.diplom.group40.social.network.impl.mapper.base;

import javax.annotation.processing.Generated;
import ru.skillbox.diplom.group40.social.network.api.dto.base.BaseDto;
import ru.skillbox.diplom.group40.social.network.domain.base.BaseEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-16T14:43:07+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
public class BaseMapperImpl implements BaseMapper {

    @Override
    public BaseDto modelToDto(BaseEntity baseEntity) {
        if ( baseEntity == null ) {
            return null;
        }

        BaseDto baseDto = new BaseDto();

        baseDto.setId( baseEntity.getId() );
        baseDto.setIsDeleted( baseEntity.getIsDeleted() );

        return baseDto;
    }

    @Override
    public BaseEntity dtoToModel(BaseDto baseDto) {
        if ( baseDto == null ) {
            return null;
        }

        BaseEntity baseEntity = new BaseEntity();

        baseEntity.setId( baseDto.getId() );
        baseEntity.setIsDeleted( baseDto.getIsDeleted() );

        return baseEntity;
    }
}
