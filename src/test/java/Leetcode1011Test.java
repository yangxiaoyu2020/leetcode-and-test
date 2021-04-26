import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import 二分查找.Leetcode1011;

public class Leetcode1011Test {
    @Test
    void testLeetcode1011() {
        Leetcode1011 test = new Leetcode1011();
        int[] weights = {1, 2, 3, 4, 5, 6};
        assertEquals(9, test.shipWithinDays(weights, 3));
        int[] weights1 = {1, 1, 2, 3, 4, 5, 6, 10, 9, 8};
        assertEquals(16, test.shipWithinDays(weights1, 4));

    }
}
