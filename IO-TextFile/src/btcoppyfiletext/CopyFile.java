package btcoppyfiletext;
import java.io.*;

public class CopyFile {

    public static void main(String[] args)  {
        try{
            File file = new File("IO-TextFile\\data\\nguon.txt");
            FileReader input = new FileReader(file);
            File file2 = new File ("IO-TextFile\\data\\duoi.txt");
            FileWriter output = new FileWriter(file2);
            int line;
            int count = 0;
            while ((line=input.read())!=-1) {
//                System.out.println(line);
                output.write(line);
                count++;
            }
            output.close();
            System.out.println("Total number of characters is: " + count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
