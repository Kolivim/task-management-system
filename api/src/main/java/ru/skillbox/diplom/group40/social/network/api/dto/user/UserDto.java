package ru.skillbox.diplom.group40.social.network.api.dto.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import ru.skillbox.diplom.group40.social.network.api.dto.base.BaseDto;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class UserDto extends BaseDto {

    @Schema(description = "Идентификатор пользователя")
    private UUID id;
    @Schema(description = "Метка удаления")
    private boolean isDeleted;
    @Schema(description = "Имя пользователя")
    private String firstName;
    @Schema(description = "Фамилия пользователя")
    private String lastName;
    @Schema(description = "Email")
    private String email;

    private LocalDateTime registrationDate;

    private LocalDateTime createdOn;

    private LocalDateTime updatedOn;

    @Schema(description = "Пароль")
    private String password;
}
