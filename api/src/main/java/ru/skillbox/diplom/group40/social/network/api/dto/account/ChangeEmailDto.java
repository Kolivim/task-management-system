package ru.skillbox.diplom.group40.social.network.api.dto.account;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChangeEmailDto {

    @Schema(description = "Email")
    private EmailDto email;
}