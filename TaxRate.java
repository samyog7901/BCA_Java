import java.util.Scanner;

public class TaxRate{
public static void main(String[] args){

  Scanner input = new Scanner(System.in);

  System.out.println("Enter the price of one item==");
  double p = input.nextInt();

  
  System.out.println("Enter the no of items==");
  double q = input.nextInt();

  double totalPrice = (p * q);

  final double TAX_RATE = 0.13;

  double finalAmount = totalPrice + (totalPrice * TAX_RATE);

System.out.println("Total Price:Rs. " + totalPrice);

System.out.println("Tax amount:Rs. " + totalPrice * TAX_RATE);

System.out.println("Final Price:Rs. " + finalAmount);


    }
}
