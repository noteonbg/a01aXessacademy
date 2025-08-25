package respectarchitecture.model;

public class Patient {

    private String id;
    private String name;
    private int age;
    private String gender;
    private String condition;

    public Patient(String id, String name, int age, String gender, String condition) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.condition = condition;
    }

    // Getters and Setters (or use Lombok if preferred)

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
}
