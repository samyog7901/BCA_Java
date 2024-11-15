import java.util.Scanner;
public class Stringconcat{
    public static void main(String[] args){
       
        StringBuffer sb = new StringBuffer("Sita");
        sb.append("Ram");
        System.out.println(sb);

        String s = "Sita";
        String r = "Ram";
        System.out.println(s + r);


    }
}