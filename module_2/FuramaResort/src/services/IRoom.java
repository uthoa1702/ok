package services;

public interface IRoom extends IService{
    @Override
    void display();

    @Override
    void add();

    @Override
    void edit();
}
