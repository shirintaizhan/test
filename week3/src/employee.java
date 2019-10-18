import java.util.Date;

public class employee {
    private int id;
    private String name;
    private String surName;
    private String address;
    private int salary;
    private Date age;
    private String position;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public short getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public employee(int id, String name, String surName, String address,int salary, Date age, String position) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.address = address;
        this.salary = salary;
        this.age = age;
        this.position = position;
    }
}
