import java.util.HashSet;

class solution{

    int lengthOfLongestSubString(String s){
        int prev = 0;
        int next = 0;
        int num = 0;

        HashSet<Character>myHashSet = new HashSet<Character>();

        while(next < s.length()){
            if(!myHashSet.contains(s.charAt(next))){
                myHashSet.add(s.charAt(next));
                next++;
                num = Math.max(myHashSet.size(), num);
            }
            else{
                myHashSet.remove(s.charAt(prev));
                prev++;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        String s = "abcabccbb";
        solution Obj = new solution();
        Obj.lengthOfLongestSubString(s);
    }
}