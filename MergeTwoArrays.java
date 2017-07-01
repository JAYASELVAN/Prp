import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n,m,i,j;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        m=sc.nextInt();
        int b[]=new int[m];
        int c[]=new int[m+n];
        for(i=0;i<m;i++){
            b[i]=sc.nextInt();
            c[i]=b[i];
        }
        int k=0;
        for(j=i;j<(m+n);j++){
            c[j]=a[k];
            k++;
        }
        Arrays.sort(c);
        for(i=0;i<(m+n);i++){
            System.out.print(c[i]+" ");
        }
	}
}
