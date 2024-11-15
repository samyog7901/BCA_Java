import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Sam{
    public static void main(String[] args){
      
          try{
            File file = new File("samyog.txt");
            Scanner input = new Scanner(file);

            String fName = input.next();
            input.nextLine();
            String lName = input.next();
            input.nextLine();
            int age = input.nextInt();
            input.nextLine();
            String add = input.nextLine();


            System.out.println("Full name: " + fName +" "+ lName);

            System.out.println("Age: " + age);

            System.out.println("Address: " + add);

            input.close();

            }

       catch (FileNotFoundException e){
        System.out.println("File not found: " + e.getMessage());
       } 

    }
}