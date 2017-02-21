import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int rev=0,r;
    while(N!=0){
        r=N%10;
        rev=(rev*10)+r;
        N=N/10;
    }
    System.out.print(rev);
	}
}
