package refactored.duplicateCode;

import java.util.ArrayList;

public class BookRentals {
    private ArrayList<BookRental> bookRentals;

    public String getCustomerName(String rentalId) {
        return getRentalById(rentalId).getCustomerName();
    }

    public void deleteRental(String rentalId) {
        bookRentals.remove(getRentalById(rentalId));
    }

    private BookRental getRentalById(String rentalId) {
        for(int i=0; i<bookRentals.size(); i++) {
            BookRental rental = bookRentals.get(i);
            if(rental.getId().equals(rentalId)) {
                return rental;
            }
        }

        throw new RuntimeException("Rental not found");
    }
}
