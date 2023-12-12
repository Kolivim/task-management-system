package ru.skillbox.diplom.group40.social.network.impl.mapper.dialog;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.skillbox.diplom.group40.social.network.api.dto.base.BaseDto;
import ru.skillbox.diplom.group40.social.network.api.dto.dialog.MessageDto;
import ru.skillbox.diplom.group40.social.network.api.dto.dialog.MessageShortDto;
import ru.skillbox.diplom.group40.social.network.domain.base.BaseEntity;
import ru.skillbox.diplom.group40.social.network.domain.dialog.Message;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-12T15:49:19+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class MessageMapperImpl implements MessageMapper {

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
    public List<MessageDto> messagesToDto(List<Message> messageEntity) {
        if ( messageEntity == null ) {
            return null;
        }

        List<MessageDto> list = new ArrayList<MessageDto>( messageEntity.size() );
        for ( Message message : messageEntity ) {
            list.add( messageToDto( message ) );
        }

        return list;
    }

    @Override
    public MessageDto messageToDto(Message messageEntity) {
        if ( messageEntity == null ) {
            return null;
        }

        MessageDto messageDto = new MessageDto();

        messageDto.setId( messageEntity.getId() );
        messageDto.setIsDeleted( messageEntity.getIsDeleted() );
        messageDto.setTime( messageEntity.getTime() );
        messageDto.setConversationPartner1( messageEntity.getConversationPartner1() );
        messageDto.setConversationPartner2( messageEntity.getConversationPartner2() );
        messageDto.setMessageText( messageEntity.getMessageText() );
        messageDto.setReadStatus( messageEntity.getReadStatus() );
        messageDto.setDialogId( messageEntity.getDialogId() );

        return messageDto;
    }

    @Override
    public Message dtoToMessage(MessageDto messageDto) {
        if ( messageDto == null ) {
            return null;
        }

        Message message = new Message();

        message.setId( messageDto.getId() );
        message.setIsDeleted( messageDto.getIsDeleted() );
        message.setTime( messageDto.getTime() );
        message.setConversationPartner1( messageDto.getConversationPartner1() );
        message.setConversationPartner2( messageDto.getConversationPartner2() );
        message.setMessageText( messageDto.getMessageText() );
        message.setReadStatus( messageDto.getReadStatus() );
        message.setDialogId( messageDto.getDialogId() );

        return message;
    }

    @Override
    public MessageShortDto messageDtoToMessageShortDto(MessageDto messageDto) {
        if ( messageDto == null ) {
            return null;
        }

        MessageShortDto messageShortDto = new MessageShortDto();

        messageShortDto.setId( messageDto.getId() );
        messageShortDto.setIsDeleted( messageDto.getIsDeleted() );
        messageShortDto.setTime( messageDto.getTime() );
        messageShortDto.setConversationPartner1( messageDto.getConversationPartner1() );
        messageShortDto.setConversationPartner2( messageDto.getConversationPartner2() );
        messageShortDto.setMessageText( messageDto.getMessageText() );

        return messageShortDto;
    }
}
