import java.util.*;


class solution {

    static List<String> res = new ArrayList<String>();

    public static String toString(char[] a) {
        String string = new String(a);
        return string;
    }

    public static void descOrder(char[] s) {
        Arrays.sort(s);
        reverse(s);
    }

    public static void reverse(char[] a) {
        int n = a.length;
        char temp;
        
        for (int i = 0; i < n / 2; i++) {
            temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }
        
        res.add(toString(a));
    }

    public static void main(String[] args) {
        char[] program = { 'S', 'o', 'f', 't', 'w', 'a', 'r', 'e', ' ', 'E', 'n', 'g', 'i', 'n', 'e', 'e', 'r', 'i',
                'n', 'g', ' ', 'C', 'a', 'r', 'e', 'e', 'r', ' ', 'P', 'r', 'o', 'g', 'r', 'a', 'm' };

        String sentence = toString(program);

        StringTokenizer tokenizer = new StringTokenizer(sentence);
        List<String> words = new ArrayList<String>();

        while (tokenizer.hasMoreTokens()) {
            words.add(tokenizer.nextToken());
        }

        // for (int i = 0; i < words.size(); i++) {
        //     System.out.println(words.get(i));
        // }

        Collections.sort(words);

        // System.out.println("______________________________");

        // for (int i = 0; i < words.size(); i++) {
        //     System.out.println(words.get(i));
        // }

        for(int i = 0; i < words.size(); i++) {
            String x = words.get(i);
            // System.out.println("word going to desc" + x);
            descOrder(x.toCharArray());
        }

        for(int i = 0; i < res.size(); i++) {
            System.out.println(String.valueOf(res.get(i)));
        }

    }
}
