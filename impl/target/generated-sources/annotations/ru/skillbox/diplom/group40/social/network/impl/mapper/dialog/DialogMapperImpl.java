package ru.skillbox.diplom.group40.social.network.impl.mapper.dialog;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.skillbox.diplom.group40.social.network.api.dto.base.BaseDto;
import ru.skillbox.diplom.group40.social.network.api.dto.dialog.DialogDto;
import ru.skillbox.diplom.group40.social.network.api.dto.dialog.MessageDto;
import ru.skillbox.diplom.group40.social.network.domain.base.BaseEntity;
import ru.skillbox.diplom.group40.social.network.domain.dialog.Dialog;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-12T15:24:13+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class DialogMapperImpl implements DialogMapper {

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

    @Override
    public DialogDto mapMessageDtoToDialogDto(Dialog dialog, List<MessageDto> messageDtoList) {
        if ( dialog == null && messageDtoList == null ) {
            return null;
        }

        DialogDto dialogDto = new DialogDto();

        if ( dialog != null ) {
            dialogDto.setId( dialog.getId() );
            dialogDto.setIsDeleted( dialog.getIsDeleted() );
            dialogDto.setUnreadCount( dialog.getUnreadCount() );
            dialogDto.setConversationPartner1( dialog.getConversationPartner1() );
            dialogDto.setConversationPartner2( dialog.getConversationPartner2() );
        }
        List<MessageDto> list = messageDtoList;
        if ( list != null ) {
            dialogDto.setLastMessage( new ArrayList<MessageDto>( list ) );
        }

        return dialogDto;
    }
}
