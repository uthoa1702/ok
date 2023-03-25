package services;

public interface IBookingService extends IService {
    @Override
    void display();

    @Override
    void add();

    @Override
    void edit();
}
