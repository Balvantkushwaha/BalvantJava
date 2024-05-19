package FileHanling;

import java.io.File;

public class renamefile {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\DELL\\Desktop\\balvant.txt");
        File f2 = new File("C:\\Users\\DELL\\Desktop\\balvantFile.txt");
        if (f1.exists()) {
            System.out.println(f1.renameTo(f2));
            System.out.println("Successfully rename file");
        } else {
            System.out.println("File does not exists...!");
        }

    }
}
