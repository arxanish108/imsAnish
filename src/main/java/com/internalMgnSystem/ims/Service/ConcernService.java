package com.internalMgnSystem.ims.Service;

import com.internalMgnSystem.ims.Dto.ConcernDto;
import com.internalMgnSystem.ims.Model.Concern;
import com.internalMgnSystem.ims.Repository.ConcernRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConcernService {
  @Autowired
  private ConcernRepository concernRepository;

  public ConcernDto putConc(ConcernDto concernDto) {
    Concern concern = new Concern();
    concern.setConcern_Department(concernDto.getConcern_Department());
    concern.setConcern_Person(concernDto.getConcern_Person());
    concern.setMessage(concernDto.getMessage());

    Concern concern1 = concernRepository.save(concern);

    ConcernDto concernDto1 = new ConcernDto();
    concernDto1.setConcern_Department(concern1.getConcern_Department());
    concernDto1.setConcern_Person(concern1.getConcern_Person());
    concernDto1.setMessage(concern1.getMessage());

    return concernDto1;
  }
}
