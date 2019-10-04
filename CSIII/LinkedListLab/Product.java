//*** Heading

public class Product implements Comparable
{  
   private String name;
   private double price;
   private int quantity;
   /**
      Constructs a product with empty name and 0 price and
      quantity.
   */
   public Product()
   {  
      name = "";
      price = 0;
      quantity = 0; 
     
   }
   
   /**
      Constructs a product with the given name, price and 
      quantity.
      @param aName product name
      @param aPrice product price
      @param aQuantity product quantity
   */
   public Product(String aName, double aPrice, int aQuantity)
   {  
      name = aName;
      price = aPrice;
      quantity = aQuantity;
   }

   /**
      Returns the product name.
      @return the product name
   */
   public String getName()
   {  
      return name;
   }
   
   /**
      Returns the product price.
      @return the product price
   */
   public double getPrice()
   {  
      return price;
   }
   
   /**
      Returns the product quantity.
      @return the product quantity
   */
   public int getQuantity()
   {  
      return quantity;
   }
   
   /**
      Sets the product price.
      @param newPrice the new product price
   */
   public void setPrice(double newPrice)
   {  
      price = newPrice;
   }

   /**
      Sets the product quantity.
      @param newQuantity the new product quantity
   */
   public void setQuantity(int newQuantity)
   {  
      quantity = newQuantity;
   }
   
 	// add toString, equals and compareTo
 	
 	/**
    * returns a String version of the Product
    * @return a String version of the Product
    */
	public String toString(){
		String ret = "";
		ret+= name+" " + price + " " + quantity;
		return ret;
	}
   
   /**
    * compares two Products and returns true if they have the same name
    * and false if they do not.
    * @param o the Product to compare
    * @return whether the two products have the same name
    */
   	public boolean equals(Object o){
   		Product test = (Product)o;
   		return name.equals(test.name);
   	}
	
	/**
	 * Compares the names of two products and returns the difference
	 * @param p the Product to compare
	 * @return the difference between the two products' names
	 */
	 public int compareTo(Object o){
	 	Product test = (Product)o;
	 	return name.compareTo(test.name);
	 }
	
}
