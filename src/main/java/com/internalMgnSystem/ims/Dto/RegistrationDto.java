package com.internalMgnSystem.ims.Dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationDto {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String	name;
  private String contact;
  private  String officialEmail;
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
  private String	department;
  private String designation;
  private String employee_ID;
  private String	password;
  private String role;
  //List<String> roles;
  //private byte[] imageData;

}
