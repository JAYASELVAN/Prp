import java.util.*;
public class Hello {

    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<Integer>();
        Scanner sc=new Scanner(System.in);        
        int i=1;
        try{
            while(i!=0){
                ts.add(sc.nextInt());
            }
        }
        catch(Exception e){
            Iterator itr=ts.iterator();
            while(itr.hasNext()){
                System.out.print(itr.next()+" ");
            }
        }
	}
}
