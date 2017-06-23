import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n,i,max,min,temp;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        min=0;
        max=0;
        for(i=1;i<n;i++){
            if(a[max]<a[i]){
                max=i;
            }
            if(a[min]>a[i]){
                min=i;
            }
        }
        temp=a[max];
        a[max]=a[min];
        a[min]=temp;
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
	}
}
