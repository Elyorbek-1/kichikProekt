package uz.pdp.kichikproekt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.pdp.kichikproekt.entity.Measurement;
import uz.pdp.kichikproekt.payload.Result;
import uz.pdp.kichikproekt.service.MeasurementService;

import java.util.List;

@RestController
@RequestMapping("/measurement")
public class MeasurementController {
    @Autowired
    MeasurementService measurementService;

    @PostMapping
    public Result addMeasurementController(@RequestBody Measurement measurement){
        return measurementService.addMeasurementSerice(measurement);
    }

    @GetMapping
    public List<Measurement> getMeasurementController(){
        return this.measurementService.getMeasurementService();
    }
    @PutMapping("/{id}")
    public Result editMeasurementController(@PathVariable Integer id,Measurement measurement){
        return measurementService.editMeasurementService(id, measurement);
    }
    @DeleteMapping("/{id}")
    public Result deleteMeasurementController(@PathVariable Integer id){
        return measurementService.deleteMeasurementService(id);
    }
}
