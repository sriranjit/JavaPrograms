class Student {
    private String name;
    private int age;
    private char grade;
    
    public void setAll(String name, int age, char grade) {
        this.name = name;
        setAge(age);   
        setGrade(grade);  
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
        if (age >= 0) { 
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade. Please enter a valid letter grade (A, B, C, D, F).");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setAll("Ranjit",19,'A');
        System.out.println("Student: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Grade: " + student1.getGrade());
        student1.setAge(-5);  
        student1.setGrade('E'); 
        student1.setAge(22);   
        student1.setGrade('B'); 
        System.out.println("\nUpdated Student Info:");
        System.out.println("Student: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Grade: " + student1.getGrade());
    }
}
