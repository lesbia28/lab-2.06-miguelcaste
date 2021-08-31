package model;

//1. Create Student class with name and grade (this is an int in the range 0-100), then create Student
//        objects for 4 of your classmates. create a Map with a key of the student name and a value
//        of a Student object.

public class Student {
    private String name;
    private int grade;

    public Student() {
    }

    public Student(String name, int grade) {
        this.name = name;
        if (checkGrade(grade)){
            this.grade = grade;
        }

    }

    public boolean checkGrade(int grade){
        if (grade<0||grade>100){
            throw new IllegalArgumentException("Grade cannot be less than zero or greater than 100.");
        }else{
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (checkGrade(grade)){
            this.grade = grade;
        }
    }
}
