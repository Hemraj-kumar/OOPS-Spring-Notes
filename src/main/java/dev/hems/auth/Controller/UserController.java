package dev.hems.auth.Controller;

import dev.hems.auth.Model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import dev.hems.auth.Service.saveService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  UserController {
    @Autowired
    saveService save;

    @GetMapping("/home")
    public String home(){
        return "to home";
    }

    @GetMapping("/admin")
    public String admin(){
        return "to admin";
    }

    @PostMapping("/saveData")
    public void saveUserDetails(@RequestBody Users user){
        save.sendData(user);
    }
}
