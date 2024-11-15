import java.util.*;
public class Multi {
    public static int printProduct(int a, int b){
        int product = a*b;
        return product;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        int product = printProduct(x,y);//function call
        System.out.println("The product of given numbers is "+product+".");
        sc.close();
    }
}
