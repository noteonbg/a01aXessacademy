package medicalexample_embeddable.repository;



import medicalexample_embeddable.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface PatientRepository extends JpaRepository<Patient, Long> {

    // 1. JPQL Query (uses entity and field names)
    @Query("SELECT p FROM Patient p WHERE p.gender = :gender")
    List<Patient> findByGenderJPQL(@Param("gender") String gender);

    // 2. Native SQL Query (uses actual table and column names)
    @Query(value = "SELECT * FROM patient_poc WHERE age > :age", nativeQuery = true)
    List<Patient> findPatientsOlderThanNative(@Param("age") int age);

}
