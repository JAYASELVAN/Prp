import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        int n,d;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n<=2000){
            System.out.print(n);
        }
        else{
            d=n/10;
            System.out.print(n-d);
        }
	}
}
