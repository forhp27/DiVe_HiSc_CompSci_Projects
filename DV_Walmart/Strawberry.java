/*
 * Diego Velasco
 * Start Date (03/17/2023) - End Date (04/XX/2023)
 * Strawberry.java - Walmart.zip
 */

import java.util.Scanner;

public class Strawberry extends Produce {
  
  // Variables involved.
  Scanner scan = new Scanner(System.in);
  public double price = 0.25;
  public double candiedPrice = 1.5;
  public double tax = super.tax;
  public double sale = super.getSale();
  public int amount;
  public boolean candied; // yes or no.

  
  
  // Strawberry Constructor.
  public Strawberry() {
    System.out.println("How many strawberries do you want?");
    amount = scan.nextInt();
    
    System.out.println("Do you want them covered in chocolate and candy? (true/false)");
    candied = scan.nextBoolean();
    
    if (Register.itemForSale() == 3) {
      System.out.println("\nThis item is on sale for " + (sale * 100) + "% off!");
    }
  }
  
  
  
  // Methods involved.
  
  // getPrice method.
  public double getPrice() {
    if (candied == true && Register.itemForSale() == 3) {
      double salePrice = price * sale;
      return ((salePrice * amount) * candiedPrice) + (salePrice * tax);
    }
    else if (!candied == true && Register.itemForSale() == 3) {
      double salePrice = price * sale;
      return (salePrice * amount) + (salePrice * tax);
    }
    else if (candied == true && Register.itemForSale() != 3) {
      return ((price * amount) * candiedPrice) + (price * tax);
    }
    else {
      return (price * amount) + (price * tax);
    }
  }
  
  // buyStrawberry method.
  public String buyStrawberry() {
    if (candied == true) {
      return "Do you want " + amount + " chocolate-covered strawberries?\nIt costs $" + getPrice() + " (y/n)";
    }
    else {
      return "Do you want " + amount + " strawberries?\nIt costs $" + getPrice() + " (y/n)";
    }
  }
  
  // toString method.
  public String toString() {
    if (candied == true) {
      return amount + " chocolate-covered strawberries";
    }
    else {
      return amount + " strawberries";
    }
  }
  
}