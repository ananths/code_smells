package com.ericsson.problem1;

public class OrderItem {
	private int quantity;
	private double price;

	public OrderItem(int quantity, double price) {
		super();
		this.quantity = quantity;
		this.price = price;
	}

	public double calculatePrice() {
		return basePrice() - quantityDiscount() + shippingCost();
	}

	private double shippingCost() {
		return Math.min(basePrice() * 0.1, 100.0);
	}

	private double quantityDiscount() {
		return Math.max(0, quantity - 500) * price * 0.05;
	}

	private double basePrice() {
		return quantity * price;
	}

}
