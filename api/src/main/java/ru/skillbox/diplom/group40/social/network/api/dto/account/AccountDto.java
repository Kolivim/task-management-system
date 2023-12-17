package ru.skillbox.diplom.group40.social.network.api.dto.account;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import ru.skillbox.diplom.group40.social.network.api.dto.base.BaseDto;

import java.time.LocalDateTime;

@Data
public class AccountDto extends BaseDto {

    @Schema(description = "Имя пользователя")
    private String firstName;
    @Schema(description = "Фамилия пользователя")
    private String lastName;
    @Schema(description = "Email")
    private String email;
    @Schema(description = "Пароль")
    private String password;
    @Schema(description = "Телефон")
    private String phone;

    private String photo;

    private String profileCover;
    @Schema(description = "О пользователе")
    private String about;

    private String city;

    private String country;
    private LocalDateTime regDate;

    //private Frend statusCode;

    private LocalDateTime birthDate;

    private String messagePermission;

    private LocalDateTime lastOnlineTime;

    private boolean isOnline;
    @Schema(description = "Метка блокировки пользователя")
    private boolean isBlocked;

    private String emojiStatus;

    private LocalDateTime deletionTimestamp;

    private LocalDateTime createdDate;

    private LocalDateTime lastModifiedDate;


}
