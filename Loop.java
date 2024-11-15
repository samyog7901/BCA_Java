import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Loop{


public static void main(String[] args){
   try{
    File file = new File("kanha.txt");
     Scanner sc = new Scanner(file);

     while(sc.hasNextLine()){
     }
     String kanha = sc.nextLine();
     System.out.println("Kanha's Info: " + kanha);

   }catch (FileNotFoundException e){
        System.out.println("File not found: " + e.getMessage());
       } 
   }

}

