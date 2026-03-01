package com.gesiath.miniscrumapi.dto;

import com.gesiath.miniscrumapi.enumerator.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateTaskRequestDTO {

    @NotBlank(message = "Title is required")
    @Size(max = 100)
    private String title;

    @Size(max = 500)
    private String description;

    @NotNull(message = "Status is required")
    private Status status;

    @NotNull(message = "Due date is required")
    private LocalDate doDate;

    private String userId;

}
