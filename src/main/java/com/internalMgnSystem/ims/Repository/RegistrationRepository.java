package com.internalMgnSystem.ims.Repository;

import com.internalMgnSystem.ims.Model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration,Long> {
  //@Query(value = "SELECT SUM(c.fees * a.count) FROM clinic AS c  INNER JOIN ( SELECT clinic_id, COUNT(*) AS count  FROM appointment WHERE doctor_id = :doctorId and  appointment_date <= :endDate and  appointment_date >= :startDate  GROUP BY clinic_id) AS a ON c.id = a.clinic_id; ",nativeQuery = true)
//  @Query(value = "select * from registration where email :email;", nativeQuery = true)
 // public Registration findFirstByEmail(String email);
    public Registration findByOfficialEmail(String email);
  //public Registration findByEmail(String email);
}
