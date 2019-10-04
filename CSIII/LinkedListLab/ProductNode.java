//*** Heading

public class ProductNode
{
	private Product data;
	private ProductNode next;
	public ProductNode(){
		data = null;
		next = null;
	}
	public ProductNode(Product prod, ProductNode pn){
		data = prod;
		next = pn;
	}
	public Product getData(){
		return data;
	}
	public ProductNode getNext(){
		return next;
	}
	public void setData(Product p){
		data = p;
	}
	public void setNext(ProductNode node){
		next = node;
	}
}
