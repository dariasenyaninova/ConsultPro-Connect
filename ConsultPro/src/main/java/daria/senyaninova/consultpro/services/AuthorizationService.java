package daria.senyaninova.consultpro.services;

import daria.senyaninova.consultpro.dto.RegistrationRequest;
import daria.senyaninova.consultpro.model.UserData;
import daria.senyaninova.consultpro.repositories.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthorizationService {
    private UserRepo userRepo;
    private PasswordEncoder passwordEncoder;

    public String registration(RegistrationRequest request){
        if (userRepo.findByUsername(request.getUsername()).isPresent()) {
            return "username busy";
        }
        String encodedPassword = passwordEncoder.encode(request.getPassword());

        UserData userData = new UserData(null, request.getUsername(), encodedPassword, request.getRole());
        userRepo.save(userData);
        return "user registered successfully!";
    }
}
