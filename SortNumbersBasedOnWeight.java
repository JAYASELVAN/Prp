import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=n-1;i>-1;i--){
            int count=0;
            int sqrt=(int) Math.sqrt(a[i]);
            if(sqrt*sqrt==a[i]){
                count=count+5;
            }
            if(a[i]%12==0){
                count+=4;
            }
            if(a[i]%2==0){
                count+=3;
            }
            b[i]=count;
            c[i]=count;
        }
        Arrays.sort(b);
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>-1;j--){
                if(b[i]==c[j]){
                    System.out.println(a[j]);
                    c[j]=-1;
                }
            }
        }
	}
}
