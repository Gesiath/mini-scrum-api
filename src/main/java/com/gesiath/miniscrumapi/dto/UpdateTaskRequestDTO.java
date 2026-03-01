package com.gesiath.miniscrumapi.dto;

import com.gesiath.miniscrumapi.enumerator.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateTaskRequestDTO {

    @NotBlank
    private String title;

    private String description;

    @NotNull
    private Status status;

    @NotNull
    private LocalDate doDate;

    private String userId;

}
