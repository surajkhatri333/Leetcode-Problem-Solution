//---------------->2914. Minimum Number of Changes to Make Binary String Beautiful <------------

public class Main {
    public static int minChanges(String s) {
        int count = 0;
        for(int i = 0; i < s.length() - 1; i+=2){
            if(s.charAt(i) != s.charAt(i+1)) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s= "1001";
        System.out.println(minChanges(s));
    }
}