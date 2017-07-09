import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        int date,month,year;
        Scanner sc=new Scanner(System.in);
        date =sc.nextInt();
        month=sc.nextInt();
        year=sc.nextInt();
        int age=2017-year-1;
        if((month<7)||((month==7)&&(date<=9))){
            age++;
        }
        System.out.print(age);
	}
}
