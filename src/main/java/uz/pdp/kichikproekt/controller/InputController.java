package uz.pdp.kichikproekt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.pdp.kichikproekt.entity.Input;
import uz.pdp.kichikproekt.payload.InputDto;
import uz.pdp.kichikproekt.payload.Result;
import uz.pdp.kichikproekt.service.InputService;

import java.util.List;

@RestController
@RequestMapping("/input")
public class InputController {
    @Autowired
    InputService inputService;
    @PostMapping
    public Result addInput(@RequestBody InputDto inputDto){
        return inputService.addInput(inputDto);
    }
    @GetMapping
    public List<Input> getInputs(){
        return inputService.getInputs();
    }
    @PutMapping
    public Result editInput(@PathVariable Integer id,@RequestBody InputDto inputDto){
        return inputService.editInput(id,inputDto);
    }
    @DeleteMapping
    public Result deleteInput(@PathVariable Integer id){
        return inputService.deleteInput(id);
    }
}
