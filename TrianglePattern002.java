import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        for(int i=1;i<=(n/2)+1;i++){
            int k=(n/2)+1-i;
            for(int j=1;j<=k;j++){
                System.out.print("!");
            }
            int m=((i-1)*2)+1;
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            for(int j=1;j<=k;j++){
                System.out.print("!");
            }
            System.out.println("");
        }
	}
}
