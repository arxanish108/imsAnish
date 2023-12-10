package com.internalMgnSystem.ims.Controller;

import com.internalMgnSystem.ims.Dto.ConcernDto;
import com.internalMgnSystem.ims.Service.ConcernService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/concernCont")
public class ConcernController {

  @Autowired
  private ConcernService concernService;

  @PostMapping("/putConcern")
  public ResponseEntity<String> putConc(@RequestBody ConcernDto concernDto){
    System.out.println("Anish");
    ConcernDto concernDto1 = concernService.putConc(concernDto);
    if(concernDto1!=null){
      return new ResponseEntity<>("Added", HttpStatus.OK);
    }
    else{
      return new ResponseEntity<>("Not Found",HttpStatus.NOT_FOUND);
    }
  }
}
