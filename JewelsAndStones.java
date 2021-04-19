public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones){
        int num = 0;
        for(int i = 0; i < jewels.length(); i++){
            for(int j = 0; j < stones.length(); j++){
                if(jewels.charAt(i) == stones.charAt(j)){
                    num++;
                }
            }
        }
        return num;
    }
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }
}
