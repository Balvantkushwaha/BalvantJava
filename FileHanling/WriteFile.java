package FileHanling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String args[]) {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\DELL\\Desktop\\bvk.txt");
            try {
                fw.write("Java Program is the best language in world ..! ");
            } finally {
                fw.close();
            }
            System.out.println("successfully file data wrote in file");
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
