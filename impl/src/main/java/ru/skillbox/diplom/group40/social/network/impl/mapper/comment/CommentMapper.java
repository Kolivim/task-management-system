package ru.skillbox.diplom.group40.social.network.impl.mapper.comment;

import org.mapstruct.*;
import org.springframework.stereotype.Component;
import ru.skillbox.diplom.group40.social.network.api.dto.comment.CommentDto;
import ru.skillbox.diplom.group40.social.network.domain.comment.Comment;
import ru.skillbox.diplom.group40.social.network.impl.mapper.base.BaseMapper;

@Component
@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface CommentMapper extends BaseMapper {
    CommentDto modelToDto(Comment comment);

    @Mappings({
            @Mapping(target = "isDeleted", source = "isDeleted", defaultValue = "false")})
    Comment dtoToModel(CommentDto commentDto);

    Comment dtoToModel(CommentDto commentDto, @MappingTarget Comment comment);

}
