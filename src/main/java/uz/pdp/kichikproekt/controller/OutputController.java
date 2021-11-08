package uz.pdp.kichikproekt.controller;

import org.aspectj.apache.bcel.generic.LineNumberGen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.pdp.kichikproekt.entity.Output;
import uz.pdp.kichikproekt.payload.OutputDto;
import uz.pdp.kichikproekt.payload.Result;
import uz.pdp.kichikproekt.service.OutputService;

import java.util.List;

@RestController
@RequestMapping("/output")
public class OutputController {
    @Autowired
    OutputService outputService;
    @PostMapping
    public Result addOutput(@RequestBody OutputDto outputDto){
        return outputService.addOutput(outputDto);
    }
    @GetMapping
    public List<Output> getOutput(){
        return outputService.getOutput();
    }
    @PutMapping
    public Result editOutput(@PathVariable Integer id,@RequestBody OutputDto outputDto){
        return outputService.editOutput(id,outputDto);
    }
    @DeleteMapping
    public Result deleteOutput(@PathVariable Integer id){
        return outputService.deleteOutput(id);
    }
}
