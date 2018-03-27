package dao;

import java.util.List;

import org.uncc.MVCShoppingCart.config.Product;

public interface ProductDAO {
	public void saveOrUpdate(Product product);
	public void delete(int productId);
	public Product get(int productId);
	public List<Product> list();
}
