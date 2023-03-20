package counter_word;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CounterWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new TreeMap<>();
        System.out.println("Nhap chuoi: ");
        String inputStr = scanner.nextLine();
        String[] word = inputStr.toUpperCase().split("\\s+");
        for (String w : word) {
            if (map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            } else {
                map.put(w, 1);
            }
        }
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s + " = " + map.get(s));
        }
    }
}
