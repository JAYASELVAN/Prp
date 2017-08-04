import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        String s[]={"Arun","Balaji","Chandra"};
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
        int b[]=new int[3];
        for(int i=0;i<3;i++){
            a[i]=sc.nextInt();
            b[i]=a[i];
        }
        Arrays.sort(a);
        if(a[0]==a[2]){
            System.out.print("TIE");
        }
        else if(a[1]<a[2]&&a[0]<a[1]){
            for(int i=0;i<3;i++){
                if(b[i]==a[2]){
                    System.out.print(s[i]);
                }
            }
        }
        else{
            for(int i=0;i<3;i++){
                if(a[1]==b[i]){
                    System.out.print(s[i]+" ");
                }
            }
        }
	}
}
