package programmingbasics.a03aggregationcomposition;

public class HospitalApp {
    public static void main(String[] args) {

        // Aggregation Example
        Doctor doc = new Doctor("Dr. Sharma", "Cardiology");
        Hospital hospital = new Hospital("City Care Hospital", doc);
        System.out.println("=== Aggregation Example ===");
        hospital.displayHospital();

        // Composition Example
        Patient patient = new Patient("Anjali", 30, "R001", "Hypertension");
        System.out.println("\n=== Composition Example ===");
        patient.displayPatient();
    }
}

