/*
 * Diego Velasco
 * Start Date (03/17/2023) - End Date (04/XX/2023)
 * Jeans.java - Walmart.zip
 */

import java.util.Scanner;

public class Jeans extends Clothes {
  
  // Variables involved.
  Scanner scan = new Scanner(System.in);
  public double price = 12;
  public double tax = super.tax;
  public double sale = super.getSale();
  public String color;
  public boolean rippedJeans; // yes or no.
  
  
  
  // Jeans Constructor.
  public Jeans() {
    System.out.println("What color are the jeans?");
    color = scan.next();
    
    System.out.println("Are they ripped jeans? (true/false)");
    rippedJeans = scan.nextBoolean();
    
    if (Register.itemForSale() == 2) {
      System.out.println("\nThis item is on sale for " + (sale * 100) + "% off!");
    }
  }
  
  
  
  // Methods involved.
  
  // getPrice method.
  public double getPrice() {
    if (Register.itemForSale() == 2) {
      double salePrice = price * sale;
      return salePrice + (salePrice * tax);
    }
    else {
      return price + (price * tax);
    }
  }
  
  // buyJeans method.
  public String buyJeans() {
    if (rippedJeans == true) {
      return "Do you want " + color + " ripped jeans?\nIt costs $" + getPrice() + " (y/n)";
    }
    else {
      return "Do you want " + color + " jeans?\nIt costs $" + getPrice() + " (y/n)";
    }
  }
  
  // toString method.
  public String toString() {
    if (rippedJeans == true) {
      return color + " ripped jeans";
    }
    else {
      return color + " jeans";
    }
  }
  
  
  
  
  
  
  
}