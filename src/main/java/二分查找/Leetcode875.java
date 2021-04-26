package 二分查找;

import java.util.Random;

public class Leetcode875 {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 1000_000_000;
        while (left < right) {
            int mid = (right + left) >>> 1;
            if (!valid(piles, mid, h)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;


    }

    private boolean valid(int[] piles, int speed, int hour) {
        int time = 0;
        for (int p : piles) {
            time += (p - 1) / speed + 1;
        }
        return time <= hour;
    }


    public static void main(String[] args) {
        Leetcode875 test = new Leetcode875();
        int[] piles = new int[100];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            piles[i] = r.nextInt();
        }
        int res = test.minEatingSpeed(piles, r.nextInt());
        System.out.println(res);

    }
}
