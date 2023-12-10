package com.internalMgnSystem.ims.Model;



import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "imsReg")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Registration {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String	Name;
  private String Contact;
  @Column(unique = true)
  private  String email;
  private String	Department;
  private String Designation;
  @Column(unique = true)
  private String Employee_ID;
  private String	Password;
  //private String role;
  @ElementCollection(targetClass = String.class,fetch =FetchType.EAGER)
  @Column(nullable = true, name = "roles_string")
  List<String> roles;

//  @Lob
//  private byte[] imageData;

}
