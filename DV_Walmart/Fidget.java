/*
 * Diego Velasco
 * Start Date (03/17/2023) - End Date (04/XX/2023)
 * Fidget.java - Walmart.zip
 */

import java.util.Scanner;

public class Fidget extends Toys {
  
  // Variables involved.
  Scanner scan = new Scanner(System.in);
  public double price = 4;
  public double tax = super.tax;
  public double sale = super.getSale();
  public String color;
  public String texture; // 1 - Slippery, 2 - Solid
  

  
  
  // Fidget Constructor.
  public Fidget() {
    System.out.println("What color is the fidget toy?");
    color = scan.next();
    
    System.out.println("What is the texture of the fidget toy?\nA) Slippery\nB) Solid");
    texture = scan.next();
    
    if (Register.itemForSale() == 5) {
      System.out.println("\nThis item is on sale for " + (sale * 100) + "% off!");
    }
  }
  
  
  
  // Methods involved.
  
  // getPrice method.
  public double getPrice() {
    if (Register.itemForSale() == 5) {
      double salePrice = price * sale;
      return salePrice + (salePrice * tax);
    }
    else {
      return price + (price * tax);
    }
  }
  
  // buyFidget method.
  public String buyFidget() {
    if (texture.equals("a")) {
      return "Do you want a " + color + " slippery fidget toy?\nIt costs $" + getPrice() + " (y/n)";
    }
    else {
      return "Do you want " + color + " solid fidget toy?\nIt costs $" + getPrice() + " (y/n)";
    }
  }
  
  // toString method.
  public String toString() {
    if (texture.equals("a")) {
      return color + " slippery fidget toy";
    }
    else {
      return color + " solid fidget toy";
    }
  }
}