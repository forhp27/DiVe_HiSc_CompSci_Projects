/*
 * Diego Velasco
 * Start Date 10/27/2022 - End Date 12/14/2022
 * Project CYOA
 */
import java.util.Scanner;

public class StoryChoice {
  public StoryChoice() {
    
    String storyResponse;
    
    Scanner scan = new Scanner(System.in);
    
    
        // chooses which story is played.
      do {
        
        System.out.println("\nWelcome to Diego's CYOA!\nWhich story would you like to play?\n");
        System.out.println("a) Dora");
        System.out.println("b) Spongebob");
        System.out.println("");
        System.out.println("q) Quit Game");
        
        storyResponse = scan.next();
        
        
          // starts the Dora story game.
        if(storyResponse.equals("a")) {
          Dora doraStory = new Dora();
        }
        
          // starts the Spongebob story game.
        else if(storyResponse.equals("b")) {
          Spongebob spongebobStory = new Spongebob();
        }
        
        else if(storyResponse.equals("q")) {
            System.out.println("Quitting game...\n");
            break;
          }
        
          // Error input.
        else {
            System.out.println("Please enter a letter answer listed.");
        }
        
      } while (!storyResponse.equals("a") || !storyResponse.equals("b"));
    
    
  }
  
}