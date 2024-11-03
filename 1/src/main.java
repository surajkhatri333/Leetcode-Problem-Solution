import java.util.*;
public class main {

    public static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;

        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        while(count < s.length()){
//             sb.append(s.substring(1));
//             sb.append(sb.deleteCharAt(0));
            sb.replace(0,sb.length(),sb.substring(1));
            sb.append(s.charAt(count));
//            sb = s.substring(1);
//            s += s.charAt(0);
            System.out.println(sb);
            count++;
            String ss = sb.toString();
            if(ss.contains(goal)) return true;
        }
        return false;
    }
    public static void main(String[] args){
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s,goal));

    }
}
