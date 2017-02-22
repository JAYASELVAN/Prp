import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    if(N>0){
        System.out.print("positive");
    }
    else if(N==0){
        System.out.print("zero");
    }
    else{
        System.out.print("negative");
    }
	}
}
