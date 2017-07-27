package mouni.product;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

import org.apache.commons.lang3.StringUtils;

public class ProductImplementation {

	public List<Product> add25(List<Product> products, List<Product> newProducts) {
		products.addAll(25, newProducts);
		return products;
	}

	public List<Product> sortByName(List<Product> products) {
		Collections.sort(products, new Comparator<Product>() {

			public int compare(Product product1, Product product2) {
				// TODO Auto-generated method stub
				String name1 = product1.getProductName();
				String name2 = product2.getProductName();

				if (StringUtils.isBlank(name1) && StringUtils.isBlank(name2)) {
					return 0;
				} else if (StringUtils.isBlank(name1)) {
					return 1;
				} else if (StringUtils.isBlank(name2)) {
					return -1;
				}

				return name1.compareTo(name2);
			}
		});
		return products;
	}

	public List<Product> sortByNumber(List<Product> products) {
		Collections.sort(products, new Comparator<Product>() {

			public int compare(Product product1, Product product2) {
				// TODO Auto-generated method stub
				String name1 = product1.getProductNumber();
				String name2 = product2.getProductNumber();

				if (StringUtils.isBlank(name1) && StringUtils.isBlank(name2)) {
					return 0;
				} else if (StringUtils.isBlank(name1)) {
					return 1;
				} else if (StringUtils.isBlank(name2)) {
					return -1;
				}

				return name1.compareTo(name2);
			}
		});
		return products;
	}

	public List<Product> sortByCategory(List<Product> products) {
		Collections.sort(products, new Comparator<Product>() {

			public int compare(Product product1, Product product2) {
				// TODO Auto-generated method stub
				String name1 = product1.getCategory();
				String name2 = product2.getCategory();

				if (StringUtils.isBlank(name1) && StringUtils.isBlank(name2)) {
					return 0;
				} else if (StringUtils.isBlank(name1)) {
					return 1;
				} else if (StringUtils.isBlank(name2)) {
					return -1;
				}

				return name1.compareTo(name2);
			}
		});
		return products;
	}

	public List<Product> sortByDate(List<Product> products) {
		Collections.sort(products, new Comparator<Product>() {

			public int compare(Product product1, Product product2) {
				// TODO Auto-generated method stub
				Date date1 = product1.getExpirationDate();
				Date date2 = product2.getExpirationDate();
				return date1.compareTo(date2);
			}
		});
		return products;
	}

	public List<Product> deleteCategory(List<Product> products, String category) {
		ListIterator<Product> iter = products.listIterator();
		while (iter.hasNext()) {
			if (iter.next().getCategory().equals(category)) {
				iter.remove();
			}
		}
		return products;
	}

}
