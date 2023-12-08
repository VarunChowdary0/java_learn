package ConstructorsInJava.ConstructorOverLoading;

class Student_121{
    String name;
    String rollNo;
    int age;
    double grade;
    Student_121(String N){  // Constructor 1
        name =N;
        System.out.println("C-1 name: "+name);
    }
    Student_121(String N,String roll){  // Constructor 2
        name =N;
        rollNo = roll;
        System.out.println("C-2 name: "+name+" roll no: "+rollNo);
    }
    Student_121(String N,String roll,int ag){  // Constructor 3
        name =N;
        rollNo = roll;
        age = ag;
        System.out.println("C-3 name: "+name+" roll no: "+rollNo+" age :"+age);
    }
    Student_121(String N,String roll,int ag, double grd){  // Constructor 4
        name =N;
        rollNo = roll;
        age = ag;
        grade = grd;        
        System.out.println("C-4 name: "+name+" roll no: "+rollNo+" age :"+age+" Grade: "+grade);
    }
}
public class Example_112 {
    public static void main(String[] args) {
        Student_121 S1 = new Student_121("Varun");
        Student_121 S2 = new Student_121("Varun","22951A05G8");
        Student_121 S3 = new Student_121("Varun","22951A05G8",19);
        Student_121 S4 = new Student_121("Varun","22951A05G8",19,8.6);
    }
}
