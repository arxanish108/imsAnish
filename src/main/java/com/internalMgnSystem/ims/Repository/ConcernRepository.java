package com.internalMgnSystem.ims.Repository;

import com.internalMgnSystem.ims.Model.Concern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcernRepository extends JpaRepository<Concern,Long> {

}
