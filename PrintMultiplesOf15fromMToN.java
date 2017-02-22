import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    int M=sc.nextInt();
    int N=sc.nextInt();
    int I;
    for(I=M;I<=N;I++){
        if((I%15)==0){
            System.out.print(I+" ");
        }
    }
	}
}
