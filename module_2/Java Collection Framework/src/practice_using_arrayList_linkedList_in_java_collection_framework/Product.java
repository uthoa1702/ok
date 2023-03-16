package practice_using_arrayList_linkedList_in_java_collection_framework;

public class Product {
    int id;
    String name;
    String typeOfProduct;
    double price;

    public Product() {
    }

    public Product(int id, String name, String typeOfProduct, double price) {
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

    public void setPrice(double price) {
        this.price = price;
    }


}
