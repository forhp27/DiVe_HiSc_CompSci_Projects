/*
 * Diego Velasco
 * Start Date (03/17/2023) - End Date (04/XX/2023)
 * Shirt.java - Walmart.zip
 */

import java.util.Scanner;

public class Shirt extends Clothes {
  
  // Variables involved.
  Scanner scan = new Scanner(System.in);
  public double price = 8;
  public double tax = super.tax;
  public double sale = super.getSale();
  public String color;
  public boolean dressShirt; // yes or no.
  public boolean sleeveLength; // long sleeve or short sleeve.
  
  
  
  // Shirt Constructor.
  public Shirt() {
    System.out.println("What color is the shirt?");
    color = scan.next();
    
    System.out.println("Is is a dress shirt? (true/false)");
    dressShirt = scan.nextBoolean();
    
    System.out.println("Do you want a long sleeve? (true/false)");
    sleeveLength = scan.nextBoolean();
    
    if (Register.itemForSale() == 1) {
      System.out.println("\nThis item is on sale for " + (sale * 100) + "% off!");
    }
  }
  
  
  
  // Methods involved.
  
  // getPrice method.
  public double getPrice() {
    if (Register.itemForSale() == 1) {
      double salePrice = price * sale;
      return salePrice + (salePrice * tax);
    }
    else {
      return price + (price * tax);
    }
  }
  
  // checkSale method.
  public String checkSale() {
    if (Register.itemForSale() == 1) {
      return "\nThis item is on sale for " + (sale * 100) + "% off!";
    }
    else {
      return "This item is not for sale.";
    }
  }
  
  // buyShirt method.
  public String buyShirt() {
    if (dressShirt == true && sleeveLength == true) {
      return "Do you want a " + color + ", long sleeve, dress shirt?\nIt costs $" + getPrice() + " (y/n)";
    }
    else if (!dressShirt == true && sleeveLength == true) {
      return "Do you want a " + color + ", long sleeve shirt?\nIt costs $" + getPrice() + " (y/n)";
    }
    else if (dressShirt == true && !sleeveLength == true) {
      return "Do you want a " + color + ", short sleeve, dress shirt?\nIt costs $" + getPrice() + " (y/n)";
    }
    else {
      return "Do you want a " + color + ", short sleeve shirt?\nIt costs $" + getPrice() + " (y/n)";
    }
  }
  
  // toString method.
  public String toString() {
    if (dressShirt == true && sleeveLength == true) {
      return color + " long sleeve dress shirt";
    }
    else if (!dressShirt == true && sleeveLength == true) {
      return color + " long sleeve shirt";
    }
    else if (dressShirt == true && !sleeveLength == true) {
      return color + " short sleeve dress shirt,";
    }
    else {
      return color + " short sleeve shirt";
    }
  }
  
}