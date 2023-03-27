package bai_1.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private float price;
    private String typeOfProduct;
    private String description;

    public Product(int id, String name, float price, String typeOfProduct, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.typeOfProduct = typeOfProduct;
        this.description = description;
    }

    public Product() {
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public void setTypeOfProduct(String typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "model.Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", typeOfProduct='" + typeOfProduct + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getInforProduct() {
        return id + "," + name + "," + price + "," + typeOfProduct + "," + description;
    }
}
