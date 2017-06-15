import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        if(n1==n2){
            System.out.print("EQUAL");
        }
        else if(n1<n2){
            System.out.print(n1);
        }
        else{
            System.out.print(n2);
        }
	}
}
