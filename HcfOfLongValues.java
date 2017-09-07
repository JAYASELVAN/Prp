import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        long n1,n2;
        Scanner sc=new Scanner(System.in);
        n1=sc.nextLong();
        n2=sc.nextLong();
        long max=n1,min=n2;
        if(n1<n2){
            max=n2;
            min=n1;
        }
        long hcf=1;
        if(max%min==0){
            hcf=min;
        }
        else{
            long i=2;
            for(;i<min;i++){
                long val=min/i;
                if(n1%val==0 && n2%val==0){
                    hcf=val;
                    break;
                }
            }
        }
        System.out.print(hcf);
	}
}
