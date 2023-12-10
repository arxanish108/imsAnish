package com.internalMgnSystem.ims.Service;

import com.internalMgnSystem.ims.Dto.ReportingDto;
import com.internalMgnSystem.ims.Model.Reporting;
import com.internalMgnSystem.ims.Repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

  @Autowired
  private ReportRepository reportRepository;
  @PreAuthorize("hasRole('ROLE_SALES')")
  public ReportingDto addR(ReportingDto reportingDto) {

    Reporting reporting = new Reporting();
    reporting.setClient_reporting(reportingDto.getClient_reporting());
    reporting.setNew_leads(reportingDto.getNew_leads());

    reporting = reportRepository.save(reporting);

    ReportingDto reportingDto1 = new ReportingDto();

    reportingDto1.setClient_reporting(reporting.getClient_reporting());
    reportingDto1.setNew_leads(reporting.getNew_leads());

    return reportingDto1;

  }
}
