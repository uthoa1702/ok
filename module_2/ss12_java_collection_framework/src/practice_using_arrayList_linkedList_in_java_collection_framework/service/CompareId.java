package practice_using_arrayList_linkedList_in_java_collection_framework.service;

import practice_using_arrayList_linkedList_in_java_collection_framework.model.Product;

import java.util.Comparator;

public class CompareId implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPrice()-o2.getPrice());
    }

}
