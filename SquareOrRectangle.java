import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    int L=sc.nextInt();
    int B=sc.nextInt();
    if(L==B){
        System.out.print("SQUARE");
    }
    else{
        System.out.print("RECTANGLE");
    }
	}
}
