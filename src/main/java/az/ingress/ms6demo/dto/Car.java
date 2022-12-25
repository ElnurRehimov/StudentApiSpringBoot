package az.ingress.ms6demo.dto;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class Car {
    @NotBlank
    private String make;
    @NotBlank
    @NotEmpty
    private String model;
    @NotNull
    @Min(value = 2010)
    private Integer year;
}
