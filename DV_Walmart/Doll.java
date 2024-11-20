/*
 * Diego Velasco
 * Start Date (03/17/2023) - End Date (04/XX/2023)
 * Doll.java - Walmart.zip
 */

import java.util.Scanner;

public class Doll extends Toys {
  
  // Variables involved.
  Scanner scan = new Scanner(System.in);
  public double price = 4;
  public double tax = super.tax;
  public double sale = super.getSale();
  public String hairColor; // 1 - black, 2 - brown, 3 - blond, 4 - grey
  public String eyeColor; // 1 - brown, 2 - blue, 3 - green
  

  
  
  // Doll Constructor.
  public Doll() {
    System.out.println("What color is the doll's hair?\nA) Black\nB) Brown\nC) Blond\nD) Grey");
    hairColor = scan.nextLine();
    
    System.out.println("What color are the doll's eyes?\nA) Brown\nB) Blue\nC) Green");
    eyeColor = scan.nextLine();
    
    if (Register.itemForSale() == 6) {
      System.out.println("\nThis item is on sale for " + (sale * 100) + "% off!");
    }
  }
  
  
  
  // Methods involved.
  
  // getPrice method.
  public double getPrice() {
    if (Register.itemForSale() == 6) {
      double salePrice = price * sale;
      return salePrice + (salePrice * tax);
    }
    else {
      return price + (price * tax);
    }
  }
  
  // buyDoll method.
  public String buyDoll() {
    if (hairColor.equals("a") && eyeColor.equals("a")) {
      return "Do you want a black hair, brown eyed doll?\nIt costs $" + getPrice() + " (y/n)";
    }
    else if (hairColor.equals("b") && eyeColor.equals("a")) {
      return "Do you want a brown hair, brown eyed doll?\nIt costs $" + getPrice() + " (y/n)";
    }
    else if (hairColor.equals("c") && eyeColor.equals("a")) {
      return "Do you want a blond hair, brown eyed doll?\nIt costs $" + getPrice() + " (y/n)";
    }
    else if (hairColor.equals("d") && eyeColor.equals("a")) {
      return "Do you want a grey hair, brown eyed doll?\nIt costs $" + getPrice() + " (y/n)";
    }
    else if (hairColor.equals("a") && eyeColor.equals("b")) {
      return "Do you want a black hair, blue eyed doll?\nIt costs $" + getPrice() + " (y/n)";
    }
    else if (hairColor.equals("b") && eyeColor.equals("b")) {
      return "Do you want a brown hair, blue eyed doll?\nIt costs $" + getPrice() + " (y/n)";
    }
    else if (hairColor.equals("c") && eyeColor.equals("b")) {
      return "Do you want a blond hair, blue eyed doll?\nIt costs $" + getPrice() + " (y/n)";
    }
    else if (hairColor.equals("d") && eyeColor.equals("b")) {
      return "Do you want a grey hair, blue eyed doll?\nIt costs $" + getPrice() + " (y/n)";
    }
    else if (hairColor.equals("a") && eyeColor.equals("c")) {
      return "Do you want a black hair, green eyed doll?\nIt costs $" + getPrice() + " (y/n)";
    }
    else if (hairColor.equals("b") && eyeColor.equals("c")) {
      return "Do you want a brown hair, green eyed doll?\nIt costs $" + getPrice() + " (y/n)";
    }
    else if (hairColor.equals("c") && eyeColor.equals("c")) {
      return "Do you want a blond hair, green eyed doll?\nIt costs $" + getPrice() + " (y/n)";
    }
    else {
      return "Do you want a grey hair, green eyed doll?\nIt costs $" + getPrice() + " (y/n)";
    }
  }
  
  // toString method.
  public String toString() {
    if (hairColor.equals("a") && eyeColor.equals("a")) {
      return "black hair, brown eyed doll";
    }
    else if (hairColor.equals("b") && eyeColor.equals("a")) {
      return "brown hair, brown eyed doll";
    }
    else if (hairColor.equals("c") && eyeColor.equals("a")) {
      return "blond hair, brown eyed doll";
    }
    else if (hairColor.equals("d") && eyeColor.equals("a")) {
      return "grey hair, brown eyed doll";
    }
    else if (hairColor.equals("a") && eyeColor.equals("b")) {
      return "black hair, blue eyed doll";
    }
    else if (hairColor.equals("b") && eyeColor.equals("b")) {
      return "brown hair, blue eyed doll";
    }
    else if (hairColor.equals("c") && eyeColor.equals("b")) {
      return "blond hair, blue eyed doll";
    }
    else if (hairColor.equals("d") && eyeColor.equals("b")) {
      return "grey hair, blue eyed doll";
    }
    else if (hairColor.equals("a") && eyeColor.equals("c")) {
      return "lack hair, green eyed doll";
    }
    else if (hairColor.equals("b") && eyeColor.equals("c")) {
      return "brown hair, green eyed doll";
    }
    else if (hairColor.equals("c") && eyeColor.equals("c")) {
      return "blond hair, green eyed doll";
    }
    else {
      return "grey hair, green eyed doll";
    }
  }
  
}