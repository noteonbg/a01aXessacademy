package a09medicalexample_embeddable.model;



import jakarta.persistence.*;

@Table(name = "patient_poc")
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String gender;
    private String condition;

    @Embedded
    private Address address;

    @Transient
    private boolean isSeniorCitizen;

    public Patient() {}

    public Patient(String name, int age, String gender, String condition, Address address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.condition = condition;
        this.address = address;
        this.isSeniorCitizen = age >= 60;
    }

    // Getters and Setters

    public boolean isSeniorCitizen() {
        return age >= 60;
    }

    public void setSeniorCitizen(boolean seniorCitizen) {
        this.isSeniorCitizen = seniorCitizen;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

