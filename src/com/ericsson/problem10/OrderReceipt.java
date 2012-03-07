package com.ericsson.problem10;

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

		for (Order order : orders) {
			output.append(order.getDescription());
			output.append('\t');
			output.append(order.getPrice());
			output.append('\t');
			output.append(order.getQuantity());
			output.append('\t');
			output.append(order.getPrice().multiply(
					BigDecimal.valueOf(order.getQuantity())));
			output.append('\n');
		}

		BigDecimal salesTax = new BigDecimal("0");
		for (Order order : orders) {
			salesTax = salesTax.add(order.getPrice().multiply(
					BigDecimal.valueOf(order.getQuantity())).multiply(
					BigDecimal.valueOf(.10)));
		}
		output.append("Sales Tax").append('\t').append(salesTax);

		BigDecimal totalAmount = new BigDecimal(0.0);
		for (Order order : orders) {
			totalAmount = totalAmount.add(order.getPrice().multiply(
					BigDecimal.valueOf(order.getQuantity())).add(
					order.getPrice().multiply(
							BigDecimal.valueOf(order.getQuantity())).multiply(
							BigDecimal.valueOf(.10))));
		}
		output.append("Total Amount").append('\t').append(totalAmount);

		return output.toString();
	}

	public void printOwing() {
		// print banner
		System.out.println("**************************");
		System.out.println("***** Customer Owes ******");
		System.out.println("**************************");
		// calculate outstanding
		BigDecimal outstanding = BigDecimal.ZERO;
		for (Order order : orders) {
			outstanding = outstanding.add(order.getPrice());
		}
		// print amount
		System.out.println("amount" + outstanding);
	}
}