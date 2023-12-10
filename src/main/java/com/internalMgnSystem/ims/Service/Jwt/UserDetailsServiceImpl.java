package com.internalMgnSystem.ims.Service.Jwt;

import com.internalMgnSystem.ims.Model.Registration;
import com.internalMgnSystem.ims.Repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
  @Autowired
  private RegistrationRepository registrationRepository;

  @Override
  public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    
    Registration registration = registrationRepository.findFirstByEmail(email);
    if (registration == null) {
      throw new UsernameNotFoundException("User not found", null);
    }
    return new org.springframework.security.core.userdetails.User(registration.getEmail(), registration.getPassword(), new ArrayList<>());

  }
}
