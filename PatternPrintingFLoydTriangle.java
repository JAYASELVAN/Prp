import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        int n,i,j,count=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println("");
        }
	}
}
