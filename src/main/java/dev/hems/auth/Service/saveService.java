package dev.hems.auth.Service;

import dev.hems.auth.Model.Users;
import dev.hems.auth.Repositry.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class saveService {
    @Autowired
    UserRepo userRepo;
    public void sendData(Users user){
        userRepo.save(user);
    }
}
