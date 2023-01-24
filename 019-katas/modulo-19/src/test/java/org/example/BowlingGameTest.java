package org.example;

import junit.framework.TestCase;

public class BowlingGameTest extends TestCase {
    private Game game;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        game = new Game();
    }

    public void testUtterGame() {
        rollMany(20, 0);
        assertEquals(0, game.score());
    }

    public void testAllOnes() {
        rollMany(20, 1);
        assertEquals(20, game.score());
    }

    public void testOneSpare() {
        rollSpare();
        game.roll(3);
        rollMany(17, 0);
        assertEquals(5+5+(3*2)+0, game.score());
    }

    public void testOneStrike() {
        rollStrike();
        game.roll(3);
        game.roll(4);
        rollMany(16, 0);
        assertEquals(10+(3+4)+3+4+0, game.score());
    }

    public void testPerfectGame() {
        rollMany(12, 10);
        assertEquals(30*10, game.score());
    }

    private void rollStrike() {
        game.roll(10);
    }

    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }

    private void rollMany(int n, int pinsDown) {
        for (int i = 1; i <= n; i++) {
            game.roll(pinsDown);
        }
    }

}
