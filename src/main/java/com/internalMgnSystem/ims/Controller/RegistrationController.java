package com.internalMgnSystem.ims.Controller;

import com.internalMgnSystem.ims.Dto.RegistrationDto;
import com.internalMgnSystem.ims.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reg")
public class RegistrationController {
     @Autowired
     private RegistrationService registrationService;

     @PostMapping("/regi")
     public ResponseEntity<?> addRegi(@RequestBody RegistrationDto registrationDto){
      // System.out.println("hello");
       RegistrationDto registrationDto1 = registrationService.regi(registrationDto);
       if(registrationDto1!=null){
         return new ResponseEntity<>(registrationDto1, HttpStatus.OK);
       }
       else{
         return new ResponseEntity<>("Not Found",HttpStatus.NOT_FOUND);
       }
     }

     @GetMapping("/get")
     public ResponseEntity<RegistrationDto> getPro(@RequestParam Long id){
          RegistrationDto registrationDto = registrationService.profile(id);

       if (registrationDto != null) {
         return ResponseEntity.ok(registrationDto);
       } else {
         return ResponseEntity.notFound().build();
       }
     }
}
