//-------------->2490. Circular Sentence<----------------

public class Main {
    public static boolean isCircularSentence(String sentence) {
        String[] s = sentence.split(" ");

        if(s[0].charAt(0) != s[s.length -1].charAt(s[s.length -1].length() - 1)) return false;
        for(int i = 0; i < s.length - 1; i++){
            char str = s[i].charAt(s[i].length() -1);

            if(str != s[i+1].charAt(0)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String sentence = "leetcode exercises sound delightful";
        System.out.println(isCircularSentence(sentence));
    }
}