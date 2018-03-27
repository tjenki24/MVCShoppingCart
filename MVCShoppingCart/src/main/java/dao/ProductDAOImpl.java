package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.uncc.MVCShoppingCart.config.Product;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class ProductDAOImpl implements ProductDAO {
	private JdbcTemplate jdbcTemplate;
	
	public ProductDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void saveOrUpdate(Product product) {
		//update
		if (product.getId() > 0) {
			String sql = "UPDATE product SET name=?, price=?, description=?, image=? WHERE product_id=?";
			jdbcTemplate.update(sql, product.getName(), product.getPrice(), product.getDescription(), product.getId());
		}
		else {
			//insert
			String sql = "INSERT INTO product (name, price, description, image) VALUES (?, ?, ?, ?)";
			jdbcTemplate.update(sql, product.getName(), product.getPrice(), product.getDescription(), product.getImage());
		}
		
	}
	
	public void delete(int productId) {
		String sql = "DELETE FROM product WHERE product_id = ?";
		jdbcTemplate.update(sql, productId);
	}
	
	public Product get(int productId) {
		String sql = "SELECT * FROM product WHERE product_id =" + productId;
		return jdbcTemplate.query(sql, new ResultSetExtractor<Product>() {
			//@Override
			public Product extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					Product product = new Product();
					product.setId(rs.getInt("contact_id"));
					product.setName(rs.getString("name"));
					product.setDescription(rs.getString("description"));
					product.setPrice(rs.getString("price"));
					product.setImage(rs.getString("image"));
					return product;
				}
			return null;
			}
		});
	}
	
	public List<Product> list() {
		String sql = "SELECT * FROM product";
		List<Product> listProduct = jdbcTemplate.query(sql, new RowMapper<Product>() {
			
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product aProduct = new Product();
				
				aProduct.setId(rs.getInt("contact_id"));
				aProduct.setName(rs.getString("name"));
				aProduct.setPrice(rs.getString("price"));
				aProduct.setDescription(rs.getString("description"));
				aProduct.setImage(rs.getString("image"));
				return aProduct;
			}
		});
		
		return listProduct;
	}
}
