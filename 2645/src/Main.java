public class Main {
    public static int addMinimum(String word) {
        if (word.length() == 1)
            return 2;
        int i = 0; // to iterate thorugh each index of string
        int ans = 0; // it stores the minimun number of character inserted
        while (i < word.length()) {
            char c = word.charAt(i);
            if (c == 'a') {
                if (i < word.length() - 1 && word.charAt(i + 1) == 'a') {
                    i++;
                    ans += 2;
                } else if (i < word.length() - 2 && word.charAt(i + 1) == 'b' && word.charAt(i + 2) == 'c') {
                    i += 3;
                } else if (i < word.length() - 1 && (word.charAt(i + 1) == 'c' || word.charAt(i + 1) == 'b')) {
                    ans += 1;
                    i += 2;
                } else {
                    ans += 2; // "a" alone needs "bc"
                    i++;
                }
            } else if (c == 'b') {
                if (i < word.length() - 1 && word.charAt(i + 1) == 'c') {
                    ans += 1;
                    i += 2;
                } else {
                    i++;     //  "b" alone need "ac"
                    ans += 2;
                }
            } else {
                ans += 2;
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s1 = "b";         // TestCase 1
        String s2 = "aaa";       // TestCase 2
        String s3 = "abc";       // TestCase 3
        String s4 = "aaaaac";    // TestCase 4

        System.out.println("The minimum String required to insert : "+addMinimum(s1));
    }
}