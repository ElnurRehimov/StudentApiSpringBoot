package az.ingress.ms6demo.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CreateStudentDto {
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
}
