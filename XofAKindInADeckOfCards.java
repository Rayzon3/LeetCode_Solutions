import java.util.Arrays;

class sol{

    public static boolean hasGroupSizeX(int[] dec){
        boolean val = true;
        int count = 0;
        if(dec.length == 1){
            return false;
        }
        Arrays.sort(dec);
        for(int i = 0; i < dec.length - 1; i++){
            if(dec[i] == dec[i + 1]){
                count++;
            }
            else if(dec[i] != dec[i + 1]){
                if(count % 2 != 0){
                    val = false;
                }
                val = true;
                count = 0;
            }
        }

        return val;
    }

    public static void main(String[] args) {
        int[] dec = {1,2,3,4,4,3,2,1};
        System.out.println(hasGroupSizeX(dec));
    }
}