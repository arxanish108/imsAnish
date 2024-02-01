package com.internalMgnSystem.ims.Model;



import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
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
  private  String officialEmail;
  //
  @Column(unique = true)
  private String alternateEmail;
  private String currAddress;
  private String permanentAddress;
  private String alternateContact;
  @Lob
  private byte[] profilePic;
  @Lob
  private byte[] aadharCard;
  @Lob
  private byte[] panCard;
  @Lob
  private byte[] latestDegreeMarksheet;
  @Lob
  private byte[] relievingLetter;
  @Lob
  private byte[] experienceLetter;
  @Lob
  private List<byte[]> last3MonthsSlip;
  @Lob
  private byte[] cancelledCheque;
  private String highestQualification;
  private String specialsation;
  private Date year;
  private String collegeName;
  private String BankName;
  private String accountHolderName;
  private String accountNumber;
  private String IFSC;
  private String branchName;
  private int inHandSalaryPM;
  private Double incentive;

  private String	Department;
  private String Designation;
  @Column(unique = true)
  private String Employee_ID;
  private String	Password;
  //private String role;
//  @ElementCollection(targetClass = String.class,fetch =FetchType.EAGER)
//  @Column(nullable = true, name = "roles_string")
//  List<String> roles;

}
