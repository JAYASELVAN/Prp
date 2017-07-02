import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        int n,i,j,temp;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<(n-1);i++){
            if((a[i]%2)==0){
                for(j=(i+1);j<n;j++){
                    if((a[i]>a[j])&&((a[j]%2)==0)){
                        temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
            else{
                for(j=(i+1);j<n;j++){
                    if((a[i]>a[j])&&((a[j]%2)!=0)){
                        temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
	}
}
