import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    char L=sc.next().charAt(0);
    if((L=='w')||(L=='W')){
        System.out.print("whatsapp");
    }
    else if((L=='T')||(L=='t')){
        System.out.print("twitter");
    }
    else if((L=='F')||(L=='f')){
        System.out.print("facebook");
    }
    else{
        System.out.print("undefined");
    }
	}
}
