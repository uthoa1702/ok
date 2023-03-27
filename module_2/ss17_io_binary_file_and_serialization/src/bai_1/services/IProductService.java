package bai_1.services;

import java.io.IOException;

public interface IProductService {
    void display() throws IOException;
    void add() throws IOException;
    void search() throws IOException, ClassNotFoundException;
}
