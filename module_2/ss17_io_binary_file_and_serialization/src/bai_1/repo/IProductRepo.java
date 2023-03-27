package bai_1.repo;

import bai_1.model.Product;

import java.io.IOException;
import java.util.List;

public interface IProductRepo {
    List<Product> getAllProduct() throws IOException, ClassNotFoundException;
    void add(Product product) throws IOException, ClassNotFoundException;
    void search(String name) throws IOException, ClassNotFoundException;
}
