/*
 * Diego Velasco
 * Start Date 10/27/2022 - End Date 12/14/2022
 * Project CYOA
 */
import java.util.Scanner;

public class MainCYOA {
  
  public static void main(String[] args) {
    
    boolean codeIsRunning = true;
    
    Scanner scan = new Scanner(System.in);
    
    
      // asks user if they want to run the program or not.
    do {
      
      String runResponse;
      
      System.out.println("Hello! Would you like to play Diego's CYOA?\n(y/n)");
      runResponse = scan.next();
      
        // starts code.
      if (runResponse.equals("y")) {
        StoryChoice scClass = new StoryChoice();
      }
      
        // stops code.
      else if (runResponse.equals("n")) {
        System.out.println("Stopping code. Goodbye!");
        codeIsRunning = false;
      }
      
        // Error input, stops code.
      else {
        System.out.println("No answer listed above was entered.\nStopping code. Goodbye!");
        codeIsRunning = false;
      }
      
    } while (codeIsRunning == true);
      
  }
  
}