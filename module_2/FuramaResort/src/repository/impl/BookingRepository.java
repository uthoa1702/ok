package repository.impl;

import model.booking.Booking;
import repository.IBookingRepository;
import util.read_and_write.ReadAndWriteBooking;
import util.read_and_write.ReadAndWriteVilla;

import java.util.TreeSet;

public class BookingRepository implements IBookingRepository {
    static TreeSet<Booking> bookingTreeSet = new TreeSet<>();
    @Override
    public TreeSet<Booking> getListBooking() {
        return bookingTreeSet = ReadAndWriteBooking.read();
    }

    @Override
    public void addNewBooking(Booking newBooking) {
        ReadAndWriteBooking.write(newBooking,true);
    }
}
