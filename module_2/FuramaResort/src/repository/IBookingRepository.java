package repository;

import model.booking.Booking;

import java.util.TreeSet;

public interface IBookingRepository {
    TreeSet<Booking> getListBooking();
    void addNewBooking(Booking newBooking);
}
