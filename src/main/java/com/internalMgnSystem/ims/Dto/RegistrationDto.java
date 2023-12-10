package com.internalMgnSystem.ims.Dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationDto {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String	name;
  private String contact;
  private  String email;
  private String	department;
  private String designation;
  private String employee_ID;
  private String	password;
  private String role;
  //private byte[] imageData;

}
