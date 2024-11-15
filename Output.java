import java.util.Scanner;

public class Output{

public static void main(String[] args){
    Scanner input = new Scanner(System.in);

System.out.println("Enter your name: ");
String name = input.nextLine();

System.out.println("Enter your Age: ");
int age = input.nextInt();


System.out.println("Enter Gender: ");
char gen = input.next().charAt(0);

System.out.println("Are you a student(Yes/No): ");
Boolean YN = input.nextBoolean();


System.out.println("Enter a floating point number: ");
float num = input.nextFloat();



System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Gender: " + gen);
System.out.println("Student : " + YN);
System.out.println("Result: " + num);

}

}