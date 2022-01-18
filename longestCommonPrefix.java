import java.util.Arrays;

class solution {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int counter = 0;

        while (counter < first.length()) {
            if (first.charAt(counter) == last.charAt(counter))
                counter++;
            else
                break;
        }

        return counter == 0 ? "" : first.substring(0, counter);

    }

    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(strs));
    }
}
