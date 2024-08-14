package org.oops;

class student{
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;

    public int total(){
        return m1+m2+m3;
    }

    public float average(){
        return (float) total() /3;
    }

    public char grade(){
        if(average()>=60){
            return 'A';
        }else{
            return 'B';
        }
    }

    public String toString(){
        return "Roll no:"+roll+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n"+"Grade:"+grade()+"\n";
    }
}

public class Studenttest {
    public static void main(String[] args) {
        student student=new student();
        student.roll=1;
        student.name="john";
        student.course="cs";
        student.m1=70;
        student.m2=80;
        student.m3=65;
        System.out.println("Total:"+student.total());
        System.out.println("Average:"+student.average());
        System.out.println("Details:\n"+student);
    }
}
