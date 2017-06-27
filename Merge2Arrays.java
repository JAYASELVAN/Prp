import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        m=sc.nextInt();
        int[] b=new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        Arrays.sort(b);
        int[] result=new int[(n+m)];
        System.arraycopy(a,0,result,0,n);
        System.arraycopy(b,0,result,n,m);
        Arrays.sort(result);
        for(int i:result)
            System.out.println(i);
	}
}
