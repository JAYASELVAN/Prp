import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        char c;
        Scanner sc=new Scanner(System.in);
        c=sc.next().charAt(0);
        if((c=='w')||(c=='W')){
            System.out.print("whatsapp");
        }
        else if((c=='f')||(c=='F')){
            System.out.print("facebook");
        }
        else if((c=='t')||(c=='T')){
            System.out.print("twitter");
        }
        else{
            System.out.print("undefined");
        }
	}
}
