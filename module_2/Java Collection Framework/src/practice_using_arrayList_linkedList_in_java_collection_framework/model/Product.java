package practice_using_arrayList_linkedList_in_java_collection_framework.model;

import java.util.List;

public class Product {
    int id;
    String name;
    String typeOfProduct;
    int price;

    public Product() {
    }

    public Product(int id, String name, String typeOfProduct, int price) {
        this.id = id;
        this.name = name;
        this.typeOfProduct = typeOfProduct;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public void setTypeOfProduct(String typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", typeOfProduct='" + typeOfProduct + '\'' +
                ", price=" + price + " USD" +
                '}';
    }
}
