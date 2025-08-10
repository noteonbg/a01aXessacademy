package programmingbasics.a09ListExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatientListApp {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Anjali", 30, "Flu"));
        patients.add(new Patient("Ramesh", 45, "Diabetes"));
        patients.add(new Patient("Sneha", 27, "Migraine"));

        System.out.println("=== Patient List ===");
        for (Patient p : patients) {
            p.displayInfo();
        }

        // Search patient by name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter patient name to search: ");
        String searchName = scanner.nextLine();

        Patient foundPatient = searchPatientByName(patients, searchName);
        if (foundPatient != null) {
            System.out.println("\nPatient found:");
            foundPatient.displayInfo();
        } else {
            System.out.println("\nPatient with name '" + searchName + "' not found.");
        }

        scanner.close();
    }

    // Simple search method without lambda
    public static Patient searchPatientByName(List<Patient> patients, String name) {
        for (Patient p : patients) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;  // Return first match
            }
        }
        return null;  // Not found
    }
}

