public class Main {
    public static  String compressedString(String word) {
        StringBuilder s = new StringBuilder();
        int count = 1;
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                count++;
                if (count == 10) {
                    s.append(9);
                    s.append(word.charAt(i));
                    count = 1;
                }
            } else {
                s.append(count);
                s.append(word.charAt(i));
                count = 1;
            }
        }

        if (count > 1) {
            s.append(count);
            s.append(word.charAt(word.length() - 1));
        } else {
            s.append(1);
            s.append(word.charAt(word.length() - 1));
        }
        return s.toString();
    }
    public static void main(String[] args) {
        String word = "abcde";
        System.out.println(compressedString(word));
    }
}