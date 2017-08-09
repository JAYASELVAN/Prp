import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pack[]=new int[n];
        for(int i=0;i<n;i++){
            pack[i]=sc.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(n%(i+1)==0){
                int mul=n/(i+1);
                int check=pack[i]*mul;
                if(max<check){
                    max=check;
                }
            }
        }
        System.out.print(max);
	}
}
