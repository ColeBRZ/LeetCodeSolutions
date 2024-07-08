import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2_PassThePillowTest {

    @Test
    void passThePillow() {
        int n1 = 4;
        int time1 = 10;
        int solution1 = 3;

        int n2 = 11;
        int time2 = 5;
        int solution2 = 6;

        int n3 = 33;
        int time3 = 84;
        int solution3 = 21;

        int n4 = 100;
        int time4 = 205;
        int solution4 = 8;

        assertAll(
                () -> assertEquals(solution1, Solution2_PassThePillow.passThePillow(n1, time1)),
                () -> assertEquals(solution2, Solution2_PassThePillow.passThePillow(n2, time2)),
                () -> assertEquals(solution3, Solution2_PassThePillow.passThePillow(n3, time3)),
                () -> assertEquals(solution4, Solution2_PassThePillow.passThePillow(n4, time4))
        );
    }
}