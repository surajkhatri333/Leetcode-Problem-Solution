
import java.util.*;
public class Main {

    public static String makeFancyString(String s) {

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            char cnext = s.charAt(i + 1);
            if (c == cnext) {
                count++;

            } else {
                if (count >= 2) {
                    result.append(c).append(c);
                    count = 1;
                } else {
                    result.append(c);
                }

            }
        }

        if (count >= 2) {
            result.append(s.charAt(s.length() - 1)).append(s.charAt(s.length() - 1));
        } else {
            result.append(s.charAt(s.length() - 1));
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String  s = "leeetcode";
        System.out.println(makeFancyString(s));
    }
}