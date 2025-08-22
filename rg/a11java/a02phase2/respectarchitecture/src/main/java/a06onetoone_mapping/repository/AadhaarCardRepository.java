package a06onetoone_mapping.repository;

import a06onetoone_mapping.model.AadhaarCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AadhaarCardRepository extends
        JpaRepository<AadhaarCard, Long> {
}
