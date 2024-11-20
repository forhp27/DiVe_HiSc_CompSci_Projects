/*
 * Diego Velasco
 * Start Date (03/17/2023) - End Date (03/XX/2023)
 * Register.java - Walmart.zip
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Register {
  
  // Runner method.
  public static void main(String[] args) {
    
    // Used to style text with an underline. Used in step #4.
    final String BLACK_UNDERLINED = "\033[4;30m";
    // Used to style text with a bolding. Used in step #5.
    final String BLACK_BOLD = "\033[1;30m";
    // Text Reset, back to regular colors.
    final String RESET = "\033[0m";
    
    // Variables involved.
    Scanner scan = new Scanner(System.in);
    ArrayList <Merchandise> costumerCart = new ArrayList <Merchandise>();
    double customerTotal = 0;
    
    
    
    // Code sequence.
    System.out.println("Welcome to the " + BLACK_BOLD + "store!" + RESET);
    itemForSale();
    
    // add an item.
    do {
      System.out.println("What would you like to buy today?\n1) Clothes\n2) Produce\n3) Toys");
      String input = scan.nextLine();
      
      // Clothes Aisle.
      if (input.equals("1")) {
        System.out.println(BLACK_BOLD + "Welcome to the clothes aisle!" + RESET + "\nWhat would you like?\n1) Shirt\n2) Jeans");
        String input2 = scan.nextLine();
        
        // Shirt choice.
        if (input2.equals("1")) {
          Shirt myShirt = new Shirt();
          myShirt.checkSale();
          System.out.println(myShirt.buyShirt());
          
          String input3 = scan.nextLine();
          
          if (input3.equals("y")) {
            System.out.println("Adding item to the shopping list...\n");
            costumerCart.add(myShirt);
            customerTotal += myShirt.getPrice();
          }
          else {
            System.out.println("Removing item...\n");
          }
        }
        // Jeans choice.
        else if (input2.equals("2")) {
          Jeans myJeans = new Jeans();
          System.out.println(myJeans.buyJeans());
          String input3 = scan.nextLine();
          
          if (input3.equals("y")) {
            System.out.println("Adding item to the shopping list...\n");
            costumerCart.add(myJeans);
            customerTotal += myJeans.getPrice();
          }
          else {
            System.out.println("Removing item...\n");
          }
        }
        else {
          System.out.println("That's not a valid response!\n");
        }
      }
      
      // Produce Aisle.
      if (input.equals("2")) {
        System.out.println(BLACK_BOLD + "Welcome to the produce aisle!" + RESET + "\nWhat would you like?\n1) Strawberries\n2) Lemons");
        String input2 = scan.nextLine();
        
        // Strawberry choice.
        if (input2.equals("1")) {
          Strawberry myStrawberry = new Strawberry();
          System.out.println(myStrawberry.buyStrawberry());
          String input3 = scan.nextLine();
          
          if (input3.equals("y")) {
            System.out.println("Adding item to the shopping list...\n");
            costumerCart.add(myStrawberry);
            customerTotal += myStrawberry.getPrice();
          }
          else {
            System.out.println("Removing item...\n");
          }
        }
        // Lemon choice.
        else if (input2.equals("2")) {
          Lemon myLemon = new Lemon();
          System.out.println(myLemon.buyLemon());
          String input3 = scan.nextLine();
          
          if (input3.equals("y")) {
            System.out.println("Adding item to the shopping list...\n");
            costumerCart.add(myLemon);
            customerTotal += myLemon.getPrice();
          }
          else {
            System.out.println("Removing item...\n");
          }
        }
        else {
          System.out.println("That's not a valid response!\n");
        }
      }
      
      // Toys Aisle.
      if (input.equals("3")) {
        System.out.println(BLACK_BOLD + "Welcome to the toy aisle!" + RESET + "\nWhat would you like?\n1) Fidget toy\n2) Doll");
        String input2 = scan.nextLine();
        
        // Fidget choice.
        if (input2.equals("1")) {
          Fidget myFidget = new Fidget();
          System.out.println(myFidget.buyFidget());
          String input3 = scan.nextLine();
          
          if (input3.equals("y")) {
            System.out.println("Adding item to the shopping list...\n");
            costumerCart.add(myFidget);
            customerTotal += myFidget.getPrice();
          }
          else {
            System.out.println("Removing item...\n");
          }
        }
        // Doll choice.
        else if (input2.equals("2")) {
          Doll myDoll = new Doll();
          System.out.println(myDoll.buyDoll());
          String input3 = scan.nextLine();
          
          if (input3.equals("y")) {
            System.out.println("Adding item to the shopping list...\n");
            costumerCart.add(myDoll);
            customerTotal += myDoll.getPrice();
          }
          else {
            System.out.println("Removing item...\n");
          }
        }
        else {
          System.out.println("That's not a valid response!\n");
        }
      }
      
    } while (doneShopping() == true);
    
    // The register, which displays everything in your cart and the total cost of everything.
    System.out.println("Welcome to the " + BLACK_BOLD + "register!\n\nYour cart:\n" + costumerCart + "\nYour total: $" + customerTotal);
  }
  
  
  
  // Methods involved.
    
  // doneShopping method. Asks if the comstumer is done shopping or not.
  public static boolean doneShopping() {
    System.out.println("Want to get another item? (y/n)");
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    
    if (input.equals("y")) {
      System.out.println("Alright! Let's go back to the aisles.");
      return true;
    }
    else if (input.equals("n")) {
      System.out.println("Okay! Let's go to the register!");
      return false;
    }
    else {
      System.out.println("Bruh you didn't give an option... Let's go back to the aisles.");
      return true;
    }
  }
  
  
  // itemForSale method. Picks a random item to put it on sale.
  public static int itemForSale() {
    int chance = (int) ((Math.random() * 6) + 1);
    
    switch (chance) {
      case 1:
        Shirt.setSale();
        return 1;
      case 2:
        Jeans.setSale();
        return 2;
      case 3:
        Strawberry.setSale();
        return 3;
      case 4:
        Lemon.setSale();
        return 4;
      case 5:
        Fidget.setSale();
        return 5;
      case 6:
        Doll.setSale();
        return 6;
    }
    return chance;
  }
  
  
}