package optionalbtcopyfilenhiphan;

import java.io.*;
import java.util.Scanner;

public class CopyBinaryFile {
    private static void copyFileUsingStream(File source, File dest) throws IOException{
        if (source.exists()){
            System.out.println("file already exists");
        } else System.out.println("File does not exist yet");
        if (dest.exists()){
            System.out.println("file already exists");
        } else System.out.println("File does not exist yet");
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0){
                outputStream.write(buffer,0,length);
            }
        } finally {
            assert inputStream != null;
            inputStream.close();
            assert outputStream != null;
            outputStream.close();
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter source file: ");
        String sourcePath = in.nextLine();
        System.out.printf("Enter destinatioin file: ");
        String destPath = in.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);


        try {
            copyFileUsingStream(sourceFile, destFile);
            System.out.printf("Copy completed");
        } catch (IOException ioe){
            System.out.printf("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }
    }
}
