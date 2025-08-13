package programmingbasics.a08exceptionhandling.throwsandthrowkeyword;

public class HospitalApp {
    public static void main(String[] args) {
        PatientAdmission admission = new PatientAdmission();


        //this person know context...
        try {
            admission.processAdmission(-1); // invalid age to trigger exception
        } catch (InvalidAgeException e) {
            System.out.println("Admission Failed: " + e.getMessage());
        }

        System.out.println("End of program.");
    }
}
