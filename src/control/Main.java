package control;


//2. Create a method that takes a Map<String, Student>
//        as a parameter, increases every student’s grade by 10%, and returns the Map.

import model.Student;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student( "Alicia Sánchez", 80);
        Student s2=new Student("Almudena Álvarez", 60 );
        Student s3=new Student("Myriam Toro",75);
        Student s4=new Student("Pablo Gutierrez",79);
        HashMap<String,Student> studentHashMap=new HashMap<>();
        studentHashMap.put(s1.getName(),s1);
        studentHashMap.put(s2.getName(),s2);
        studentHashMap.put(s3.getName(),s3);
        studentHashMap.put(s4.getName(),s4);

        for (String s:studentHashMap.keySet()
             ) {
            System.out.println(s+" "+studentHashMap.get(s).getGrade());
        }
        HashMap<String,Student> newStudentHashMap=increaseGradesBy10Percent(studentHashMap);

        for (String s:newStudentHashMap.keySet()
        ) {
            System.out.println(s+" "+newStudentHashMap.get(s).getGrade());
        }


        
    }

    public static HashMap<String,Student> increaseGradesBy10Percent(HashMap<String,Student> studentHashMap){
        HashMap<String,Student> newStudentHashMap=new HashMap<>();
        int grade=0;

        for (String s:studentHashMap.keySet()
        ) {
            grade=studentHashMap.get(s).getGrade();
            newStudentHashMap.put(s,new Student(s,(int)(grade*1.10)));

        }

        return newStudentHashMap;
    }

}
