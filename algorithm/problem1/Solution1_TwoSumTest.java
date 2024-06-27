import static org.junit.jupiter.api.Assertions.*;

class Solution1_TwoSumTest {

    @org.junit.jupiter.api.Test
    void twoSum() {
        int[] array1 = new int[]{2, 5, 7, 9, 16, 13};
        int target1 = 20;
        int[] solution1 = new int[]{2, 5};

        int[] array2 = new int[]{200, 369, 817, 288, 124};
        int target2 = 412;
        int[] solution2 = new int[]{3, 4};

        int[] array3 = new int[]{22, 37, 48, 99, 900, 13, 6, 9, 15};
        int target3 = 37;
        int[] solution3 = new int[]{0, 8};

        assertAll(
                () -> assertArrayEquals(solution1, Solution1_TwoSum.twoSum(array1, target1)),
                () -> assertArrayEquals(solution2, Solution1_TwoSum.twoSum(array2, target2)),
                () -> assertArrayEquals(solution3, Solution1_TwoSum.twoSum(array3, target3))
        );
    }
}