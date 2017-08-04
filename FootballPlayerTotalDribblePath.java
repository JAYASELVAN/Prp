import java.util.*;
import java.math.BigInteger;
public class Hello {
    public static BigInteger factorial(int x){
        BigInteger fact=BigInteger.valueOf(1);
        for(int i=x;i>=1;i--)
        fact=fact.multiply(BigInteger.valueOf(i));
        return fact;
    }
    public static void main(String[] args) {
        //Your Code Here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        BigInteger a=factorial((x-1)+(y-1));
        BigInteger b=factorial(x-1);
        BigInteger c=b.multiply(factorial(y-1));
        System.out.println(a.divide(c));
    }
}
