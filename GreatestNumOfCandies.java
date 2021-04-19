import java.util.*;

public class GreatestNumOfCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        int candy;
        int max = 0;
        List<Boolean> list = new ArrayList<Boolean>();
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        for(int index = 0; index < candies.length; index++){
            candy = candies[index] + extraCandies;
            if(candy >= max){
                list.add(true);
            }
            else list.add(false);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}
