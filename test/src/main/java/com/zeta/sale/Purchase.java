package com.zeta.sale;

import java.util.List;

public class Purchase {

		public int id;
		public List<Product> products ;
		public long createdDate;
		public double Total;
		public boolean sale;//0-credit , 1- debit



		public Purchase(boolean sale) {
			super();
			this.sale = sale;
		}

		public int getId() {
			return id;
		}
		public void setId(int i) {
			this.id = i;
		}
		public List<Product> getProducts() {
			return products;
		}
		public void setProducts(List<Product> products) {
			this.products = products;
		}
		public long getCreatedDate() {
			return createdDate;
		}
		public void setCreatedDate(long l) {
			this.createdDate = l;
		}
		public double getTotal() {
			return Total;
		}
		public void setTotal(double d) {
			Total = d;
		}
		public boolean isSale() {
			return sale;
		}
		public void setSale(boolean sale) {
			this.sale = sale;
		}





}
