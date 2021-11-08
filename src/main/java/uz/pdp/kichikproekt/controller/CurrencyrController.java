package uz.pdp.kichikproekt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.pdp.kichikproekt.entity.Currency;
import uz.pdp.kichikproekt.payload.Result;
import uz.pdp.kichikproekt.service.CurrencyService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class CurrencyrController {

    @Autowired
    CurrencyService service;
    @PostMapping
    public Result addUser(@RequestBody Currency currency) {
        return service.addCurrency(currency);
    }
    @GetMapping
    public List<Currency> getCurrency(){
        return service.getCurrencyList();
    }
    @PutMapping
    public Result editCurrency(@PathVariable Integer id,@RequestBody Currency currency){
        return service.editCurrency(id,currency);
    }
    @DeleteMapping
    public Result deleteCurrency(@PathVariable Integer id){
        return service.deleteCurrency(id);
    }
}
