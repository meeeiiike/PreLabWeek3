package ie.atu.week3;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

    @NotBlank
    @Size(min = 1, max = 100)
    private String name;

    @Positive
    @NotNull
    @DecimalMin("0.01")
    @Size(max = 5000)
    private double price;

}