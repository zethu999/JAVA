public class MoveAllXtoend {
    public static void moveX(String str, String newString, int idx, int count) {
        if(idx == str.length()) {
            for(int i=0; i<count; i++) {
                newString += 'x' ;
            }
            System.out.println(newString);
            return;
        }

        if(str.charAt(idx) == 'x') {
            count++;
            moveX(str, newString, idx+1, count);
        }else {
            newString += str.charAt(idx) ;
            moveX(str, newString, idx+1, count);
        }
    }

    public static void main(String[] args) {
        String str = "abcxberbsxxfsd";
        moveX(str, "", 0, 0);
    }
}
