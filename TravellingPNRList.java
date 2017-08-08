import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        int n,s,c;
        Scanner sc=new Scanner(System.in);
        s=sc.nextInt();
        n=sc.nextInt();
        LinkedList<String> ll=new LinkedList<String>();
        for(int i=0;i<n;i++){
            ll.add(sc.next());
        }
        c=sc.nextInt();
        for(int i=0;i<c;i++){
            ll.remove(sc.next());
        }
        Iterator<String> itr=ll.iterator();
        int count=0;
        while(itr.hasNext()&&count<s){
            System.out.println(itr.next());
            count++;
        }
	}
}
