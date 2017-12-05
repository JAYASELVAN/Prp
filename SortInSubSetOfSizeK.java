import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int k=sc.nextInt();
        
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        int sub[]=new int[k];
        
        int i=0;
        while(i<n)
        {
            int count=0;
            for(int j=0;(j<k && i<n);j++)
            {
                sub[j]=a[i];
                i++;
                count++;
            }
            
            Arrays.sort(sub);
            for(int j=0;j<count;j++)
            {
                System.out.print(sub[j]+" ");
            }
            
            for(int j=0;j<count;j++){
                sub[j]=Integer.MAX_VALUE;
            }
        }
	}
}
