import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    char a=sc.next().charAt(0);
    char b;
    System.out.print(a+"-");
    if(Character.isUpperCase(a)){
        b=Character.toLowerCase(a);
    }
    else{
        b=Character.toUpperCase(a);
    }
    System.out.print(b);
	}
}
