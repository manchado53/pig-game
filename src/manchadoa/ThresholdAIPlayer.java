/*
 * Course: CSC1110 - 111
 * Fall 2023
 * Lab 12 - The Game of Pig
 * Name: Adrian Manchado
 * Created: 11/17/23
 */
package manchadoa;
/**
 * Creates an AI player with a threshold
 */
public class ThresholdAIPlayer extends AIPlayer {
    private final int threshold;
    /**
     * Sets up the threshold
     * @param threshold the threshold
     */
    public ThresholdAIPlayer(int threshold){
        final int maxThreshold = 100;
        final int minThreshold = 1;
        if (threshold <= maxThreshold && threshold>minThreshold) {
            this.threshold = threshold;
        } else {
            this.threshold = 0;
        }
    }

    @Override
    public boolean chooseToHold(int turnScore) {
        if (turnScore > threshold){
            addToScore(turnScore);
            return true;
        } else {
            return false;
        }
    }
}
