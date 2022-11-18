package chapters.chapter11.Exercise02;

import chapters.chapter10.Exercise14.MyDate;

import java.util.Date;

public class Person {
    private String name;
    private String address;
    private String phone;
    private String email;

    public Person() {
        this("", "", "", "");
    }

    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
    @Override
    public String toString() {
        return "Class Name : Person \nThe person's name :" + getName();
    }
}

class Student extends Person {

    public static final int FRESHMAN = 0;
    public static final int SOPHOMORE = 1;
    public static final int JUNIOR = 2;
    public static final int SENIOR = 3;

    private int classStatus;

    public Student(String name, String address, String phone, String email,int classStatus){
        super(name,address,phone,email);
        this.classStatus = classStatus;
    }
    public String toString() {
        return "Class Name : Student \nThe person's name :" + getName();
    }
}

class Employee extends Person {
    private String office;
    private Double salary;
    private MyDate date;

    public Employee(String name, String address, String phone, String email,String office,double salary,MyDate date) {
        super(name,address,phone,email);
        this.office = office;
        this.salary = salary;
        this.date = date;
    }
    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate date() {
        return date;
    }

    public String toString() {
        return "Class Name : Employee \nThe person's name :" + getName();
    }

}

class Faculty extends Employee {
    private double hours;
    private double rank;

    public Faculty(String name, String address, String phone, String email,String office, double salary, MyDate date, double hours, double rank) {
        super(name,address,phone,email,office,salary,date);
        this.hours = hours;
        this.rank = rank ;
    }
    public String toString() {
        return "Class Name : Faculty \nThe person's name :" + getName();
    }
}

class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phone, String email,String office,double salary,MyDate date, String title) {
        super(name,address,phone,email,office,salary,date);
        this.title = title ;
    }

    public String toString() {
        return "Class Name : String \nThe person's name :" + getName();
    }
}