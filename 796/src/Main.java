
//------------>796. Rotate String <-------------
public class Main {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;

        if(s.contains(goal)) return true;

        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        while (count < s.length()) {
            sb.replace(0, sb.length(), sb.substring(1));
            sb.append(s.charAt(count));
            count++;
            if (sb.toString().contains(goal))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        rotateString(s,goal);
    }
}