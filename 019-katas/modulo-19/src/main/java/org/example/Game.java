package org.example;

public class Game {
    private int currentRoll = 1;
    private final int[] rolls = new int[22];

    public void roll(int pinsDown) {
        rolls[currentRoll++] = pinsDown;
    }

    public int score() {
        int score = 0;
        int rollIndex = 1;
        for (int frame = 1; frame <= 10; frame++) {

            if (isStrike(rollIndex)) {
                score += 10 + strikeBonus(rollIndex);
                rollIndex++;
            } else if (isSpare(rollIndex)) {
                score += 10 + spareBonus(rollIndex);
                rollIndex += 2;
            } else {
                score += sumOfBallsInFrame(rollIndex);
                rollIndex += 2;
            }


        }
        return score;
    }

    private int sumOfBallsInFrame(int rollIndex) {
        return rolls[rollIndex] + rolls[rollIndex + 1];
    }

    private int strikeBonus(int rollIndex) {
        return rolls[rollIndex+1] + rolls[rollIndex+2];
    }

    private int spareBonus(int rollIndex) {
        return rolls[rollIndex+2];
    }

    private boolean isStrike(int rollIndex) {
        return rolls[rollIndex] == 10;
    }

    private boolean isSpare(int rollIndex) {
        return sumOfBallsInFrame(rollIndex) == 10;
    }
}
