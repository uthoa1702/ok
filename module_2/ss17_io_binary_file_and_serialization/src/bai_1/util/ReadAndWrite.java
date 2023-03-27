package bai_1.util;

import bai_1.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<Product> readFileBinary(String pathFile) throws IOException, ClassNotFoundException {
        List<Product> products = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(pathFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return products;
    }

    public static void writeListProductToFile(String pathFile, List<Product> product1List) {
        File file = new File(pathFile);
        ObjectOutputStream oOS = null;
        try {
            oOS = new ObjectOutputStream(new FileOutputStream(file));
            oOS.writeObject(product1List);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oOS.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}










