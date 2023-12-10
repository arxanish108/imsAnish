package com.internalMgnSystem.ims.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "report")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reporting {
//  -	New Leads
//  -	Client reporting
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String new_leads;

  private String client_reporting;

}
