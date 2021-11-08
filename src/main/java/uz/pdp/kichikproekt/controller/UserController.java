package uz.pdp.kichikproekt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.pdp.kichikproekt.entity.Users;
import uz.pdp.kichikproekt.payload.Result;
import uz.pdp.kichikproekt.service.UserService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/userlar")

public class UserController {
    @Autowired
    UserService userService;
    @PostMapping
    public Result addUsers(@RequestBody Users users){
        return userService.addUser(users);
    }
    @GetMapping
    public Set<Users> getUsersController(){
        return userService.getUsersService();
    }
    @PutMapping
    public Result editUsers(@PathVariable Integer id,@RequestBody Users users){
        return userService.editUsers(id,users);
    }
    @DeleteMapping
    public Result deleteUsers(@PathVariable Integer id){
        return userService.deleteUsers(id);
    }
}
