package org.oops;

class cost{
    private String name;

    public cost(){
        name="ram";
    }

    public cost(String username){
        name=username;
    }

    public String getuname(){
        return name;
    }
}

public class constructor {
    public static void main(String[] args) {
        cost cost=new cost("sriram");
        cost cost2=new cost();
        System.out.println(cost.getuname());
        System.out.println(cost2.getuname());
    }
}
