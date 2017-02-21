import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int X=sc.nextInt();
    int I;
    int M=N;
    for(I=0;I>=0;I++){
        if(I!=0){
            N=N+M;
        }
        if((N%X)!=0){
            System.out.print(N+" ");
        }
        else{
            System.out.print(N);
            break;
        }
    }
	}
}
