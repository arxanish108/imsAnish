package com.internalMgnSystem.ims.Controller;

import com.internalMgnSystem.ims.Dto.ReportingDto;
import com.internalMgnSystem.ims.Service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("report")
public class ReportingController {
  @Autowired
  private ReportService reportService;
  @PostMapping("/add")
  public ResponseEntity<?> addReport(@RequestBody ReportingDto reportingDto){
    ReportingDto reportingDto1 = reportService.addR(reportingDto);
    if(reportingDto1!=null){
      return new ResponseEntity<>(reportingDto1, HttpStatus.OK);
    }
    else{
      return new ResponseEntity<>("Not Found",HttpStatus.NOT_FOUND);
    }
  }
}
