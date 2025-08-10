package programmingbasics.a10nonlinear;

import java.util.HashMap;
import java.util.Map;

public class PatientMapExample {
    public static void main(String[] args) {
        // Create a Map to store patient ID and patient name pairs
        Map<String, String> patientMap = new HashMap<>();

        // Add some patients (ID -> Name)
        patientMap.put("P101", "Anjali Sharma");
        patientMap.put("P102", "Ramesh Gupta");
        patientMap.put("P103", "Sneha Patel");

        // Retrieve and display patient name by ID
        String searchId = "P102";
        if (patientMap.containsKey(searchId)) {
            System.out.println("Patient with ID " + searchId + ": " + patientMap.get(searchId));
        } else {
            System.out.println("Patient ID " + searchId + " not found.");
        }

        // Display all patients in the map
        System.out.println("\nAll Patients:");
        for (Map.Entry<String, String> entry : patientMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
