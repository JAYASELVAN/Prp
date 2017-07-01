import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n,i,j,count=0,k;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
            //System.out.println(a[i]);
        }
        for(i=0;i<(n-1);i++){
            k=0;
            //System.out.println(a[i]);
            for(j=(i+1);j<n;j++){
                if((a[i]==a[j])&&(a[i]>0)){
                    k=1;
                    a[j]=-1;
                }
            }
            if(k==1){
                count++;
            }
        }
        System.out.print(count);
	}
}
