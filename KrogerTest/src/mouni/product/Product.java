package mouni.product;

import java.util.Date;

public class Product {

	private String productNumber;
	private String productName;
	private String category;
	private Date expirationDate;

	public Product(String productNumber, String productName, String category, Date expirationCategory) {
		super();
		this.productNumber = productNumber;
		this.productName = productName;
		this.category = category;
		this.expirationDate = expirationCategory;
	}

	public String getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

}
