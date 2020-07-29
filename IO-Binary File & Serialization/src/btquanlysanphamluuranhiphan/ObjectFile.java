package btquanlysanphamluuranhiphan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectFile {
    List<Product> readObjectFile(String path) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Product> products = new ArrayList<>();
        Product product;
        try{
            while ((product = (Product)objectInputStream.readObject()) != null){
                System.out.println(product);
                products.add(product);
            }
        } catch (EOFException ex){
            System.out.println("End of file");
        }
        return products;
    }
    void writeObjectFile(String path, List<Product> products) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        for (Product product: products){
            objectOutputStream.writeObject(product);
        }
    }
}
