package com.ericsson.problem8;

public class BookRental {
    private String id;
    private String customerName;

    public BookRental(String id, String customerName) {
        this.id = id;
        this.customerName = customerName;
    }

    public String getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }
}
