package daria.senyaninova.consultpro.controllers;

import daria.senyaninova.consultpro.dto.RegistrationRequest;
import daria.senyaninova.consultpro.services.AuthorizationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AuthorizationController {
    private AuthorizationService authorizationService;

    @PostMapping("/registration")
    public String registration(@RequestBody RegistrationRequest request){
        return authorizationService.registration(request);
    }

    @PostMapping("/login")
    public String login(){
        return "ok";
    }
}
