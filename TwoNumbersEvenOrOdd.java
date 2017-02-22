import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    int M=sc.nextInt();
    int N=sc.nextInt();
    int S=N+M;
    if((S%2)==0){
        System.out.print("even");
    }
    else{
        System.out.print("odd");
    }
	}
}
