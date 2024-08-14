package org.oops;

class hide{
    private String name;
    private String rollno;

    public void setname(String username){
        name=username;
    }

    public String getname(){
        return name;
    }

    public void setrollno(String rno){
        rollno=rno;
    }

    public String getrollno(){
        return rollno;
    }
}

public class Datahiding {
    public static void main(String[] args) {
        hide h=new hide();
        h.setname("sri");
        h.setrollno("15");
        System.out.println(h.getname());
        System.out.println(h.getrollno());
    }
}
