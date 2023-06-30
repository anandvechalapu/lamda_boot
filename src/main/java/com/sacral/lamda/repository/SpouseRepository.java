import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sacral.lamda.model.Spouse;

public interface SpouseRepository extends JpaRepository<Spouse, Long> {

    List<Spouse> findByCustId(long custId);

    @Query("SELECT s FROM Spouse s WHERE s.custId = :custId AND s.dob = :dob AND s.crif = :crif")
    List<Spouse> findByCustIdAndDobAndCrif(@Param("custId") long custId, @Param("dob") String dob, @Param("crif") String crif);

    @Query("SELECT s FROM Spouse s WHERE s.custId = :custId AND s.creditScore IS NULL")
    List<Spouse> findByCustIdAndNullCreditScore(@Param("custId") long custId);

    @Query("SELECT s FROM Spouse s WHERE s.custId = :custId AND s.age >= :minAge AND s.age <= :maxAge")
    List<Spouse> findByCustIdAndAgeRange(@Param("custId") long custId, @Param("minAge") int minAge, @Param("maxAge") int maxAge);

}