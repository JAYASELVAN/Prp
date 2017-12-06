import java.util.*;
public class Hello 
{

    public static int count(String s)
    {
        LinkedHashSet<Character> lh=
            new LinkedHashSet<Character>();
        
        for(Character ch:s.toCharArray())
        {
            lh.add(ch);  
        }
        int len=lh.size();
        return len;
    }
    
    public static void main(String[] args) 
    {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        
        String words[]=new String[n];
        int max=-1;
        int pos=-1;
        
        for(int i=0;i<n;i++)
        {
            words[i]=sc.nextLine();  
            int temp=count(words[i]);
            if(max<=temp){
                max=temp;
                pos=i;
            }
        }
        System.out.println(words[pos]);
	}
}
