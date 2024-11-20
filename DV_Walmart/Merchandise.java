/*
 * Diego Velasco
 * Start Date (03/17/2023) - End Date (04/XX/2023)
 * Merchandise.java - Walmart.zip
 */

public class Merchandise {
  
  // Variables involved.
  public double price;
  public double tax;
  public static double sale = 1;
  
  
  // Merchandise Constructor.
  public Merchandise() {
    
  }
  
  
  
  // Methods involved.
  
  // getPrice method.
  public double getPrice() {
    return price;
  }
  
  // getSale method.
  public double getSale() {
    return sale;
  }
  
  // setSale method.
  public static void setSale() {
    sale = Math.random();
  }
  
}