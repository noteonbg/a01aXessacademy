package medicalexample.service;



import medicalexample.model.Patient;
import medicalexample.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    private PatientRepository repository;

    public List<Patient> getAllPatients() {
        return repository.findAll();
    }

    public Optional<Patient> getPatientById(Long id) {
        return repository.findById(id);
    }

    public Patient createPatient(Patient patient) {
        return repository.save(patient);
    }

    public Patient updatePatient(Long id, Patient updated) {
        return repository.findById(id)
                .map(p -> {
                    p.setName(updated.getName());
                    p.setAge(updated.getAge());
                    p.setGender(updated.getGender());
                    p.setCondition(updated.getCondition());
                    return repository.save(p);
                }).orElseThrow(() -> new RuntimeException("Patient not found"));
    }

    public void deletePatient(Long id) {
        repository.deleteById(id);
    }
}
