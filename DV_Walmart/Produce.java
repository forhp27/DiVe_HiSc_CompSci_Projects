/*
 * Diego Velasco
 * Start Date (03/17/2023) - End Date (04/XX/2023)
 * Produce.java - Walmart.zip
 */
 
public class Produce extends Merchandise {
  
  // Variables involved.
  public double price;
  public double tax = 0.01;
  public double sale = super.getSale();
  
  
  // Produce Constructor.
  public Produce() {
    
  }
  
  
  
  // Methods involved.
  
  // getPrice method.
  public double getPrice() {
    return price;
  }
  
}