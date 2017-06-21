import java.util.*;
public class Hello {
    public static void main(String[] args) {
		//Your Code Here
        int n,k,i,j,count=0,m,l=0,min=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int b[]=new int[n];
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]==k){
                a[i]=0;
                count=1;
            }
            else if(b[i]>k){
                a[i]=0;
                
            }
        }
        for(i=0;i<(n-1);i++){
            if((i>0)&&(i<(n-2))){
                if(a[i]==a[i-1]){
                    i++;
                }
            }
            for(j=i+1;j<n;j++){
                if((a[i]+a[j])==k){
                    count++;
                    for(m=n-1;m>=0;m--){
                        if(a[i]==a[m]){
                            a[m]=0;
                        }
                       if(a[j]==a[m]){
                            a[m]=0;
                        }
                    }
                    break;
                }
            }
        }
        System.out.println(count);
	}
}
