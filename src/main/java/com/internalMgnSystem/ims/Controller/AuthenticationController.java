package com.internalMgnSystem.ims.Controller;

import com.internalMgnSystem.ims.Dto.AuthenticationRequest;
import com.internalMgnSystem.ims.Dto.AuthenticationResponse;
import com.internalMgnSystem.ims.Service.Jwt.UserDetailsServiceImpl;
import com.internalMgnSystem.ims.Utils.JwtUtil;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
//@RequestMapping("/log")
public class AuthenticationController {
  @Autowired
  private JwtUtil jwtUtil;
  @Autowired
  private AuthenticationManager authenticationManager;

  @Autowired
  private UserDetailsServiceImpl userDetailsService;

  @PostMapping("/authenticate")
  public AuthenticationResponse createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest, HttpServletResponse response) throws BadCredentialsException, DisabledException, UsernameNotFoundException, IOException {

    try {
      authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getOfficialEmail(), authenticationRequest.getPassword()));
    } catch (BadCredentialsException e) {
      throw new BadCredentialsException("Incorrect username or password!");
    } catch (DisabledException disabledException) {
      response.sendError(HttpServletResponse.SC_NOT_FOUND, "User is not activated");
      return null;
    }

    final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getOfficialEmail());
    final String jwt = jwtUtil.generateToken(userDetails.getUsername());
    return new AuthenticationResponse(jwt);

  }
}
