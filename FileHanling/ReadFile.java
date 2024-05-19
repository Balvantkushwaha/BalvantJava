package FileHanling;

import java.io.IOException;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("C:\\Users\\DELL\\Desktop\\bvk.txt");
            try {
                int i;
                while ((i = fr.read()) != -1) { // ek ek character read kar pa rahe hai
                    System.out.print((char) i);
                }

            } finally {
                fr.close();
            }

        } catch (IOException e) {
            System.out.println("exception handling ..!");
        }
    }
}
