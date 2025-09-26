package ie.atu.week3;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    List<Product> products = new ArrayList<>();

    @GetMapping("/getProducts")
    public List<Product> getProduct(){
        return products;
    }

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        products.add(product);
        return product;
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> product){
        products.addAll(product);
        return products;
    }
}
