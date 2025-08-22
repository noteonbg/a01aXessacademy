package a00com.poc.respectarchitecture.exceptions;


public class PatientNotFoundException extends RuntimeException {
    public PatientNotFoundException(String message) {
        super(message);
    }
}

