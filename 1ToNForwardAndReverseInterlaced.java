import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int a=n,b=1;a>0;a--,b++)
        {
            System.out.print(b+" "+a+" ");
        }
        
	}
}
