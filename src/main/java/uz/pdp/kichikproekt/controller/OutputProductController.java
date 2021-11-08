package uz.pdp.kichikproekt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.pdp.kichikproekt.entity.OutputProduct;
import uz.pdp.kichikproekt.payload.OutputProductDto;
import uz.pdp.kichikproekt.payload.Result;
import uz.pdp.kichikproekt.service.OutputProductService;

import java.util.List;

@RestController
@RequestMapping("/outputProduct")
public class OutputProductController {
    @Autowired
    OutputProductService outputProductService;
    @PostMapping
    public Result addOutputProduct(@RequestBody OutputProductDto outputProductDto){
        return outputProductService.addOutputProduct(outputProductDto);
    }
    @GetMapping
    public List<OutputProduct> getOutputProduct(){
        return outputProductService.getOutputProduct();
    }
    @PutMapping
    public Result editOutputProduct(@PathVariable Integer id,@RequestBody OutputProductDto outputProductDto){
        return outputProductService.editOutputProduct(id,outputProductDto);
    }
    @DeleteMapping
    public Result deleteOutputProduct(@PathVariable Integer id){
        return outputProductService.deleteOutputProduct(id);
    }
}
