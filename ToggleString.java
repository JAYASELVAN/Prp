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
       {
       String s=sc.next();
       for(char c:s.toCharArray()){
            System.out.print((Character.isLowerCase(c))?
            Character.toUpperCase(c):Character.toLowerCase(c));
       }
       }
    }
}
