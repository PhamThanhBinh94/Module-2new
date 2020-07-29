//package demo;
//
//import java.io.*;
//
//public class TextFile {
//    void writeFile(String path) throws IOException {
//        File file = new File(path);
//        if (!file.exists())
//            file.createNewFile();
//        FileWriter fileWriter = new FileWriter(file,true);
//        String content = "\n noi dung file";
//        fileWriter.write(content);
////        fileWriter.close();
//        fileWriter.flush();
//    }
//    void  readFile( String path) throws IOException {
//        FileReader fileReader = new FileReader(new File(path));
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String value;
//        while ((value=bufferedReader.readLine()) != null){
//            System.out.println(value);
//            String[]
//        }
//    }
//    public static void main(String[] args) throws IOException {
//        TextFile textFile = new TextFile();
//        final String PATH = "text.cxv";
//        try {
////            textFile.writeFile(PATH);
//            textFile.readFile(PATH);
//        } catch (IOException e){
//            System.out.println("Loi file");
//        }
//    }
//}
