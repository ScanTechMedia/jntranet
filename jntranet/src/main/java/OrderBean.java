package main.java;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean(name="order")
@SessionScoped
public class OrderBean implements Serializable{
 
	private static final long serialVersionUID = 1L;
 
	String orderNo;
	String productName;
	BigDecimal price;
	int qty;
 
	//getter and setter methods
 
	private static final ArrayList<Order> orderList = 
		new ArrayList<Order>(Arrays.asList(
 
		new Order("A0001", "Intel CPU", 
				new BigDecimal("700.00"), 1),
		new Order("A0002", "Harddisk 10TB", 
				new BigDecimal("500.00"), 2),
		new Order("A0003", "Dell Laptop", 
				new BigDecimal("11600.00"), 8),
		new Order("A0004", "Samsung LCD", 
				new BigDecimal("5200.00"), 3),
		new Order("A0005", "A4Tech Mouse", 
				new BigDecimal("100.00"), 10)
	));
 
	public ArrayList<Order> getOrderList() {
 
		return orderList;
 
	}
 
	public String addAction() {
 
		Order order = new Order(this.orderNo, this.productName, 
			this.price, this.qty);
 
		orderList.add(order);
		return null;
	}
 
	public String deleteAction(Order order) {
 
		orderList.remove(order);
		return null;
	}
 
	public static class Order{
 
		String orderNo;
		String productName;
		BigDecimal price;
		int qty;
 
		public Order(String orderNo, String productName, 
				BigDecimal price, int qty) {
			this.orderNo = orderNo;
			this.productName = productName;
			this.price = price;
			this.qty = qty;
		}
 
		//getter and setter methods
		public String getorderNo(){
			return this.orderNo;
			
		}
		public String getproductName(){
			return this.productName;
		}
		public BigDecimal getprice(){
			return this.price;
		}
		public int getqty(){
			return this.qty;
		}
	}
}