import java.util.Scanner;

public class ScannerTester {

    public static void main (String [] args){

       Scanner scan = new Scanner(System.in);
       System.out.println("Type your message!");
       String message = scan.nextLine();
       
       System.out.println("Age?");
       int age =  scan.nextInt();
       
       //nextdouble()
       //nextBoolean()
       //nextFloat()
       //nextByte()


       System.out.println  ("You wrote: " + message);
       System.out.println(age);
       
    }

}