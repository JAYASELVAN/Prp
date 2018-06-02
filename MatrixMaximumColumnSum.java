import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int a=0;
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a=sc.nextInt();
                b[j]=b[j]+a;
            }
        }
        
        Arrays.sort(b);
        System.out.print(b[n-1]);
	}
}
