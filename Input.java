
package input;
import java.util.Scanner;


public class Input {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("What is yourname?");
        String answer = myScanner.nextLine();
        System.out.println("Hi there, " + answer);
        System.out.println("What is your age?");
        int age = myScanner.nextInt();
        System.out.println("You are: " + age);
        if (age< 18) {
        System.out.println("You have " + (18 - age) + " years left before you can vote " );
        )else(
                System.out.println("You have been able to vote for " + (age-18) + "years");
                
        }
        
                
             
    }
    
}
