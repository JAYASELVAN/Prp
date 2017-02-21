import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int A[]=new int [10000];
    int I,S=0;
    for(I=0;I<N;I++){
        A[I]=sc.nextInt();
    }
    for(I=0;I<N;I++){
        S=S+A[I];
    }
    System.out.print(S);
	}
}
