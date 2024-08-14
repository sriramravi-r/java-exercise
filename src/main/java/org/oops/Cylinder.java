package org.oops;

class cylincls{
    public double radius;
    public double height;

    public double lidArea(){
        return Math.PI*radius*radius;
    }

    public double totalSurfaceArea(){
        return 2*lidArea()+circumference()*height;
    }

    public double circumference(){
        return 2*Math.PI*radius;
    }

    public double volumn(){
        return lidArea()*height;
    }

}

public class Cylinder {
    public static void main(String[] args) {
        cylincls cylincls=new cylincls();
        cylincls.radius=7;
        cylincls.height=10;

        System.out.println(cylincls.lidArea());
        System.out.println(cylincls.totalSurfaceArea());
        System.out.println(cylincls.circumference());
        System.out.println(cylincls.volumn());
    }
}
