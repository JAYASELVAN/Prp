import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int X=sc.nextInt();
    int I,S;
    for(I=1;I<=X;I++){
        S=N*I;
        System.out.print(S+" ");
    }
	}
}
