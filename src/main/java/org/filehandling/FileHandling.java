package org.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class exe extends Exception{
    @Override
    public String toString(){
        return "IOException";
    }
}

public class FileHandling {
    public static void main(String[] args) throws exe {
        File file=new File("myfile.txt");
        try {
            file.createNewFile();
            FileWriter fileWriter=new FileWriter("myfile.txt");
            fileWriter.write("i have write its");
            fileWriter.close();
            Scanner scanner=new Scanner(file);
            if(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            if(file.delete()){
                System.out.println("success fully deleted");
            }
        }catch (Exception e){
            throw new exe();
        }
    }
}
