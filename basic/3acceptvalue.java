import java.util.*;
import java.lang.*;
class acceptvalue
{
    public static void main(String[] args) {
    	
    	
         Scanner scan = new Scanner(System.in);
         System.out.println("enter the firstname");
          String fn = scan.nextLine();;
    	 System.out.println("enter the lastname");
    	String ln = scan.nextLine();
    	  System.out.println("enter the qualification");
    	String qu = scan.nextLine();

          System.out.println("enter totalmarks value");
         int tm = scan.nextInt();  

          int pr = scan.nextInt();
               pr= tm/200;

          System.out.println("persentage"+ pr);
              

    }


}