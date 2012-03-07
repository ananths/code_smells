package com.ericsson.problem2;

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

    public boolean equals(Object obj) {
        if(getClass() != obj.getClass())
            return false;
        return getId().equals(((BookRental)obj).getId());
    }
}
