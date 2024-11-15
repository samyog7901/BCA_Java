import java.util.Scanner;

public class Condstat{

 public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your grade==");
      char grade = input.next().charAt(0);

    switch(grade) {
        case 'A':
            System.out.println("Excellent!");
            break;  //exit switch statement if condition holds true 
        case 'B': 
            System.out.println("Very Good!");
            break;

        case 'C': 
            System.out.println("Good!");
            break;

        case 'D': 
            System.out.println("Poor!");
            break;
        case 'E': 
            System.out.println("Very Poor!");
            break;
        default: 
            System.out.println("Fail!"); 

    }
 }
    }


