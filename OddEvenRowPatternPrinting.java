import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            if(i%2!=0){
                System.out.print("*");
                for(j=1;j<=i;j++){
                    System.out.print(j);
                }
            }
            else{
                for(j=i;j>0;j--){
                    System.out.print(j);
                }
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
