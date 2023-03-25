package services;

public interface IEmployeeService extends IService {
    @Override
    void display();

    @Override
    void add();

    @Override
    void edit();
}
