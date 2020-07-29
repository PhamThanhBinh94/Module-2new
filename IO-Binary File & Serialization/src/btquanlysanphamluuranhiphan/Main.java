package btquanlysanphamluuranhiphan;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    List<Product> products = new ArrayList<>();
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        final String PATH = "product.csv";

        Main main = new Main();
        ObjectFile objectFile = new ObjectFile();
        main.products.add(new Product("A","Thang","Honda",300.000));
        main.products.add(new Product("AA","Hien","Yamaha",400.000));
        main.products.add(new Product("AAA","Phuc","Huyndai",500.000));
        try {
            objectFile.writeObjectFile(PATH,main.products);
            main.products = objectFile.readObjectFile(PATH);
            System.out.println();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<Product> listProduct = (ArrayList<Product>) objectFile.readObjectFile(PATH);
        System.out.println("=======");
        for(Product a: listProduct){
            if (a.getBrand().compareTo("Huyndai") == 0) {
                System.out.println(a);
            }
        }


    }
}