/* IMPORTANT: Multiple classes and nested static classes are supported */

 // uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       int test=sc.nextInt();
       for(int t=1;t<=test;t++){
           int size=sc.nextInt();
           int num[]=new int[size];
           int c1[]=new int[size];
           int c2[]=new int[size];
           for(int i=0;i<size;i++){
               num[i]=sc.nextInt();
               int check=num[i],count=0,rem=0;
               while(check!=0){
                   rem=check%2;
                   if(rem==1){
                       count++;
                   }
                   check=check/2;
               }
               c1[i]=count;
               c2[i]=count;
           }
           Arrays.sort(c2);
           for(int i=0;i<size;i++){
               for(int j=0;j<size;j++){
                   if(c2[i]==c1[j]){
                       System.out.print(num[j]+" ");
                       c1[j]=-1;
                       break;
                   }
               }
           }
           System.out.println("");
       }
    }
}
