package services;

import model.furama_facility.House;

public interface IFacilityService extends IService {
    @Override
    void display();

    @Override
    void add();

    @Override
    void edit();
}
