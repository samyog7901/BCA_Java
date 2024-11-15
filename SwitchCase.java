import java.util.Scanner;
public class SwitchCase{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    //conditional statement - SWITCH 

    System.out.println("Enter a day==");
    int day = input.nextInt();

    switch(day) {
        case 1:
            System.out.println("sunday");
            break;  //exit switch statement if condition holds true 
        case 2: 
            System.out.println("monday");
            break;

            case 3: 
            System.out.println("tuesday");
            break;

            case 4: 
            System.out.println("wednesday");
            break;
            case 5: 
            System.out.println("thursday");
            break;

            case 6: 
            System.out.println("friday");
            break;
        default: 
            System.out.println("saturday"); 

    }

    }
}