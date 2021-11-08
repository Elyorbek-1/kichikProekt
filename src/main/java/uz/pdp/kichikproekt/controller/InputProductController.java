package uz.pdp.kichikproekt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.pdp.kichikproekt.entity.InputProduct;
import uz.pdp.kichikproekt.payload.InputProductDto;
import uz.pdp.kichikproekt.payload.Result;
import uz.pdp.kichikproekt.service.InputProductService;

import java.util.List;

@RestController
@RequestMapping("/inputProduct")
public class InputProductController {
    @Autowired
    InputProductService inputProductService;
    @PostMapping
    public Result addInputProduct(@RequestBody InputProductDto inputProductDto){
        return inputProductService.addInputProduct(inputProductDto);
    }
    @GetMapping
    public List<InputProduct> getInputProduct(){
        return inputProductService.getInputProduct();
    }
    @PutMapping
    public Result editInputProduct(@PathVariable Integer id,@RequestBody InputProductDto inputProductDto){
        return inputProductService.editInputProduct(id,inputProductDto);
    }
    @DeleteMapping
    public Result deleteInputProduct(@PathVariable Integer id){
        return inputProductService.deleteInputProduct(id);
    }
}
