import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int a[]=new int[100];
    int i;
    for(i=0;i<N;i++){
        a[i]=sc.nextInt();
    }
    int P=0;
    for(i=0;i<N;i++){
        P=P+a[i];
    }
    System.out.println(P);
	}
}
