package FileHanling;

import java.io.*;

public class FileInfo {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\DELL\\Desktop\\bvk.txt");
        if (f.exists()) {
            System.out.println("File Name :" + f.getName());
            System.out.println("File Path :" + f.getAbsolutePath());
            System.out.println("File Writable :" + f.canWrite());
            System.out.println("File Readable :" + f.canRead());
            System.out.println("File of Size : " + f.length());
            System.out.println("File delete : " + f.delete());

        } else {
            System.out.println("File doesn't exetis");
        }

    }
}
