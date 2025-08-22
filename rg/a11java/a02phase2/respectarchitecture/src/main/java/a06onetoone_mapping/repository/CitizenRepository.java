package a06onetoone_mapping.repository;



import a06onetoone_mapping.model.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizenRepository extends JpaRepository<Citizen, Long> {
}

