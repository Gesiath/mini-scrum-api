package com.gesiath.miniscrumapi.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponseDTO {

    private String id;
    private String name;
    private String email;

}
