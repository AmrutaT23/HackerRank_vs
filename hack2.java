import java.util.*;
import java.math.BigInteger;
public class hack2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to check");
        int t = sc.nextInt();
        

        for(int i=0 ;i<t ; i++)
        {
            System.out.println("Enter the number");
            int n = sc.nextInt();
            if(n>=Byte.MIN_VALUE && n<=Byte.MAX_VALUE)
            System.out.println("* byte");
            if(n>=Integer.MIN_VALUE && n<=Integer.MAX_VALUE)
            System.out.println("* int");
            if(n>=Short.MIN_VALUE && n<=Short.MAX_VALUE)
            System.out.println("* short");
            if(n>=Long.MIN_VALUE && n<=Long.MAX_VALUE)
            System.out.println("* long");
            

        }
    }
}
