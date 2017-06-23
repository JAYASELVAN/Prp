import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n,i,od=0,ev=0,dif;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                ev=ev+arr[i];
            }
            else{
                od=od+arr[i];
            }
        }
        dif=od-ev;
        System.out.print(dif);
	}
}
