package com.ericsson.problem8;

import java.util.ArrayList;

public class BookRentals {
    private ArrayList<BookRental> bookRentals;

    public String getCustomerName(String rentalId) {
        for(int i=0; i<bookRentals.size(); i++) {
            BookRental rental = bookRentals.get(i);
            if(rental.getId().equals(rentalId)) {
                return rental.getCustomerName();
            }
        }
        throw new RuntimeException("Rental not found");
    }

    public void deleteRental(String rentalId) {
        for(int i=0; i<bookRentals.size(); i++) {
            BookRental rental = bookRentals.get(i);
            if(rental.getId().equals(rentalId)) {
                bookRentals.remove(i);
                return;
            }
        }
        throw new RuntimeException("Rental not found");
    }
}
