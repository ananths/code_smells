package com.ericsson.problem4;

import java.math.BigDecimal;

public class Order {

	private String description;
	private BigDecimal price;
	private int quantity;

	public Order(String description, double price, int quantity) {
		super();
		this.description = description;
		this.price = BigDecimal.valueOf(price);
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public BigDecimal getTotalPrice() {
		return getPrice().multiply(BigDecimal.valueOf(getQuantity()));
	}

	public BigDecimal calculateSalesTax() {
		return getTotalPrice().multiply(BigDecimal.valueOf(.10));
	}
	
	public BigDecimal calculateTotalAmount() {
		return getTotalPrice().add(calculateSalesTax());
	}

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		output.append(getDescription());
		output.append('\t');
		output.append(getPrice());
		output.append('\t');
		output.append(getQuantity());
		output.append('\t');
		output.append(getTotalPrice());
		output.append('\n');
		return output.toString();
	}
}
