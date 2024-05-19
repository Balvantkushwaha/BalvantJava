package FileHanling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataFile {
    public static void main(String[] args) throws IOException {
        FileInputStream r = new FileInputStream("C:\\Users\\DELL\\Desktop\\balvantFile.txt");
        FileOutputStream w = new FileOutputStream("C:\\Users\\DELL\\Desktop\\hariom.txt");
        int i;
        while ((i = r.read()) != -1) {
            w.write((char) i);
        }
        System.out.println("successfully copies");
    }
}
