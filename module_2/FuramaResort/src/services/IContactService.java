package services;

public interface IContactService extends IService {
    @Override
    void display();

    @Override
    void add();

    @Override
    void edit();
}
