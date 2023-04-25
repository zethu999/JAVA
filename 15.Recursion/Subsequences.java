public class Subsequences {
    public static void subSeq(String str, int idx, String newString) {
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char c = str.charAt(idx);
        subSeq(str, idx+1, newString+c);
        subSeq(str, idx+1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subSeq(str, 0, "");
    }
}
