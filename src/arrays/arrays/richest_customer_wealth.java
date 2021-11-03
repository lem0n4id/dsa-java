package arrays.arrays;

import java.util.Arrays;


public class richest_customer_wealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        int wel = maximumWealth(accounts);
        System.out.println(wel);
    }
    public static int maximumWealth(int[][] accounts) {
        int[] wealth = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            int[] arr = {0};
            for (int j = 0; j < accounts[i].length; j++) {
                arr[0] = arr[0] + accounts[i][j];
            }
            wealth[i] = arr[0];
        }
        int max = 0;
        for (int i = 0; i < wealth.length; i++) {
            int num = wealth[i];
            if (max<num) {
                max = num;
            }
        }
        return max;
    }
}
