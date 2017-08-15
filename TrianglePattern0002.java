import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        n=(n/2)+1;
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print("!");
            }
            int m=(2*(i-1))+1;
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            for(int j=n;j>i;j--){
                System.out.print("!");
            }
            System.out.println("");
        }
	}
}
