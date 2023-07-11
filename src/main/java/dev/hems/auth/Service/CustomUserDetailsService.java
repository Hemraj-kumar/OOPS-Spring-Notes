package dev.hems.auth.Service;

import dev.hems.auth.CustomUserDetails;
import dev.hems.auth.Model.Users;
import dev.hems.auth.Repositry.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userRepo.findByUsername(username);
        if(user == null) {
            throw new UsernameNotFoundException("User not found ...");
        }
        return new CustomUserDetails(user);
    }
}
