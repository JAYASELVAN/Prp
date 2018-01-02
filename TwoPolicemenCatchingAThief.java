import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int test=Integer.parseInt(sc.nextLine());
        
        for(int i=0;i<test;i++)
        {
            int p1,p2,t,c1,c2;
            p1=sc.nextInt();
            p2=sc.nextInt();
            t=sc.nextInt();
            
            c1=Math.abs(t-p1);
            c2=Math.abs(t-p2);
            
            if(c1==c2)
            {
                System.out.println("Both");
            }
            else if(c1<c2)
            {
                System.out.println("Police1");
            }
            else
            {
                System.out.println("Police2");
            }
            
        }
	}
}
