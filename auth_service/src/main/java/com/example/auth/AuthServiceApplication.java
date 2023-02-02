package com.example.auth;

import com.example.auth.Entity.appRole;
import com.example.auth.Entity.appUser;
import com.example.auth.service.AccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class AuthServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthServiceApplication.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }


    /* @Bean
     CommandLineRunner start(AccountService accountService){
        return args -> {
            accountService.addNewRole(new appRole(null,"User"));
            accountService.addNewRole(new appRole(null,"Admin"));
            accountService.addNewRole(new appRole(null,"Moderateur"));

            accountService.addNewUser(new appUser(null,"gavi","1234",new ArrayList<>()));
            accountService.addNewUser(new appUser(null,"messi","1234",new ArrayList<>()));
            accountService.addNewUser(new appUser(null,"pedri","1234",new ArrayList<>()));

            accountService.addRoleToUser("gavi","User");
            accountService.addRoleToUser("pedri","Moderateur");
            accountService.addRoleToUser("messi","Admin");
        };
    }*/

}
