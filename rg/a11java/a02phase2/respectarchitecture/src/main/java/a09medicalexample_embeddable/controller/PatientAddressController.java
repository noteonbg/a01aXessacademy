package a09medicalexample_embeddable.controller;



import a09medicalexample_embeddable.model.Patient;
import a09medicalexample_embeddable.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients-address")
public class PatientAddressController {

    @Autowired
    private PatientRepository repository;

    @GetMapping
    public List<Patient> getAllWithAddress() {
        List<Patient> patients = repository.findAll();
        // Set transient field manually before returning
        patients.forEach(p -> p.setSeniorCitizen(p.getAge() >= 60));
        return patients;
    }

    @PostMapping
    public Patient addPatientWithAddress(@RequestBody Patient patient) {
        return repository.save(patient);
    }
//http://localhost:8080/patients-address/by-gender/Female
    //observe we are using... entity classnames
    @GetMapping("/by-gender/{gender}")
    public List<Patient> getByGender(@PathVariable String gender) {
        return repository.findByGenderJPQL(gender);
    }

    //GET http://localhost:8080/patients-address/older-than/50
    // Endpoint for native SQL query
    // we are uisng sql column names of the table.
    @GetMapping("/older-than/{age}")
    public List<Patient> getOlderThan(@PathVariable int age) {
        return repository.findPatientsOlderThanNative(age);
    }
}

