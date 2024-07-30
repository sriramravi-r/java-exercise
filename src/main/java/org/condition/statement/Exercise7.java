package org.condition.statement;

import java.util.Scanner;

//Find type of website and the protocol used
public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Enter url:- ");
        String url=scanner.nextLine();
        String protocol=url.substring(0,url.indexOf(":"));
//        System.out.println(protocol);
        if(protocol.equalsIgnoreCase("http")){
            System.out.println("HyperText transfer protocol");
        }else if(protocol.equalsIgnoreCase("ftp")){
            System.out.println("File transfer protocol");
        }
        String ext=url.substring(url.lastIndexOf("."));
//        System.out.println(ext);
        if(ext.equalsIgnoreCase("com")){
            System.out.println("Commerical");
        }else if(ext.equals("org")){
            System.out.println("Organisation");
        }else if(ext.equals("net")){
            System.out.println("Network");
        }
    }
}
