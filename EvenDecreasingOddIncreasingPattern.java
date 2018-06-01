import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int odd=n,even=n-1;
        
        if(n%2==0)
        {
            even=n;
            odd=n-1;
        }
        
        for(int i=even;i>0;i=i-2)
        {
            System.out.print(i+" ");
        }
        
        for(int i=1;i<=odd;i=i+2)
        {
            System.out.print(i+" ");
        }
        
	}
}
