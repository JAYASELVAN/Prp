import java.util.*;
public class Hello {

    public static void main(String[] args) 
    {
		//Your Code Here
        double n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextDouble();
        n=Math.round (n*100.0)/100.0;
        System.out.println("The price is "+n);
	}
}
