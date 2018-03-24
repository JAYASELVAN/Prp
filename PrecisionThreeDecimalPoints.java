import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        double d=sc.nextDouble();
        d=Math.round(d*1000.0)/1000.0;
        System.out.println(d);
	}
}
