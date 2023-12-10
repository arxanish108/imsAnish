package com.internalMgnSystem.ims.Service;

import com.internalMgnSystem.ims.Common.UserConstant;
import com.internalMgnSystem.ims.Dto.RegistrationDto;
import com.internalMgnSystem.ims.Model.Registration;
import com.internalMgnSystem.ims.Repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class RegistrationService {

  @Autowired
  private RegistrationRepository registrationRepository;
  public RegistrationDto regi(RegistrationDto registrationDto) {
    Registration registration = new Registration();
    registration.setName(registrationDto.getName());
    registration.setContact(registrationDto.getContact());
    registration.setEmail(registrationDto.getEmail());
    registration.setDepartment(registrationDto.getDepartment());
    registration.setDesignation(registrationDto.getDesignation());
    registration.setEmployee_ID(registrationDto.getEmployee_ID());
    registration.setPassword(new BCryptPasswordEncoder().encode(registrationDto.getPassword()));
   // registration.setRole(UserConstant.DEFAULT_ROLE);
    if(registration.setRoles(Arrays.asList(registrationDTO.getRoles())){

    }

    Registration registration1 = registrationRepository.save(registration);

    RegistrationDto registrationDto1 = new RegistrationDto();
    registrationDto1.setName(registration1.getName());
    registrationDto1.setDepartment(registration1.getDepartment());
    registrationDto1.setContact(registration1.getContact());
    registrationDto1.setDesignation(registration1.getDesignation());
    registrationDto1.setEmail(registration1.getEmail());
    registrationDto1.setEmployee_ID(registration1.getEmployee_ID());
    registrationDto1.setPassword(registration1.getPassword());
    registrationDto1.setRole(registration1.getRole());

    return registrationDto1;

  }

  public RegistrationDto profile(Long id) {
    Optional<Registration> registration = registrationRepository.findById(id);

    if (registration.isPresent()){
      Registration registration1 = registration.get();
      RegistrationDto registrationDto = new RegistrationDto();
      registrationDto.setName(registration1.getName());
      registrationDto.setContact(registration1.getContact());
      registrationDto.setEmail(registration1.getEmail());
      registrationDto.setDepartment(registration1.getDepartment());
      registrationDto.setDesignation(registration1.getDesignation());
      registrationDto.setEmployee_ID(registration1.getEmployee_ID());
      registrationDto.setRole(registration1.getRole());
      return registrationDto;
    }else{
      return null;
    }

    public List<String> getRoles()
  }
}
