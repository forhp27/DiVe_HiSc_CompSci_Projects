/*
 * Diego Velasco
 * Start Date (03/17/2023) - End Date (04/XX/2023)
 * Lemon.java - Walmart.zip
 */

import java.util.Scanner;

public class Lemon extends Produce {
  
  // Variables involved.
  Scanner scan = new Scanner(System.in);
  public double price = 0.5;
  public double candiedPrice = 1.5;
  public double tax = super.tax;
  public double sale = super.getSale();
  public int amount;
  public boolean candied; // yes or no.

  
  
  // Lemon Constructor.
  public Lemon() {
    System.out.println("How many lemons do you want?");
    amount = scan.nextInt();
    
    System.out.println("Do you want them candied in sugar? (true/false)");
    candied = scan.nextBoolean();
    
    if (Register.itemForSale() == 4) {
      System.out.println("\nThis item is on sale for " + (sale * 100) + "% off!");
    }
  }
  
  
  
  // Methods involved.
  
  // getPrice method.
  public double getPrice() {
    if (candied == true && Register.itemForSale() == 4) {
      double salePrice = price * sale;
      return ((salePrice * amount) * candiedPrice) + (salePrice * tax);
    }
    else if (!candied == true && Register.itemForSale() == 4) {
      double salePrice = price * sale;
      return (salePrice * amount) + (salePrice * tax);
    }
    else if (candied == true && Register.itemForSale() != 4) {
      return ((price * amount) * candiedPrice) + (price * tax);
    }
    else {
      return (price * amount) + (price * tax);
    }
  }
  
  // buyLemon method.
  public String buyLemon() {
    if (candied == true) {
      return "Do you want " + amount + " candied lemons?\nIt costs $" + getPrice() + " (y/n)";
    }
    else {
      return "Do you want " + amount + " lemons?\nIt costs $" + getPrice() + " (y/n)";
    }
  }
  
  // toString method.
  public String toString() {
    if (candied == true) {
      return amount + " candied lemons";
    }
    else {
      return amount + " lemons";
    }
  }
  
}