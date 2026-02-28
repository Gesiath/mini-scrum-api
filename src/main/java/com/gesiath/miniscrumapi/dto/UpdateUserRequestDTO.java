package com.gesiath.miniscrumapi.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateUserRequestDTO {

    private String name;
    private String email;
    private String password;

}
