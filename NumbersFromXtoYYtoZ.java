import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        
        for(int i=x;i<=y;i++)
        {
            if(i!=y)
            {
                System.out.print(i+" ");
            }
            
            else
            {
                System.out.println(i);    
            }
        }
        
        for(int i=y;i<=z;i++)
        {
            System.out.print(i+" ");
        }
	}
}
