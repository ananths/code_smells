package com.ericsson.problem7;

public class OrderItem {
	private int quantity;
	private double price;

	public OrderItem(int quantity, double price) {
		super();
		this.quantity = quantity;
		this.price = price;
	}

	public double calculatePrice() {
		// price is base price - quantity discount + shipping
		return quantity * price
                - Math.max(0, quantity - 500) * price * 0.05
				+ Math.min(quantity * price * 0.1, 100.0);
	}
}

// Refactor into variables. Then move into methods.

//dup code
//long meth
//large class
//feature envy
//data clumps
//data class
