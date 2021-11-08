package uz.pdp.kichikproekt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.core.support.ReactiveRepositoryFactorySupport;
import org.springframework.web.bind.annotation.*;
import uz.pdp.kichikproekt.entity.Product;
import uz.pdp.kichikproekt.payload.ProductDto;
import uz.pdp.kichikproekt.payload.Result;
import uz.pdp.kichikproekt.service.ProductService;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping
    public Result addProduct(@RequestBody ProductDto productDto){
        return productService.addProduct(productDto);
    }
    @GetMapping
    public List<Product> getProduct(){
        return productService.getProduct();
    }
    @PutMapping
    public Result editProduct(@PathVariable Integer id,@RequestBody ProductDto productDto){
        return productService.editProduct(id,productDto);
    }
    @DeleteMapping
    public Result deleteProduct(@PathVariable Integer id){
        return productService.deleteProduct(id);
    }
}
