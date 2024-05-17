package heckerrankPratice.String;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class javaToken {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // String s = scn.nextLine();
        // s.add("balvant");
        // String message = String.Join("-" );

        List<String> strings = new LinkedList<>();
        strings.add("Java");
        strings.add("is");
        strings.add("cool");
        strings.add("?");
        strings.add("@");
        strings.add("#");
        String message = String.join("#", strings);
        System.out.println(message);
    }
}
