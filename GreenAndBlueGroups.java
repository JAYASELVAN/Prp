import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        int n,cg=0,cb=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<Integer>(n);
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }
        for(int i:al){
            if(i%2==0){
                cb++;
            }
            else{
                cg++;
            }
        }
        System.out.print(cg+" "+cb);
	}
}
