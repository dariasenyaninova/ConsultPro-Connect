package daria.senyaninova.consultpro.repositories;


import daria.senyaninova.consultpro.model.SpecialistData;
import daria.senyaninova.consultpro.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpecialistRepo extends JpaRepository<SpecialistData, Long> {
    Optional<SpecialistData> findByUserData_username(String username);
    Optional<SpecialistData> findByUserData(UserData userData);
}
