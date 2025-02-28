package daria.senyaninova.consultpro.repositories;


import daria.senyaninova.consultpro.model.ConsultRequest;
import daria.senyaninova.consultpro.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RequestRepo extends JpaRepository<ConsultRequest, Long> {
    List<ConsultRequest> findAllByCustomerData_UserData_Username(String username);

}
