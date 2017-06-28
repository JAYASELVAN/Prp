import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n,i,j,count,k=0,max,m;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int b[]=new int[n];
        int c[]=new int[n];
        Arrays.sort(a);
        for(i=0;i<n;i++){
            count=0;
            if(a[i]>=0)
            {
                b[k]=a[i];
                //System.out.print(b[k]+" ");
                for(j=i;j<n;j++){
                    if(a[i]==a[j]){
                        count++;
                        if(i!=j){
                            a[j]=a[j]*-1;
                        }
                    }
                }
                c[k]=count;
                k++;
                //System.out.println(c[k]);
            }
        }
        //System.out.print(k);
        for(i=0;i<k;i++){
            max=c[0];
            m=0;
            for(j=0;j<k;j++){
                if(max<c[j]){
                    max=c[j];
                    m=j;
                }
            }
            c[m]=c[m]*-1;
            System.out.print(b[m]+" ");
        }
	}
}
