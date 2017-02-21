import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    char C=sc.next().charAt(0);
    if((C=='R')||(C=='r')){
        System.out.println("RED");
    }
    else if((C=='G')||(C=='g')){
        System.out.println("GREEN");
    }
    else if((C=='B')||(C=='b')){
        System.out.println("BLUE");
    }
    else{
        System.out.println("UNDEFINED");
    }
	}
}
