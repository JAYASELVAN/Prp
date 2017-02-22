import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int R,S=0;
    while(N!=0){
        R=N%10;
        if((R%2)!=0){
            S=S+R;
        }
        N=N/10;
    }
    System.out.println(S);
	}
}
