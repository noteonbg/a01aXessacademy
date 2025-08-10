package programmingbasics.a04polymorphism;

public class Hospital {
    public static void main(String[] args) {
        Staff staff1 = new Nurse();   // upcasting
        Staff staff2 = new Doctor();  // upcasting

        System.out.println("=== Run-Time Polymorphism ===");
        staff1.performDuties();  // Calls Nurse's version
        staff2.performDuties();  // Calls Doctor's version
    }
}

