package ie.atu.week3;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

@Data
@AllArgsConstructor
public class Product {
    @Size(min = 1, max = 100)
    private String name;
    @Positive @DecimalMin("0.01") @Size(max = 5000)
    private double price;
}