package uz.pdp.kichikproekt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.pdp.kichikproekt.entity.Warehouse;
import uz.pdp.kichikproekt.payload.Result;
import uz.pdp.kichikproekt.service.WarehouseService;

import java.util.List;

@RestController
@RequestMapping("/werehouse")
public class WarehouseController {
    @Autowired
    WarehouseService warehouseService;

    @PostMapping
    public Result addWarehouse(@RequestBody Warehouse warehouse){
        return warehouseService.addWarehouse(warehouse);
    }
    @GetMapping
    public List<Warehouse> getWarehouse(){
        List<Warehouse> warehouseService = this.warehouseService.getWarehouseService();
        return warehouseService;
    }
    @PutMapping
    public Result editWarehouse(@RequestBody Warehouse warehouse,@PathVariable Integer id){
        return warehouseService.editWarehouse(id,warehouse);
    }
    @DeleteMapping
    public Result deleteWarehouse(@PathVariable Integer id){
        return warehouseService.deleteWarehouse(id);
    }
}
