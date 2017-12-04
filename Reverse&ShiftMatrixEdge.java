import java.util.*;
public class Hello 
{
    public static int reverse(int a){
        int rev=0;
        while(a!=0)
        {
            int r=a%10;
            rev=rev*10+r;
            a=a/10;
        }
        return rev;
    }
    
    public static void main(String[] args) 
    {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
                if(i==0 || j==0 || i==n-1 || j==m-1)
                {
                    arr[i][j]=reverse(arr[i][j]);
                }
                //System.out.print(arr[i][j]+" ");
            }
            //System.out.println();
        }
        
        int temp1=arr[0][0];
        int temp2=arr[0][0];
        
        for(int i=1;i<m;i++)
        {
            temp2=arr[0][i];
            arr[0][i]=temp1;
            temp1=temp2;
        }
        
        for(int i=1;i<n;i++)
        {
            temp2=arr[i][m-1];
            arr[i][m-1]=temp1;
            temp1=temp2;
        }
        
        for(int i=m-2;i>-1;i--){
            temp2=arr[n-1][i];
            arr[n-1][i]=temp1;
            temp1=temp2;
        }
        
        for(int i=n-2;i>-1;i--){
            temp2=arr[i][0];
            arr[i][0]=temp1;
            temp1=temp2;
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
	}
}
