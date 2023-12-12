package ru.skillbox.diplom.group40.social.network.impl.mapper.notification;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.skillbox.diplom.group40.social.network.api.dto.base.BaseDto;
import ru.skillbox.diplom.group40.social.network.api.dto.notification.EventNotificationDTO;
import ru.skillbox.diplom.group40.social.network.domain.base.BaseEntity;
import ru.skillbox.diplom.group40.social.network.domain.notification.EventNotification;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-04T16:41:09+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class NotificationMapperImpl implements NotificationMapper {

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
    public EventNotificationDTO modelToDto(EventNotification eventNotification) {
        if ( eventNotification == null ) {
            return null;
        }

        EventNotificationDTO eventNotificationDTO = new EventNotificationDTO();

        eventNotificationDTO.setId( eventNotification.getId() );
        eventNotificationDTO.setIsDeleted( eventNotification.getIsDeleted() );
        eventNotificationDTO.setAuthorId( eventNotification.getAuthorId() );
        eventNotificationDTO.setReceiverId( eventNotification.getReceiverId() );
        eventNotificationDTO.setNotificationType( eventNotification.getNotificationType() );
        eventNotificationDTO.setContent( eventNotification.getContent() );
        eventNotificationDTO.setStatus( eventNotification.getStatus() );
        eventNotificationDTO.setSentTime( eventNotification.getSentTime() );

        return eventNotificationDTO;
    }

    @Override
    public EventNotification dtoToModel(EventNotificationDTO eventNotificationDTO) {
        if ( eventNotificationDTO == null ) {
            return null;
        }

        EventNotification eventNotification = new EventNotification();

        eventNotification.setId( eventNotificationDTO.getId() );
        eventNotification.setIsDeleted( eventNotificationDTO.getIsDeleted() );
        eventNotification.setAuthorId( eventNotificationDTO.getAuthorId() );
        eventNotification.setReceiverId( eventNotificationDTO.getReceiverId() );
        eventNotification.setNotificationType( eventNotificationDTO.getNotificationType() );
        eventNotification.setContent( eventNotificationDTO.getContent() );
        eventNotification.setStatus( eventNotificationDTO.getStatus() );
        eventNotification.setSentTime( eventNotificationDTO.getSentTime() );

        return eventNotification;
    }
}
