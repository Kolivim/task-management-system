package ru.kolivim.myproject.task.management.system.impl.mapper.base;

import javax.annotation.processing.Generated;
import ru.kolivim.myproject.task.management.system.api.dto.base.BaseDto;
import ru.kolivim.myproject.task.management.system.domain.base.BaseEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-18T08:22:06+0300",
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
