package ie.atu.week3;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {


    // Create in-memory List of Products
    List<Product> products = new ArrayList<>();

    // GET Request to List all Products
    @GetMapping("/getProducts")
    public List<Product> getProduct(){
        return products;
    }

    // POST Request to Add a new Product, includes validation of @NotNull and @Positive
    @PostMapping("/addProduct")
    public Product addProduct(@Valid @RequestBody Product product){
        products.add(product);
        return product;
    }

    // POST Request to Add new Products, includes validation of @NotNull and @Positive
    @PostMapping("/addProducts")
    public List<Product> addProducts(@Valid @RequestBody List<Product> product){
        products.addAll(product);
        return products;
    }

    @GetMapping("/count")
    public int getCountProducts(){
        return products.size();
    }

}