package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Random; // <-- Add this line

public class AppTest {

    @Test
    public void testRandomWalkWithinReasonableBounds() {
        int N = 100;
        int trials = 10;

        for (int i = 0; i < trials; i++) {
            int position = runSingleWalk(N);
            assertTrue(Math.abs(position) <= N, "Position should not exceed N steps in either direction");
        }
    }

    private int runSingleWalk(int N) {
        int pos = 0;
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            pos += rand.nextBoolean() ? 1 : -1;
        }
        return pos;
    }
}
