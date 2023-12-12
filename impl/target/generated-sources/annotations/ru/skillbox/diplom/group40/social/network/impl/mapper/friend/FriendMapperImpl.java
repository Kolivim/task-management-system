package ru.skillbox.diplom.group40.social.network.impl.mapper.friend;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.skillbox.diplom.group40.social.network.api.dto.friend.FriendDto;
import ru.skillbox.diplom.group40.social.network.domain.friend.Friend;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-12T15:49:19+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class FriendMapperImpl implements FriendMapper {

    @Override
    public FriendDto toDto(Friend friend) {
        if ( friend == null ) {
            return null;
        }

        FriendDto friendDto = new FriendDto();

        friendDto.setFriendId( friend.getAccountTo() );
        friendDto.setId( friend.getId() );
        friendDto.setIsDeleted( friend.getIsDeleted() );
        friendDto.setStatusCode( friend.getStatusCode() );
        friendDto.setPreviousStatusCode( friend.getPreviousStatusCode() );
        friendDto.setRating( friend.getRating() );

        return friendDto;
    }
}
