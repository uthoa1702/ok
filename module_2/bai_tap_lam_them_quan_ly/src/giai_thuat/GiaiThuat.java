package giai_thuat;

import java.util.Arrays;

public class GiaiThuat {
    public static void main(String[] args) {
        String s = "CodegymDaNang";
        s = s.replaceAll("\\B([A-Z])", " $1").toLowerCase();
        System.out.println(s);

}}
