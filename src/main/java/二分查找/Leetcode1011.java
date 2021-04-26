package 二分查找;

import java.util.Arrays;

public class Leetcode1011 {
    public int shipWithinDays(int[] weights, int D) {
        int left = Arrays.stream(weights).max().getAsInt();

        int right = Arrays.stream(weights).sum();
        while (left < right) {
            int mid = (left + right) >>> 1;
            int cur = 0;
            int need = 1;
            for (int w: weights) {
                if (cur + w > mid) {
                    ++need;
                    cur = 0;
                }
                cur += w;
            }
            if (need <= D) {
                right = mid;
            }
            else {
                left = mid+1;
            }

        }
        return left;

    }

    public static void main(String[] args) {
        Leetcode1011 test = new Leetcode1011();
        int[] weights = {1, 2, 3, 4, 5, 6};
        int res = test.shipWithinDays(weights, 2);
        System.out.println(res);

    }

}
