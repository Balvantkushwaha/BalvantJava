package FileHanling;

import java.io.*;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\DELL\\Desktop\\bvk.txt");

        if (f.createNewFile()) {
            System.out.println("File successfully create ...!");
        } else {
            System.out.println("File Aready exits ...!");
        }
        // Ham try catch ka use kar sakate hai .
    }
}
