package com.zeta.sale;

import java.util.ArrayList;
import java.util.List;

public class Sale {


	public void transaction() {
		Product pen = new Product(1,"Reynolds",10,2);
		Product apple = new Product(1,"abc",200,2);
		List<Product> products= new ArrayList<Product>();
		products.add(pen);
		products.add(apple);

		Purchase purchase= new Purchase(false);
		purchase.setCreatedDate(System.currentTimeMillis());
		purchase.setProducts(products);
		purchase.setId(1);
		purchase.setTotal(pen.getQuantity()*pen.getPrice()+apple.getQuantity()*apple.getPrice());
		//code map model db table

	}

	//@getMapping
	public List<Sale> getTransactions() {

		//code get the list for taht particular day
		//Repository.get(List<transaction>);
		return null;
	}


}
