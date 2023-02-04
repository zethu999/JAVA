public class RemoveDuplicates {
    public static boolean[] map = new boolean[26];
    
    public static void removeDuplicates(String str, String newStr, int idx) {
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char c = str.charAt(idx);
        if(map[c-'a'] == true) {
            removeDuplicates(str, newStr, idx+1);
        }else {
            newStr += c;
            map[c-'a'] = true;
            removeDuplicates(str, newStr, idx+1);
        } 
    }

    public static void main(String[] args) {
        String str = "aaafsddeewssdvsas";
        removeDuplicates(str, "", 0);
    }

}
