import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n>=60){
            System.out.print("senior");
        }
        else{
            System.out.print("notsenior");
        }
	}
}
