package com.poc.respectarchitecture.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import com.poc.respectarchitecture.model.Patient;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @GetMapping("/{id}")
    public ResponseEntity<String> getPatient(@PathVariable("id") String id) {
        return ResponseEntity.ok("Returning hardcoded patient with ID: " + id);
    }

    @PostMapping
    public ResponseEntity<String> createPatient(@RequestBody Patient patient) {
        return ResponseEntity.ok("Patient created with name: " + patient.getName() +
                ", age: " + patient.getAge() +
                ", gender: " + patient.getGender() +
                ", condition: " + patient.getCondition());
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updatePatient(@PathVariable("id") String id, @RequestBody Patient patient) {
        return ResponseEntity.ok("Updated patient with ID: " + id +
                " to name: " + patient.getName() +
                ", age: " + patient.getAge() +
                ", gender: " + patient.getGender() +
                ", condition: " + patient.getCondition());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePatient(@PathVariable("id") String id) {
        return ResponseEntity.ok("Deleted patient with ID: " + id);
    }

    @GetMapping("/viewall")
    public ResponseEntity<List<Patient>> viewPatients(
            @RequestParam(required = false) Integer age,
            @RequestParam(required = false) String gender,
            @RequestParam(required = false) String condition) {

        List<Patient> allPatients = Arrays.asList(
                new Patient("101", "John Abc", 45, "Male", "Diabetes"),
                new Patient("102", "Jane Smith", 60, "Female", "Hypertension"),
                new Patient("103", "Alice Johnson", 30, "Female", "Asthma"),
                new Patient("104", "Bob Williams", 60, "Male", "Diabetes")
        );

        List<Patient> filteredPatients = new java.util.ArrayList<>();

        for (Patient patient : allPatients) {
            boolean matches = true;

            if (age != null && patient.getAge() != age) {
                matches = false;
            }
            if (gender != null && !patient.getGender().equalsIgnoreCase(gender)) {
                matches = false;
            }
            if (condition != null && !patient.getCondition().equalsIgnoreCase(condition)) {
                matches = false;
            }

            if (matches) {
                filteredPatients.add(patient);
            }
        }

        return ResponseEntity.ok(filteredPatients);
    }
}
