/*
 *Afnan Mir
 *Mr. Yee
 *4th Period
 */
 
 /**
 * Represents a linked list of ProductNodes
 */
public class ProductList 
{
	private ProductNode front;
	
	/**
	 * Constructs a ProductList with no elements
	 */
	 public ProductList(){
	 	front = null;
	 }

	
	/**
	 * addFirst adds a specified product to the front of the list
	 * @param p the new product to add
	 */
	 public void addFirst(Product p){
	 	front = new ProductNode(p, front);
	 }
	
	
	/**
	 * toString returns a string version of the list with each product on its own line
	 * @return the string version of the list
	 */
	public String toString(){
		String ret = "";
		ProductNode current = front;
		while(current != null){
			ret+= current.getData()+ "\n";
			current = current.getNext();
		}
		return ret;
	}
	
	
	/**
	 * size returns the number of ProductNodes in the list
	 * @return the number of ProductNodes in the list
	 */
	 public int size(){
	 	int count=0;
	 	ProductNode current = front;
	 	while(current != null){
	 		count++;
	 		current = current.getNext();
	 	}
	 	return count;
	 }
	
	
	/**
	 * addLast adds a product to the end of the list
	 * @param p the product to add
	 */
	 public void addLast(Product p){
	 	ProductNode current = front;
	 	if(current == null){
	 		front = new ProductNode(p,null);
	 	} else{
	 	while(current.getNext()!= null){
	 		current = current.getNext();
	 		}
	 		current.setNext(new ProductNode(p,null));
	 	}
	 }
	
	
	/**
	 * find finds and returns a product with a specified name  
	 * Returns null if the product is not in the list
	 * @param name the name of the product to find
	 * @return the located product or null if not located
	 */
	 public Product find(String s){
	 	ProductNode current = front;
	 	while(current!=null){
	 		Product test = current.getData();
	 		if(test.getName().equals(s)){
	 			return test;
	 		}
	 		current= current.getNext();
	 	}
	 	return null;
	 }
	
	/**
	 * clear clears the list of all ProductNodes
	 */
	 public void clear(){
	 	front = null;
	 }
	
	
	/**
	 * add adds a specified product to the list in order based on compareTo
	 * @param p the product to add
	 */
	 public void add(Product p){
		 ProductNode current = front;
		 ProductNode previous = front;
		 if(current == null){
			 front = new ProductNode(p, null);
		 } else{
			if(current.getData().compareTo(p)>0){
				front = new ProductNode(p,front);
			} else {
				current = current.getNext();
				while(current != null){
					if(current.getData().compareTo(p)<0){
						current = current.getNext();
						previous = previous.getNext();
					} else{
						previous.setNext(new ProductNode(p,current));
					}
				}
				if(current == null){
					previous.setNext(new ProductNode(p,null));
				}
			}
		 }
	 }
	 
	 
	/**
	 * getFirst returns the first product in the list  
	 * Throws an IndexOutOfBoundsException if the list is empty.
	 * @return the first product
	 */
	

	/**
	 * getLast returns the last product in the list  
	 * Throws an IndexOutOfBoundsException if the list is empty.
	 * @return the last product
	 */
	 
	 
	/**
	 * add adds (inserts) a specified product at a specified index  
	 * Throws an exception if the index is not valid.
	 * @param index the index at which to insert
	 * @param p the product to add
	 */
	
	
	/**
	 * indexOf returns the index of a product with a specified name  
	 * Returns -1 if that product is not in the list
	 * @param name the name of the product to find
	 * @return the index of the product, or -1 if it is not in the list
	 */
	
	
	
	/**
	 * remove removes and returns the product at the specified index
	 * Throws an exception if the index is invalid
	 * @param index the index to remove
	 * @return the removed product
	 */
	
	
	
	/**
	 * set sets (replaces) the product at a specified index with the specified product  
	 * Throws an exception if the index is not valid.
	 * @param index the index at which to set
	 * @param p the product to set
	 */
	
		
	
	/**
	 * remove removes and returns a product with a specified name 
	 * Returns null if the product with that name is not in the list
	 * @param name the name of the product to remove
	 * @return the product that was removed, or null
	 */
	
	
	
}
