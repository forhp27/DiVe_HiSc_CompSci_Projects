/*
 * Diego Velasco
 * Start Date (03/17/2023) - End Date (04/XX/2023)
 * Clothes.java - Walmart.zip
 */
 
public class Clothes extends Merchandise {
  
  // Variables involved.
  public double price;
  public double tax = 0.0625;
  public double sale = super.getSale();
  
  
  // Clothes Constructor.
  public Clothes() {
    
  }
  
  
  
  // Methods involved.
  
  // getPrice method.
  public double getPrice() {
    return price;
  }
  
}