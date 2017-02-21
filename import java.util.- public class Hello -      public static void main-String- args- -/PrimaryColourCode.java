import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    char C=sc.next().charAt(0);
    if((C=='r')||(C=='R')){
        System.out.println("RED");
    }
    else if((C=='g')||(C=='G')){
        System.out.println("GREEN");
    }
    else if((C=='b')||(C=='B')){
        System.out.println("BLUE");
    }
    else{
        System.out.println("UNDEFINED");
    }
	}
}
