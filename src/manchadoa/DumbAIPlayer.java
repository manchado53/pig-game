/*
 * Course: CSC1110 - 111
 * Fall 2023
 * Lab 12 - The Game of Pig
 * Name: Adrian Manchado
 * Created: 11/17/23
 */
package manchadoa;
/**
 * Creates the AI player that choose 50% times to hold
 */
public class DumbAIPlayer extends AIPlayer {
    private final Die coin;
    /**
     * Initializes the coin to a die of 2 sides
     */
    public DumbAIPlayer() {
        this.coin = new Die(2);
    }
    @Override
    public boolean chooseToHold(int turnScore) {

        coin.roll();
        if (coin.getSideUp() == 1){
            addToScore(turnScore);
            return true;
        } else {
            return false;
        }
    }
}
