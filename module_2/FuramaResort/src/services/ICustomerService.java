package services;

public interface ICustomerService extends IService {
    @Override
    void display();

    @Override
    void add();

    @Override
    void edit();
}
