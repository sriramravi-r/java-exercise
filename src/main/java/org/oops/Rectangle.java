package org.oops;

class reactcls{
    public double length;
    public double breadth;

    public double area(){
        return length*breadth;
    }

    public double perimeter(){
        return 2 * (length * breadth);
    }

    public boolean isSqure(){
        return length == breadth;
    }
}

public class Rectangle {

    public static void main(String[] args) {
        reactcls rcls=new reactcls();
        rcls.length=2;
        rcls.breadth=2;

        System.out.println(rcls.area());
        System.out.println(rcls.perimeter());
        System.out.println(rcls.isSqure());
    }
}
