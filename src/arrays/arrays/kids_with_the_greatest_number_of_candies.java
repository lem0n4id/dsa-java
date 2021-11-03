package arrays.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kids_with_the_greatest_number_of_candies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> ans = kidsWithCandies(candies, extraCandies);
        System.out.println(ans);
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest = candies[0];
        List<Boolean> ans = new ArrayList<Boolean>(candies.length);
        for (int num: candies
             ) {
            if (num>greatest) {
                greatest = num;
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i]+extraCandies>=greatest) {
                ans.add(true);
            }
            else {
                ans.add(false);
            }
        }
        return ans;
    }
}
