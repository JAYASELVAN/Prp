import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        int n,sum=0,i,r,rev=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            rev=0;
            if(a[i]>0){
                if(a[i]%2!=0){
                    sum=sum+a[i];
                }
                else if(a[i]%2==0){
                    while(a[i]!=0){
                        r=a[i]%10;
                        rev=(rev*10)+r;
                        a[i]=a[i]/10;
                    }
                    sum=sum+rev;
                }
            }
        }
        System.out.print(sum);
	}
}
