
import java.util.*;

public class Co {
           String name;
           int age;
           void read() {
        	   Scanner s=new Scanner(System.in);
        	   System.out.println("enter your name: ");
        	   name=s.nextLine();
        	   
        	   System.out.println("enter your age:");
        	   age=s.nextInt();           }
           void print() {
        	   System.out.println("The name is: "+name);
        	   System.out.println("The age is: "+age);
           }
           
           public static void main(String args[]) {
        	   Co c1=new Co();
        	   c1.read();
        	   c1.print();
           }
}
