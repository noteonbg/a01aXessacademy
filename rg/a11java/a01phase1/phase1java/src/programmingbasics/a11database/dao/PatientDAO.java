package programmingbasics.a11database.dao;

import programmingbasics.a11database.model.Patient;

import java.util.List;

public interface PatientDAO {
    void insertPatient(Patient patient);
    void updatePatient(String lastName, Patient updatedPatient);
    List<Patient> getAllPatients();
    List<Patient> getPatientsByDisease(String disease); // maps to allergies in this context
}
