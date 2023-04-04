package tinh_so_lan_xuat_hien_ky_tu;

import java.util.HashMap;
import java.util.Map;

public class LamLaiCountChar {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String str = "asdasdasd";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)){
                int count = map.get(c);
                map.put(c,count+1);
            }
            else {
                map.put(c,1);
            }
        }
        for (Character c : map.keySet()) {
            System.out.println("ky tu " + c + " xuat hien " + map.get(c) + " lan");
        }
    }
}
