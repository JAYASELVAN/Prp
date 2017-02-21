import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();
    int N=sc.nextInt();
    int i;
    for(i=A;i<=B;i++){
        if((i%N)!=0){
            System.out.println(i+" ");
        }
    }
	}
}
