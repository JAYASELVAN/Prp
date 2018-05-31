import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=0,count=0,c1=0;
        
        while(n!=0)
        {
            int rem=n%10;
            
            if(rem!=0)
            {
                c1++;
            }
            else if(rem==0 && c1==0)
            {
                count++;
            }
            
            n=n/10;
            r=(r*10)+rem;
        }
        
        while(r!=0)
        {
            int rem=r%10;
            System.out.print(2*rem);
            r=r/10;
        }
        
        while(count!=0)
        {
            System.out.print("0");
            count--;
        }
        
	}
}
