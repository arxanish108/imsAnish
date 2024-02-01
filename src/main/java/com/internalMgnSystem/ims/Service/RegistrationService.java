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
    registration.setOfficialEmail(registrationDto.getOfficialEmail());
    registration.setAlternateEmail(registrationDto.getAlternateEmail());
    registration.setCurrAddress(registrationDto.getCurrAddress());
    registration.setPermanentAddress(registrationDto.getPermanentAddress());
    registration.setAlternateContact(registrationDto.getAlternateContact());
    registration.setProfilePic(registrationDto.getProfilePic());
    registration.setAadharCard(registrationDto.getAadharCard());
    registration.setPanCard(registrationDto.getPanCard());
    registration.setLatestDegreeMarksheet(registrationDto.getLatestDegreeMarksheet());
    registration.setRelievingLetter(registrationDto.getRelievingLetter());
    registration.setExperienceLetter(registrationDto.getExperienceLetter());
    registration.setLast3MonthsSlip(registrationDto.getLast3MonthsSlip());
    registration.setCancelledCheque(registrationDto.getCancelledCheque());
    registration.setHighestQualification(registrationDto.getHighestQualification());
    registration.setSpecialsation(registrationDto.getSpecialsation());
    registration.setYear(registrationDto.getYear());
    registration.setCollegeName(registrationDto.getCollegeName());
    registration.setBankName(registrationDto.getBankName());
    registration.setAccountHolderName(registrationDto.getAccountHolderName());
    registration.setAccountNumber(registrationDto.getAccountNumber());
    registration.setIFSC(registrationDto.getIFSC());
    registration.setBranchName(registrationDto.getBranchName());
    registration.setInHandSalaryPM(registrationDto.getInHandSalaryPM());
    registration.setIncentive(registrationDto.getIncentive());
    registration.setDepartment(registrationDto.getDepartment());
    registration.setDesignation(registrationDto.getDesignation());
    registration.setEmployee_ID(registrationDto.getEmployee_ID());
    registration.setPassword(new BCryptPasswordEncoder().encode(registrationDto.getPassword()));
   // registration.setRoles(registrationDto.getRoles());

    Registration registration1 = registrationRepository.save(registration);

    RegistrationDto registrationDto1 = new RegistrationDto();
    registrationDto1.setName(registration1.getName());
    registrationDto1.setContact(registration1.getContact());
    registrationDto1.setOfficialEmail(registration1.getOfficialEmail());
    registrationDto1.setAlternateEmail(registration1.getAlternateEmail());
    registrationDto1.setCurrAddress(registration1.getCurrAddress());
    registrationDto1.setPermanentAddress(registration1.getPermanentAddress());
    registrationDto1.setAlternateContact(registration1.getAlternateContact());
    registrationDto1.setProfilePic(registration1.getProfilePic());
    registrationDto1.setAadharCard(registration1.getAadharCard());
    registrationDto1.setPanCard(registration1.getPanCard());
    registrationDto1.setLatestDegreeMarksheet(registration1.getLatestDegreeMarksheet());
    registrationDto1.setRelievingLetter(registration1.getRelievingLetter());
    registrationDto1.setExperienceLetter(registration1.getExperienceLetter());
    registrationDto1.setLast3MonthsSlip(registration1.getLast3MonthsSlip());
    registrationDto1.setCancelledCheque(registration1.getCancelledCheque());
    registrationDto1.setHighestQualification(registration1.getHighestQualification());
    registrationDto1.setSpecialsation(registration1.getSpecialsation());
    registrationDto1.setYear(registration1.getYear());
    registrationDto1.setCollegeName(registration1.getCollegeName());
    registrationDto1.setBankName(registration1.getBankName());
    registrationDto1.setAccountHolderName(registration1.getAccountHolderName());
    registrationDto1.setAccountNumber(registration1.getAccountNumber());
    registrationDto1.setIFSC(registration1.getIFSC());
    registrationDto1.setBranchName(registration1.getBranchName());
    registrationDto1.setInHandSalaryPM(registration1.getInHandSalaryPM());
    registrationDto1.setIncentive(registration1.getIncentive());
    registrationDto1.setDepartment(registration1.getDepartment());
    registrationDto1.setDesignation(registration1.getDesignation());
    registrationDto1.setEmployee_ID(registration1.getEmployee_ID());
    registrationDto1.setPassword(registration1.getPassword());

   // registrationDto1.setRoles(registration1.getRoles());

    return registrationDto1;
  }

//  public RegistrationDto profile(Long id) {
//    Optional<Registration> registration = registrationRepository.findById(id);
//
//    if (registration.isPresent()){
//      Registration registration1 = registration.get();
//      RegistrationDto registrationDto = new RegistrationDto();
//      registrationDto.setName(registration1.getName());
//      registrationDto.setContact(registration1.getContact());
//      registrationDto.setOfficialEmail(registration1.getOfficialEmail());
//      registrationDto.setDepartment(registration1.getDepartment());
//      registrationDto.setDesignation(registration1.getDesignation());
//      registrationDto.setEmployee_ID(registration1.getEmployee_ID());
//      return registrationDto;
//    }else{
//      return null;
//    }
//  }

  public RegistrationDto profile(Long id) {
    Optional<Registration> registration = registrationRepository.findById(id);

    if (registration.isPresent()){
      Registration registration1 = registration.get();
      RegistrationDto registrationDto = new RegistrationDto();

      registrationDto.setId(registration1.getId());
      registrationDto.setName(registration1.getName());
      registrationDto.setContact(registration1.getContact());
      registrationDto.setOfficialEmail(registration1.getOfficialEmail());
      registrationDto.setAlternateEmail(registration1.getAlternateEmail());
      registrationDto.setCurrAddress(registration1.getCurrAddress());
      registrationDto.setPermanentAddress(registration1.getPermanentAddress());
      registrationDto.setAlternateContact(registration1.getAlternateContact());
      registrationDto.setProfilePic(registration1.getProfilePic());
      registrationDto.setAadharCard(registration1.getAadharCard());
      registrationDto.setPanCard(registration1.getPanCard());
      registrationDto.setLatestDegreeMarksheet(registration1.getLatestDegreeMarksheet());
      registrationDto.setRelievingLetter(registration1.getRelievingLetter());
      registrationDto.setExperienceLetter(registration1.getExperienceLetter());
      registrationDto.setLast3MonthsSlip(registration1.getLast3MonthsSlip());
      registrationDto.setCancelledCheque(registration1.getCancelledCheque());
      registrationDto.setHighestQualification(registration1.getHighestQualification());
      registrationDto.setSpecialsation(registration1.getSpecialsation());
      registrationDto.setYear(registration1.getYear());
      registrationDto.setCollegeName(registration1.getCollegeName());
      registrationDto.setBankName(registration1.getBankName());
      registrationDto.setAccountHolderName(registration1.getAccountHolderName());
      registrationDto.setAccountNumber(registration1.getAccountNumber());
      registrationDto.setIFSC(registration1.getIFSC());
      registrationDto.setBranchName(registration1.getBranchName());
      registrationDto.setInHandSalaryPM(registration1.getInHandSalaryPM());
      registrationDto.setIncentive(registration1.getIncentive());
      registrationDto.setDepartment(registration1.getDepartment());
      registrationDto.setDesignation(registration1.getDesignation());
      registrationDto.setEmployee_ID(registration1.getEmployee_ID());
      registrationDto.setPassword(registration1.getPassword());
      //registrationDto.setRole(registration1.getRole());
     // registrationDto.setRoles(registration1.getRoles());

      return registrationDto;
    } else {
      return null;
    }
  }
}
