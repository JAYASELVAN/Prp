import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    int M=sc.nextInt();
    int N=sc.nextInt();
    int X=sc.nextInt();
    int I;
    for(I=N;I>=M;I--){
        if((I%X)==0){
            System.out.print(I+" ");
        }
    }
	}
}
