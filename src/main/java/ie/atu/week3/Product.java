package ie.atu.week3;

import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

@Data
@AllArgsConstructor
public class Product {
    @NotBlank
    private String name;
    @Positive
    private double price;
}