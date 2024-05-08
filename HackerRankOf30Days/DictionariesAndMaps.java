package HackerRankOf30Days;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionariesAndMaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> p = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int phone = sc.nextInt();
            p.put(name, phone);

        }
        while (sc.hasNext()) {
            String s = sc.next();
            if (p.containsKey(s)) {
                int num = p.get(s);
                System.out.println(s + "=" + num);
            } else {
                System.out.println("Not font");
            }
        }
    }
}
