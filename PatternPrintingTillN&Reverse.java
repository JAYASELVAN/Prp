import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println("");
        }
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(i);
            }
            System.out.println("");
        }
	}
}
