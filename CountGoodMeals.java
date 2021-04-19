public class CountGoodMeals {

    public static int countPairs(int[] deliciousness){
        int count = 0;
        for(int i = 0; i < 21; i++){
            for(int j = 0; j < deliciousness.length; j++){
                double y = Math.pow(2, i) + deliciousness[j];
                for(int index = 0; index < deliciousness.length; index++){
                    if(y == deliciousness[index]){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] deliciousness = {1,1,1,3,3,3,7};
        System.out.println(countPairs(deliciousness));
    }
}
