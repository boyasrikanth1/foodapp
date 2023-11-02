package home_shoping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class products_dto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int productId;
private String productName;
private double productPrice;
private String productRating;
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getProductPrice() {
	return productPrice;
}
public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
}
public String getProductRating() {
	return productRating;
}
public void setProductRating(String productRating) {
	this.productRating = productRating;
}


}
