public class ShuffleString {
    public static String restoreString(String s, int[] indices) {
        char[] newString = new char[s.length()];
        for(int i = 0; i < indices.length;i++) {
            newString[indices[i]] = s.charAt(i);
        }
        return new String(newString);
}
    public static void main(String[] args) {
        String s = "abc";
        int[] indices = {0, 1, 2};
        restoreString(s, indices);
    }
}
