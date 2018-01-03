import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int a[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        int d=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            if(a[i]%d==0)
            {
                System.out.print(a[i]+" ");
            }
        }
	}
}
