import java.util.*;
public class Area {
    public static int printAreaOfRectangle(int a, int b){
        int area = a*b;
        return area;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int x = sc.nextInt();
        System.out.print("Enter breadth: ");
        int y = sc.nextInt();
        int area = printAreaOfRectangle(x,y);//function call
        System.out.println("The area of rectangle is "+area+" metresquare.");
        sc.close();
    }
}