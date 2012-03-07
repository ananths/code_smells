package com.ericsson.problem4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * OrderReceipt prints the details of order including description, quantity,
 * price and amount. It also calculates the sales tax @ 10% and prints as part
 * of order. It computes the total order amount (amount of individual orders +
 * total sales tax) and prints it.
 * 
 */
public class OrderReceipt {
	public List<Order> orders;

	public OrderReceipt(List<Order> orders) {
		this.orders = new ArrayList<Order>(orders);
	}

	public String printReceipt() {
		StringBuilder output = new StringBuilder();
		output.append("======Printing Orders======\n");

		output.append(getOrderDetails());

		BigDecimal salesTax = calculateTotalSalesTax();
		output.append("Sales Tax").append('\t').append(salesTax);

		BigDecimal totalAmount = calculateTotalAmount();
		output.append("Total Amount").append('\t').append(totalAmount);

		return output.toString();
	}

	public void printOwing() {
		printBanner();
		printAmount(outstanding());
	}

	private void printBanner() {
		System.out.println("**************************");
		System.out.println("***** Customer Owes ******");
		System.out.println("**************************");
	}

	private BigDecimal outstanding() {
		BigDecimal outstanding = BigDecimal.ZERO;
		for (Order order : orders) {
			outstanding = outstanding.add(order.getPrice());
		}
		return outstanding;
	}

	private void printAmount(BigDecimal amount) {
		System.out.println("amount" + amount);
	}

	private BigDecimal calculateTotalAmount() {
		BigDecimal totalAmount = BigDecimal.ZERO;
		for (Order order : orders) {
			totalAmount = totalAmount.add(order.calculateTotalAmount());
		}
		return totalAmount;
	}

	private BigDecimal calculateTotalSalesTax() {
		BigDecimal salesTax = BigDecimal.ZERO;
		for (Order order : orders) {
			salesTax = salesTax.add(order.calculateSalesTax());
		}
		return salesTax;
	}

	private String getOrderDetails() {
		StringBuilder output = new StringBuilder();
		for (Order order : orders) {
			output.append(order.toString());
		}
		return output.toString();
	}
}