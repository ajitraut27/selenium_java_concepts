package pojo_serialization_deserialization;

public class pojo_employee {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private double salary;

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(Double salary){
        this.salary = salary;
    }
}
