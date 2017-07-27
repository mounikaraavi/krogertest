package mouni.productImplementation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import mouni.product.*;

public class ProductImplementationTest {

	public static void main(String[] args) {
		ProductImplementationTest test = new ProductImplementationTest();
		ProductImplementation impl = new ProductImplementation();

		List<Product> products = test.firstBatchData();
		List<Product> productByName = impl.sortByName(products);
		for (Product product : productByName) {
			System.out.println(product.getProductName());
		}
		productByName.addAll(test.secondBatchData());
		List<Product> productsByCategory = impl.sortByCategory(products);
		for (Product product : productsByCategory) {
			System.out.println(product.getCategory());
		}
		productsByCategory.addAll(test.thirdBatchData());
		List<Product> productsByDate = impl.sortByDate(products);
		for (Product product : productsByDate) {
			System.out.println(product.getExpirationDate());
		}

		List<Product> productsDelete = impl.deleteCategory(products, "Mens Clothing");
		for (Product product : productsDelete) {
			System.out.println(product);
		}
		List<Product> productsByNumber = impl.sortByNumber(products);
		for (Product product : productsByNumber) {
			System.out.println(product.getProductNumber());
		}
	}

	@SuppressWarnings("deprecation")
	public List<Product> firstBatchData() {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("1", "Activewear", "Women Clothing", new Date("01/12/2019")));
		products.add(new Product("2", "Dresses", "Women Clothing", new Date("02/12/2019")));
		products.add(new Product("3", "Pants", "Women Clothing", new Date("03/12/2019")));
		products.add(new Product("4", "Capris", "Women Clothing", new Date("04/12/2019")));
		products.add(new Product("5", "Swimwear", "Women Clothing", new Date("05/12/2019")));
		products.add(new Product("6", "Contemporary Clothing", "Women Clothing", new Date("06/12/2019")));
		products.add(new Product("7", "Blazers", "Women Clothing", new Date("07/12/2019")));
		products.add(new Product("8", "sleepwear", "Women Clothing", new Date("08/12/2019")));
		products.add(new Product("9", "Printed tops", "Women Clothing", new Date("09/12/2019")));
		products.add(new Product("10", "Jackets", "Women Clothing", new Date("10/12/2019")));
		products.add(new Product("11", "Jeans", "Women Clothing", new Date("11/12/2019")));
		products.add(new Product("12", "Leggings", "Women Clothing", new Date("12/12/2019")));
		products.add(new Product("13", "Pajamas", "Women Clothing", new Date("13/12/2019")));
		products.add(new Product("14", "Shorts", "Women Clothing", new Date("14/12/2019")));
		products.add(new Product("15", "Skirts", "Women Clothing", new Date("15/12/2019")));
		products.add(new Product("16", "Suits", "Women Clothing", new Date("16/12/2019")));
		products.add(new Product("17", "Work Wear", "Women Clothing", new Date("17/12/2019")));
		products.add(new Product("18", "Traditional", "Women Clothing", new Date("18/12/2019")));
		products.add(new Product("19", "Jumpsuits", "Women Clothing", new Date("19/12/2019")));
		products.add(new Product("20", "Rompers", "Women Clothing", new Date("20/12/2019")));
		products.add(new Product("21", "Cardigans", "Women Clothing", new Date("21/12/2019")));
		products.add(new Product("22", "Petites", "Women Clothing", new Date("22/12/2019")));
		products.add(new Product("23", "Sweaters", "Women Clothing", new Date("23/12/2019")));
		products.add(new Product("24", "Jeggings", "Women Clothing", new Date("24/12/2019")));
		products.add(new Product("25", "Sweatshirts", "Women Clothing", new Date("25/12/2019")));     
		return products;
	}

	@SuppressWarnings("deprecation")
	public List<Product> secondBatchData() {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("1", "Activewear", "Mens Clothing", new Date("01/11/2019")));
		products.add(new Product("2", "Basic Clothing", "Mens Clothing", new Date("02/11/2019")));
		products.add(new Product("3", "Blazers", "Mens Clothing", new Date("03/11/2019")));
		products.add(new Product("4", "Sport Coats", "Mens Clothing", new Date("04/11/2019")));
		products.add(new Product("5", "Casual Button-Down Shirts", "Mens Clothing", new Date("05/11/2019")));
		products.add(new Product("6", "Coats", "Mens Clothing", new Date("06/11/2019")));
		products.add(new Product("7", "Jackets", "Mens Clothing", new Date("07/11/2019")));
		products.add(new Product("8", "Dress Shirts", "Mens Clothing", new Date("08/11/2019")));
		products.add(new Product("9", "Hoodies", "Mens Clothing", new Date("09/11/2019")));
		products.add(new Product("10", "Sweatshirts", "Mens Clothing", new Date("10/11/2019")));
		products.add(new Product("11", "Jeans", "Mens Clothing", new Date("11/11/2019")));
		products.add(new Product("12", "Pajamas", "Mens Clothing", new Date("12/11/2019")));
		products.add(new Product("13", "Sleepwear", "Mens Clothing", new Date("13/11/2019")));
		products.add(new Product("14", "Pants", "Mens Clothing", new Date("14/11/2019")));
		products.add(new Product("15", "Polos", "Mens Clothing", new Date("15/11/2019")));
		products.add(new Product("16", "Swimwear", "Mens Clothing", new Date("16/11/2019")));
		products.add(new Product("17", "T-Shirts", "Mens Clothing", new Date("17/11/2019")));
		products.add(new Product("18", "Socks", "Mens Clothing", new Date("18/11/2019")));
		products.add(new Product("19", "Shorts", "Mens Clothing", new Date("19/11/2019")));
		products.add(new Product("20", "Sweaters", "Mens Clothing", new Date("20/11/2019")));
		products.add(new Product("21", "Suits", "Mens Clothing", new Date("21/11/2019")));
		products.add(new Product("22", "Suit Separates", "Mens Clothing", new Date("22/11/2019")));
		products.add(new Product("23", "Tie", "Mens Clothing", new Date("23/11/2019")));
		products.add(new Product("24", "Tuxedos", "Mens Clothing", new Date("24/11/2019")));
		products.add(new Product("25", "Formalwear", "Mens Clothing", new Date("25/11/2019")));
		return products;
	}

	@SuppressWarnings("deprecation")
	public List<Product> thirdBatchData() {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("1", "Accessories", "Kids Clothing", new Date("01/10/2019")));
		products.add(new Product("2", "Activewear", "Kids Clothing", new Date("02/10/2019")));
		products.add(new Product("3", "Basic Clothing", "Kids Clothing", new Date("03/10/2019")));
		products.add(new Product("4", "Coats", "Kids Clothing", new Date("04/10/2019")));
		products.add(new Product("5", "Jackets", "Kids Clothing", new Date("05/10/2019")));
		products.add(new Product("6", "Dresses", "Kids Clothing", new Date("06/10/2019")));
		products.add(new Product("7", "Jeans", "Kids Clothing", new Date("07/10/2019")));
		products.add(new Product("8", "Shoes", "Kids Clothing", new Date("08/10/2019")));
		products.add(new Product("9", "Shorts", "Kids Clothing", new Date("09/10/2019")));
		products.add(new Product("10", "Skirts", "Kids Clothing", new Date("10/10/2019")));
		products.add(new Product("11", "Suits", "Kids Clothing", new Date("11/10/2019")));
		products.add(new Product("12", "Sweaters", "Kids Clothing", new Date("12/10/2019")));
		products.add(new Product("13", "Swimwear", "Kids Clothing", new Date("13/10/2019")));
		products.add(new Product("14", "Dress Shirts", "Kids Clothing", new Date("14/10/2019")));
		products.add(new Product("15", "Sweatshirts", "Kids Clothing", new Date("15/10/2019")));
		products.add(new Product("16", "Hoodies", "Kids Clothing", new Date("16/10/2019")));
		products.add(new Product("17", "Tees", "Kids Clothing", new Date("17/10/2019")));
		products.add(new Product("18", "Leggings", "Kids Clothing", new Date("18/10/2019")));
		products.add(new Product("19", "Shirts", "Kids Clothing", new Date("19/10/2019")));
		products.add(new Product("20", "School Uniforms", "Kids Clothing", new Date("20/10/2019")));
		products.add(new Product("21", "Pajamas", "Kids Clothing", new Date("21/10/2019")));
		products.add(new Product("22", "Pants", "Kids Clothing", new Date("22/10/2019")));
		products.add(new Product("23", "Socks", "Kids Clothing", new Date("23/10/2019")));
		products.add(new Product("24", "Backpacks", "Kids Clothing", new Date("24/10/2019")));
		products.add(new Product("25", "sets&outfits", "Kids Clothing", new Date("25/10/2019")));
		return products;
	}
}
