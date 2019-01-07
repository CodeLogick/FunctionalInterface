import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ProductInfo {
	
	private static List<Product> productList = new ArrayList<>();
	
	public static List<Product> getProducts()
	{
		productList.add(new Product(100, "Lux", 40, new Date()));
		productList.add(new Product(101, "Rexona", 20, new Date()));
		productList.add(new Product(102, "Humam", 30, new Date()));
		productList.add(new Product(103, "Lifeboy", 15, new Date()));
		productList.add(new Product(104, "Pears", 80, new Date()));
		productList.add(new Product(105, "Dettol", 90, new Date()));
		
		return productList;
	}
	

}
