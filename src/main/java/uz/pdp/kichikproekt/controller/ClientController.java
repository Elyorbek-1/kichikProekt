package uz.pdp.kichikproekt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.pdp.kichikproekt.entity.Client;
import uz.pdp.kichikproekt.payload.Result;
import uz.pdp.kichikproekt.service.ClientService;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    ClientService clientService;
    @PostMapping
    public Result addClient(@RequestBody Client client){
        return clientService.addClient(client);
    }

    @GetMapping
    public List<Client> getClient(){
        return clientService.getClient();
    }
    @PutMapping
    public Result editClient(@PathVariable Integer id,@RequestBody Client client){
        return clientService.editClient(id,client);
    }
    @DeleteMapping
    public Result deleteClient(@PathVariable Integer id){
        return clientService.deleteClient(id);
    }
}
