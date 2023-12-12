package ru.skillbox.diplom.group40.social.network.impl.mapper.account;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.skillbox.diplom.group40.social.network.api.dto.account.AccountDto;
import ru.skillbox.diplom.group40.social.network.api.dto.auth.RegistrationDto;
import ru.skillbox.diplom.group40.social.network.domain.account.Account;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-13T00:42:18+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class MapperAccountImpl extends MapperAccount {

    @Override
    public AccountDto toDto(Account account) {
        if ( account == null ) {
            return null;
        }

        AccountDto accountDto = new AccountDto();

        if ( account.getId() != null ) {
            accountDto.setId( account.getId() );
        }
        if ( account.getIsDeleted() != null ) {
            accountDto.setIsDeleted( account.getIsDeleted() );
        }
        if ( account.getFirstName() != null ) {
            accountDto.setFirstName( account.getFirstName() );
        }
        if ( account.getLastName() != null ) {
            accountDto.setLastName( account.getLastName() );
        }
        if ( account.getEmail() != null ) {
            accountDto.setEmail( account.getEmail() );
        }
        if ( account.getPassword() != null ) {
            accountDto.setPassword( account.getPassword() );
        }
        if ( account.getPhone() != null ) {
            accountDto.setPhone( account.getPhone() );
        }
        if ( account.getPhoto() != null ) {
            accountDto.setPhoto( account.getPhoto() );
        }
        if ( account.getProfileCover() != null ) {
            accountDto.setProfileCover( account.getProfileCover() );
        }
        if ( account.getAbout() != null ) {
            accountDto.setAbout( account.getAbout() );
        }
        if ( account.getCity() != null ) {
            accountDto.setCity( account.getCity() );
        }
        if ( account.getCountry() != null ) {
            accountDto.setCountry( account.getCountry() );
        }
        if ( account.getBirthDate() != null ) {
            accountDto.setBirthDate( account.getBirthDate() );
        }
        if ( account.getMessagePermission() != null ) {
            accountDto.setMessagePermission( account.getMessagePermission() );
        }
        if ( account.getLastOnlineTime() != null ) {
            accountDto.setLastOnlineTime( account.getLastOnlineTime() );
        }
        accountDto.setOnline( account.isOnline() );
        accountDto.setBlocked( account.isBlocked() );
        if ( account.getEmojiStatus() != null ) {
            accountDto.setEmojiStatus( account.getEmojiStatus() );
        }
        if ( account.getDeletionTimestamp() != null ) {
            accountDto.setDeletionTimestamp( account.getDeletionTimestamp() );
        }
        if ( account.getCreatedDate() != null ) {
            accountDto.setCreatedDate( account.getCreatedDate() );
        }
        if ( account.getLastModifiedDate() != null ) {
            accountDto.setLastModifiedDate( account.getLastModifiedDate() );
        }

        return accountDto;
    }

    @Override
    public Account toEntity(AccountDto accountDto) {
        if ( accountDto == null ) {
            return null;
        }

        Account account = new Account();

        if ( accountDto.getId() != null ) {
            account.setId( accountDto.getId() );
        }
        if ( accountDto.getIsDeleted() != null ) {
            account.setIsDeleted( accountDto.getIsDeleted() );
        }
        if ( accountDto.getCreatedDate() != null ) {
            account.setCreatedDate( accountDto.getCreatedDate() );
        }
        if ( accountDto.getLastModifiedDate() != null ) {
            account.setLastModifiedDate( accountDto.getLastModifiedDate() );
        }
        if ( accountDto.getFirstName() != null ) {
            account.setFirstName( accountDto.getFirstName() );
        }
        if ( accountDto.getLastName() != null ) {
            account.setLastName( accountDto.getLastName() );
        }
        if ( accountDto.getEmail() != null ) {
            account.setEmail( accountDto.getEmail() );
        }
        if ( accountDto.getPassword() != null ) {
            account.setPassword( accountDto.getPassword() );
        }
        if ( accountDto.getPhone() != null ) {
            account.setPhone( accountDto.getPhone() );
        }
        if ( accountDto.getPhoto() != null ) {
            account.setPhoto( accountDto.getPhoto() );
        }
        if ( accountDto.getProfileCover() != null ) {
            account.setProfileCover( accountDto.getProfileCover() );
        }
        if ( accountDto.getAbout() != null ) {
            account.setAbout( accountDto.getAbout() );
        }
        if ( accountDto.getCity() != null ) {
            account.setCity( accountDto.getCity() );
        }
        if ( accountDto.getCountry() != null ) {
            account.setCountry( accountDto.getCountry() );
        }
        if ( accountDto.getBirthDate() != null ) {
            account.setBirthDate( accountDto.getBirthDate() );
        }
        if ( accountDto.getMessagePermission() != null ) {
            account.setMessagePermission( accountDto.getMessagePermission() );
        }
        if ( accountDto.getLastOnlineTime() != null ) {
            account.setLastOnlineTime( accountDto.getLastOnlineTime() );
        }
        account.setOnline( accountDto.isOnline() );
        account.setBlocked( accountDto.isBlocked() );
        if ( accountDto.getEmojiStatus() != null ) {
            account.setEmojiStatus( accountDto.getEmojiStatus() );
        }
        if ( accountDto.getDeletionTimestamp() != null ) {
            account.setDeletionTimestamp( accountDto.getDeletionTimestamp() );
        }

        return account;
    }

    @Override
    public Account rewriteEntity(Account account, AccountDto accountDto) {
        if ( accountDto == null ) {
            return account;
        }

        if ( accountDto.getId() != null ) {
            account.setId( accountDto.getId() );
        }
        if ( accountDto.getIsDeleted() != null ) {
            account.setIsDeleted( accountDto.getIsDeleted() );
        }
        if ( accountDto.getCreatedDate() != null ) {
            account.setCreatedDate( accountDto.getCreatedDate() );
        }
        if ( accountDto.getLastModifiedDate() != null ) {
            account.setLastModifiedDate( accountDto.getLastModifiedDate() );
        }
        if ( accountDto.getFirstName() != null ) {
            account.setFirstName( accountDto.getFirstName() );
        }
        if ( accountDto.getLastName() != null ) {
            account.setLastName( accountDto.getLastName() );
        }
        if ( accountDto.getEmail() != null ) {
            account.setEmail( accountDto.getEmail() );
        }
        if ( accountDto.getPassword() != null ) {
            account.setPassword( accountDto.getPassword() );
        }
        if ( accountDto.getPhone() != null ) {
            account.setPhone( accountDto.getPhone() );
        }
        if ( accountDto.getPhoto() != null ) {
            account.setPhoto( accountDto.getPhoto() );
        }
        if ( accountDto.getProfileCover() != null ) {
            account.setProfileCover( accountDto.getProfileCover() );
        }
        if ( accountDto.getAbout() != null ) {
            account.setAbout( accountDto.getAbout() );
        }
        if ( accountDto.getCity() != null ) {
            account.setCity( accountDto.getCity() );
        }
        if ( accountDto.getCountry() != null ) {
            account.setCountry( accountDto.getCountry() );
        }
        if ( accountDto.getBirthDate() != null ) {
            account.setBirthDate( accountDto.getBirthDate() );
        }
        if ( accountDto.getMessagePermission() != null ) {
            account.setMessagePermission( accountDto.getMessagePermission() );
        }
        if ( accountDto.getLastOnlineTime() != null ) {
            account.setLastOnlineTime( accountDto.getLastOnlineTime() );
        }
        account.setOnline( accountDto.isOnline() );
        account.setBlocked( accountDto.isBlocked() );
        if ( accountDto.getEmojiStatus() != null ) {
            account.setEmojiStatus( accountDto.getEmojiStatus() );
        }
        if ( accountDto.getDeletionTimestamp() != null ) {
            account.setDeletionTimestamp( accountDto.getDeletionTimestamp() );
        }

        return account;
    }

    @Override
    public AccountDto accountDtoFromRegistrationDto(RegistrationDto dto) {
        if ( dto == null ) {
            return null;
        }

        AccountDto accountDto = new AccountDto();

        if ( dto.getPassword1() != null ) {
            accountDto.setPassword( dto.getPassword1() );
        }
        if ( dto.getId() != null ) {
            accountDto.setId( dto.getId() );
        }
        if ( dto.getIsDeleted() != null ) {
            accountDto.setIsDeleted( dto.getIsDeleted() );
        }
        if ( dto.getFirstName() != null ) {
            accountDto.setFirstName( dto.getFirstName() );
        }
        if ( dto.getLastName() != null ) {
            accountDto.setLastName( dto.getLastName() );
        }
        if ( dto.getEmail() != null ) {
            accountDto.setEmail( dto.getEmail() );
        }

        return accountDto;
    }
}
