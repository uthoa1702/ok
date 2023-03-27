package bai_1.repo.impl;

import bai_1.model.Product;
import bai_1.repo.IProductRepo;
import bai_1.util.ReadAndWrite;

import java.io.IOException;
import java.util.List;


public class ProductRepo implements IProductRepo {
    static final String PATH = "D:\\code_Gym\\ok\\module_2\\ss17_io_binary_file_and_serialization\\src\\data\\product.dat";


    @Override
    public List<Product> getAllProduct() throws IOException, ClassNotFoundException {
        List<Product> productList = ReadAndWrite.readFileBinary(PATH);
        return productList;
    }

    @Override
    public void add(Product product) throws IOException, ClassNotFoundException {
       List<Product>list=ReadAndWrite.readFileBinary(PATH);
       list.add(product);
       ReadAndWrite.writeListProductToFile(PATH,list);
    }

    @Override
    public void search(String name) throws IOException, ClassNotFoundException {
        List<Product> productList = ReadAndWrite.readFileBinary(PATH);
        for (Product p : productList) {
            if (name.toLowerCase().equals(p.getName().toLowerCase())) {
                System.out.println(p);
            }
        }
    }
}
