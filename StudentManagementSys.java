import java.util.*;
public class StudentManagementSys {
    public static void main(String[] args) {
        Student s1 = new Student("Aaron", 101);
        s1.setMarks(94);
        System.out.println("Undergraduate Student:");
        s1.display();
        System.out.println();
        Student s2 = new GraduateStudent("Jacob", 401);
        s2.setMarks(85);
        System.out.println("Graduate Student:");
        s2.display();
    }
}

class Student {
    private String name;
    private int rollNumber;
    private double marks;
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks!");
        }
    }
    public double getMarks() {
        return marks;
    }
    public String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}
class GraduateStudent extends Student {

    public GraduateStudent(String name, int rollNumber) {
        super(name, rollNumber);
    }
    public String calculateGrade() {
        double marks = getMarks();
        if (marks >= 85) return "A+";
        else if (marks >= 70) return "A";
        else if (marks >= 60) return "B";
        else if (marks >= 50) return "C";
        else return "F";
    }
}


