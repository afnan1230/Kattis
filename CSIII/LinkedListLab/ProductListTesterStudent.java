//*** Temporary tester. Heading not necessary

/**
 *A class to test the methods of the ProductList class
 */
public class ProductListTesterStudent
{
	public static void main(String[] args)
	{
		ProductList list = new ProductList();
		System.out.println("\n\nSECTION 2:");
		System.out.println("Testing add, getFirst and getLast");
		list.add(new Product("spaghetti",1.95,2));
		list.add(new Product("apples",.65,5));
		list.add(new Product("tomato sauce",3.71,2));
		list.add(new Product("bananas",1.23,3));
		System.out.println("List contains " + list.size() + " elements");
		System.out.println(list);
		System.out.println("First product: " + list.getFirst());
		System.out.println("Last product: " + list.getLast());
		System.out.println(list);
	}
}
