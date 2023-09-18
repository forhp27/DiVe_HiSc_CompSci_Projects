/*
 * Diego Velasco
 * Start Date 10/27/2022 - End Date 12/14/2022
 * Project CYOA
 */
import java.util.Scanner;

public class Dora {
  
  public Dora() {
    
      // user's decisions.
    String responseOne;
    String responseTwo;
    String responseThree;
    String responseFour;
    
      // first choice in Dora story.
    System.out.println("\nWelcome to the Dora story game!");
    System.out.println("Today is Boots' birthday! We have to get him a birthday present!\nWhat store do you want to shop at?");
    System.out.println("a) Walmart");
    System.out.println("b) Payless");
    
    Scanner scan = new Scanner(System.in);
    
    
    do {
      
      responseOne = scan.next();
      
        // choices (A)
      if(responseOne.equals("a")) {
        
        System.out.println("You walk into walmart. What aisle do you want to go to?");
        System.out.println("a) Candy Aisle");
        System.out.println("b) Fruit Aisle");
        
        responseTwo = scan.next();
        
          // choices (A,A)
        if(responseTwo.equals("a")) {
          
          System.out.println("You're looking down the candy aisle for banana candy.");
          System.out.println("a) Grab banana runts");
          System.out.println("b) Grab banana laffy taffy");
          
          responseThree = scan.next();
          
            // choices (A,A,A)
          if(responseThree.equals("a")) {
            System.out.println("Do you want to bag your gift?");
            System.out.println("a) Bag your gift");
            System.out.println("b) Don't bag your gift");
            
            responseFour = scan.next();
            
              // choices (A,A,A,A)
            if (responseFour.equals("a")) {
              System.out.println("\nYou leave the store and head to Boots' party.\nWhen you arrive, he greets you and you give him your gift!");
              System.out.println("He likes your bag of banana runts! He likes it so much, he hangs the bag on a hook on the ceiling and starts to hit it like a piñata. You can stay at his party. :)");
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
            }
            
              // choices (A,A,A,B)
            else if (responseFour.equals("b")) {
              System.out.println("\nYou leave the store and head to Boots' party.\nWhen you arrive, he greets you and you give him your gift!");
              System.out.println("He feels weird about your gift of a handful of banana runts. He says you can stay at his party ig. :|");
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
            } 
            
              // Error input.
            else {
              System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
              System.out.println("a) Walmart");
              System.out.println("b) Payless");
            }
          }
            
            // choices (A,A,B)
          else if(responseThree.equals("b")) {
            System.out.println("Do you want to put it in a piñata?");
            System.out.println("a) Yes");
            System.out.println("b) No");
            
            responseFour = scan.next();
            
              // choices (A,A,B,A)
            if (responseFour.equals("a")) {
              System.out.println("\nYou leave the store and head to Boots' party.\nWhen you arrive, he greets you and you give him your gift!");
              System.out.println("He likes your piñata of banana laffy taffy! He says you can stay at his party. :)");
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
            }
            
              // choices (A,A,B,B)
            else if (responseFour.equals("b")) {
              System.out.println("\nYou leave the store and head to Boots' party.\nWhen you arrive, he greets you and you give him your gift!");
              System.out.println("He feels awkward about your handful of banana laffy taffy. He says thanks and looks at you weird. :|");
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
            }
            
              // Error input.
            else {
              System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
              System.out.println("a) Walmart");
              System.out.println("b) Payless");
            }
          }
          
            // Error input.
          else {
            System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
            System.out.println("a) Walmart");
            System.out.println("b) Payless");
          }
        }
        
          // choices (A,B)
        else if (responseTwo.equals("b")) {
          
          System.out.println("You're looking down the fruit aisle for fruit.");
          System.out.println("a) Grab bananas");
          System.out.println("b) Grab a watermelon");
          
          responseThree = scan.next();
          
            // choices (A,B,A)
          if(responseThree.equals("a")) {
            System.out.println("Do you want to bag your gift?");
            System.out.println("a) Bag your gift");
            System.out.println("b) Don't bag your gift");
            
            responseFour = scan.next();
            
              // choices (A,B,A,A)
            if (responseFour.equals("a")) {
              System.out.println("\nYou leave the store and head to Boots' party.\nWhen you arrive, he greets you and you give him your gift!");
              System.out.println("He likes your gift of bananas! He says you can stay and have fun! :D");
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
            }
            
              // choices (A,B,A,B)
            else if (responseFour.equals("b")) {
              System.out.println("\nYou leave the store and head to Boots' party.\nWhen you arrive, he greets you and you give him your gift!");
              System.out.println("He appreciates your gift of bananas! He says you can stay and chill around. :)");
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
            } 
            
              // Error input.
            else {
              System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
              System.out.println("a) Walmart");
              System.out.println("b) Payless");
            }
          }
            
            // choices (A,B,B)
          else if(responseThree.equals("b")) {
            System.out.println("Do you want to bag your gift?");
            System.out.println("a) Bag your gift");
            System.out.println("b) Don't bag your gift");
            
            responseFour = scan.next();
            
              // choices (A,B,B,A)
            if (responseFour.equals("a")) {
              System.out.println("\nYou leave the store and head to Boots' party.\nWhen you arrive, he greets you and you give him your gift!");
              System.out.println("He takes your gift and looks confused. He likes your gift, mainly because it's a watermelon in a bag. He says you can stay. :)");
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
            }
            
              // choices (A,B,B,B)
            else if (responseFour.equals("b")) {
              System.out.println("\nYou leave the store and head to Boots' party.\nWhen you arrive, he greets you and you give him your gift!");
              System.out.println("He thanks you, then punches a hole into the watermelon and puts his head into it. He is now Watermelon Boots. He says you can stay at the party. :)");
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
            }
            
              // Error input.
            else {
              System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
              System.out.println("a) Walmart");
              System.out.println("b) Payless");
            }
          }
          
            // Error input.
          else {
            System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
            System.out.println("a) Walmart");
            System.out.println("b) Payless");
          }
        }
          
          // Error input.
        else {
          System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
          System.out.println("a) Walmart");
          System.out.println("b) Payless");
        }
      }
      
        // choices (B)
      else if(responseOne.equals("b")) {
        
        System.out.println("You walk into Payless. What section do you want to go into?");
        System.out.println("a) Clearance section");
        System.out.println("b) Boots section");
        
        responseTwo = scan.next();
        
          // choices (B,A)
        if(responseTwo.equals("a")) {
          
          System.out.println("You're looking in the clearance section. What pair do you get him?");
          System.out.println("a) A red pair of shoes");
          System.out.println("b) Crocs");
          
          responseThree = scan.next();
          
            // choices (B,A,A)
          if(responseThree.equals("a")) {
            System.out.println("Do you want to bag your gift?");
            System.out.println("a) Bag your gift");
            System.out.println("b) Don't bag your gift");
            
            responseFour = scan.next();
            
              // choices (B,A,A,A)
            if (responseFour.equals("a")) {
              System.out.println("\nYou leave the store and head to Boots' party.\nWhen you arrive, he greets you and you give him your gift!");
              System.out.println("Boots loves your gift! He says you can stay as long as you want! :D");
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
            }
            
              // choices (B,A,A,B)
            else if (responseFour.equals("b")) {
              System.out.println("\nYou leave the store and head to Boots' party.\nWhen you arrive, he greets you and you give him your gift!");
              System.out.println("Boots like your gift, but feels weird that it's missing something, like a gift bag. He says you can stay. :)");
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
            } 
            
              // Error input.
            else {
              System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
              System.out.println("a) Walmart");
              System.out.println("b) Payless");
            }
          }
            
            // choices (B,A,B)
          else if(responseThree.equals("b")) {
            System.out.println("Do you want to bag your gift?");
            System.out.println("a) Bag your gift");
            System.out.println("b) Don't bag your gift");
            
            responseFour = scan.next();
            
              // choices (B,A,B,A)
            if (responseFour.equals("a")) {
              System.out.println("\nYou leave the store and head to Boots' party.\nWhen you arrive, he greets you and you give him your gift!");
              System.out.println("He likes your gift! He says crocs are hella comfy lowkey, you can stay as long as you want. :D");
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
            }
            
              // choices (B,A,B,B)
            else if (responseFour.equals("b")) {
              System.out.println("\nYou leave the store and head to Boots' party.\nWhen you arrive, he greets you and you give him your gift!");
              System.out.println("He likes your gift, but he feels weird because you gave him his gift outside of a gift bag. You can stay lol :)");
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
            }
            
              // Error input.
            else {
              System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
              System.out.println("a) Walmart");
              System.out.println("b) Payless");
            }
          }
          
            // Error input.
          else {
            System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
            System.out.println("a) Walmart");
            System.out.println("b) Payless");
          }
        }
        
          // choices (B,B)
        else if (responseTwo.equals("b")) {
          
          System.out.println("You're looking in the boots section. What pair do you get him?");
          System.out.println("a) A red pair of boots");
          System.out.println("b) A blue pair of boots");
          
          responseThree = scan.next();
          
            // choices (B,B,A)
          if(responseThree.equals("a")) {
            System.out.println("Do you want to bag your gift?");
            System.out.println("a) Bag your gift");
            System.out.println("b) Don't bag your gift");
            
            responseFour = scan.next();
            
              // choices (B,B,A,A)
            if (responseFour.equals("a")) {
              System.out.println("\nYou leave the store and head to Boots' party.\nWhen you arrive, he greets you and you give him your gift!");
              System.out.println("\nHe opens it and sees the red boots. Immediately, his cheerful face drops and he screams. \"NO, THERE CAN ONLY BE ONE PAIR OF RED BOOTS IN A UNIVERSE.\" \nThe boots on his feet and the boots inside the bag begin to levitate and collide with each other, which rip the fabric of reality and create a tear. \"-ªiÂƒÃCþÇÛïà4å/þk×êÜÜ[e^¬®xT#²`8#ómö¶©Ñóû‡'Ü¹ó€ÎÅ5wï?â‡ÿúŸ±Ô¨óê6‡Çg,oí fÄ¨DB5QÔÓ„èw:ô*5§´š–êæø²sÍ‡ÆÝû¹wï>2#ô‘$Eóø†,ó„y.¥Ó¡»ˆ€ŠÃDéö:œ==¦šû»[T*	Ÿ^ñïóàÎg»ž>ºÍééØÙYã`o“½Íî>‘õ2ŒŸy‚^¬®xT#²`8#ómö¶©Ñóû‡'Ü¹ó€ÎÅ5wï?â‡ÿúŸ±Ô¨óê6‡Çg,oí fÄ¨DB5QÔÓ„èw:ô*5§´š–êæø²sÍ‡ÆÝû¹wï>2#ô‘$Eóø†,ó„y.¥Ó¡»ˆ€ŠÃDéö:œ==¦šû»[T*	Ÿ^ñïóàÎg»ž>ºÍééØÙYã`o“½Íî>‘õ2ŒŸy‚sy‡§'Ü<?g%^âìâ’öÙ7¶øþ¿ÿ­jÄÝãKþáƒ¸ºìòèþ#$‰ø£ƒ[l­µøüÑ1ï}øëëküøÿœ,ÔùðÓÏùíñ	–ynÝº5ý~Ÿîõ5ø9Oä§Œf0�£|¯Óép~~ÎZ+áÆî:Ê“³.¿üÕ'X¦üøOþ˜W_Ùcgs[ûÛüü7¿æèði½K§I¯wÅ·¶ù/ÿéOYm¤|pç˜‡¸÷.‡¼ö½›üðÿ„ýÍv<Â9Ïîîúãïs~ÑæÎûÜ=|Ä»»T* Ï;fa¾	Ä^¬®xT#²`8#ómö¶©Ñóû‡'Ü¹ó€ÎÅ5wï?â‡ÿúŸ±Ô¨óê6‡Çg,oí fÄ¨DB5QÔÓ„èw:ô*5§´š–êæø²sÍ‡ÆÝû¹wï>2#ô‘$Eóø†,ó„y.¥Ó¡»ˆ€ŠÃDéö:œ==¦šû»[T*	^¬®xT#²`8#ómö¶©Ñóû‡'Ü¹ó€ÎÅ5wï?â‡ÿúŸ±Ô¨óê6‡Çg,oí fÄ¨DB5QÔÓ„èw:ô*5§´š–êæø²sÍ‡ÆÝû¹wï>2#ô‘$Eóø†,ó„y.¥Ó¡»ˆ€ŠÃDéö:œ==¦šû»[T*	Ÿ^ñïóàÎg»ž>ºÍééØÙYã`o“½Íî>‘õ2ŒŸy‚Ÿ^ñïóàÎg»ž>ºÍééØÙYã`o“½Íî>‘õ2ŒŸy‚^¬®xT#²`8#ómö¶©Ñóû‡'Ü¹ó€ÎÅ5wï?â‡ÿúŸ±Ô¨óê6‡Çg,oí fÄ¨DB5QÔÓ„èw:ô*5§´š–êæø²sÍ‡ÆÝû¹wï>2#ô‘$Eóø†,ó„y.¥Ó¡»ˆ€ŠÃDéö:œ==¦šû»[T*	Ÿ^ñïóàÎg»ž>ºÍééØÙYã`o“½Íî>‘õ2ŒŸy‚®»m†ýY–!â¨vºü¯¿ýoÿÍ»<»&N\" he says.\n\nYou leave the party and head back home, Boots looks like he needs some time alone.");
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
            }
            
              // choices (B,B,A,B)
            else if (responseFour.equals("b")) {
              System.out.println("\nYou leave the store and head to Boots' party.\nWhen you arrive, he greets you and you give him your gift!");
              System.out.println("He says \"mid gift\" and dismisses you. You leave the party, sad. :(");
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
            } 
            
              // Error input.
            else {
              System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
              System.out.println("a) Walmart");
              System.out.println("b) Payless");
            }
          }
            
            // choices (B,B,B)
          else if(responseThree.equals("b")) {
            System.out.println("Do you want to bag your gift?");
            System.out.println("a) Bag your gift");
            System.out.println("b) Don't bag your gift");
            
            responseFour = scan.next();
            
              // choices (B,B,B,A)
            if (responseFour.equals("a")) {
              System.out.println("\nYou leave the store and head to Boots' party.\nWhen you arrive, he greets you and you give him your gift!");
              System.out.println("He likes your gift! He'll finally have something different to wear for once. He says you can stay. :)");
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
            }
            
              // choices (B,B,B,B)
            else if (responseFour.equals("b")) {
              System.out.println("\nYou leave the store and head to Boots' party.\nWhen you arrive, he greets you and you give him your gift!");
              System.out.println("He appreciates your different gift! He says all his friends gave him red things, and he likes your blue thing! You can stay. :)");
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
            }
            
              // Error input.
            else {
              System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
              System.out.println("a) Walmart");
              System.out.println("b) Payless");
            }
          }
          
            // Error input.
          else {
            System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
            System.out.println("a) Walmart");
            System.out.println("b) Payless");
          }
        }
          
          // Error input.
        else {
          System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
          System.out.println("a) Walmart");
          System.out.println("b) Payless");
        }
      }
      
        // Error input.
      else {
        System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
        System.out.println("a) Walmart");
        System.out.println("b) Payless");
      }
      
    }
    while (!responseOne.equals("a") || !responseOne.equals("b") || !responseOne.equals("c"));
    
  }
  
}