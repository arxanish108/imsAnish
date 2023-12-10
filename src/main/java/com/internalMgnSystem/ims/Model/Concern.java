package com.internalMgnSystem.ims.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "concern")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Concern {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String Concern_Department;
  private String Concern_Person;
  private String Message;
}
