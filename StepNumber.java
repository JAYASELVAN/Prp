import java.util.*;
public class Hello {

    public static void main(String[] args) 
    {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r1=(n%10)+1;
        while(n!=0)
        {
            int r2=n%10;
            
            if(r2-r1==1 || r2-r1==-1)
            {
                r1=r2;
                n=n/10;
            }
            
            else
            {
                System.out.print("NO");
                return;
            }
        }
        
        System.out.print("YES");
        
	}
}
