import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.citi.function.model.Product;
import com.citi.function.model.ProductInfo;

public class FunctionWithConsumer {

	public static void main(String[] args) {
		
		// Consumer takes the input and does not return any value
		// Can be used in Saving data, or any operation where we don't need any return vlaue
		Consumer<List<Product>> consumer = (products) -> products.forEach(System.out::println);
		consumer.accept(ProductInfo.getProducts());
		
		
		
		
		//Bi Consumer can take in a hash map
		// Good for key pair values data types
		Map<Product, String> products = new HashMap<>();
		ProductInfo.getProducts().forEach(item -> {
			products.put(item, "Product Description");
		});
		
		BiConsumer<Product, String> productTraverse = (key, desc) -> {System.out.println(key + desc);};
	}
}
