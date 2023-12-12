package ru.skillbox.diplom.group40.social.network.impl.mapper.tag;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.skillbox.diplom.group40.social.network.api.dto.tag.TagDto;
import ru.skillbox.diplom.group40.social.network.domain.tag.Tag;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-12T15:24:13+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class TagMapperImpl implements TagMapper {

    @Override
    public TagDto toDto(Tag tag) {
        if ( tag == null ) {
            return null;
        }

        TagDto tagDto = new TagDto();

        if ( tag.getId() != null ) {
            tagDto.setId( tag.getId() );
        }
        if ( tag.getIsDeleted() != null ) {
            tagDto.setIsDeleted( tag.getIsDeleted() );
        }
        if ( tag.getName() != null ) {
            tagDto.setName( tag.getName() );
        }

        return tagDto;
    }

    @Override
    public Tag toTag(TagDto dto) {
        if ( dto == null ) {
            return null;
        }

        Tag tag = new Tag();

        if ( dto.getId() != null ) {
            tag.setId( dto.getId() );
        }
        if ( dto.getIsDeleted() != null ) {
            tag.setIsDeleted( dto.getIsDeleted() );
        }
        if ( dto.getName() != null ) {
            tag.setName( dto.getName() );
        }

        return tag;
    }
}
