import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n<0){
            System.out.print("negative");
        }
        else if(n>0){
            System.out.print("positive");
        }
        else{
            System.out.print("zero");
        }
	}
}
