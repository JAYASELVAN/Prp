import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    int M=sc.nextInt();
    int N=sc.nextInt();
    int I,S=0;
    for(I=M;I<=N;I++){
        if((I%2)!=0){
            S=S+I;
        }
    }
    System.out.print(S);
	}
}
