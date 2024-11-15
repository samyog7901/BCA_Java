import java.util.Scanner;

public class String_input{
public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first name==");
    String firstName = input.nextLine();
     System.out.println("Enter last name==");
    String lastName = input.nextLine();
    
    System.out.println("Enter Age==");
    int age = input.nextInt();
    

    System.out.println("Enter Address==");
    String add = input.next();

    System.out.println("Full Name = " + firstName+" "+lastName);
    System.out.println("Age = " + age);
    System.out.println("Address = " + add);
}

}