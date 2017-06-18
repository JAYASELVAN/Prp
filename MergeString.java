import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        String s1,s2;
        int l1,l2,tot,j,count=0,k;
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        s2=sc.nextLine();
        l1=s1.length();
        l2=s2.length();
        tot=l1+l2;
        for(j=l1-1;j>=0;j--){
            k=1;
            if((s2.contains(s1.substring(j,l1)))&&(s1.contains(s2.substring(0,k)))){
                count++;
                k++;
            }
            else{
                break;
            }
        }
        tot=tot-count;
        System.out.print(tot);
	}
}
