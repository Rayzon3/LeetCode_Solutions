import java.util.HashMap;

class wordPatternSolution {

    public static boolean wordPattern(String pattern, String s) {
        // split sentence on spaces
        String words[] = s.split(" ");

        if (words.length != pattern.length()) {
            return false;
        }

        // init hash map
        HashMap<Character, String> myHashMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char current_char = pattern.charAt(i);
            if (myHashMap.containsKey(current_char)) {
                if (!myHashMap.get(current_char).equals(words[i])) {
                    return false;
                }
            } else {
                if (myHashMap.containsValue(words[i])) {
                    return false;
                }
                myHashMap.put(current_char, words[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
}
