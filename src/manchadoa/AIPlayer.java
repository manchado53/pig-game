/*
 * Course: CSC1110 - 111
 * Fall 2023
 * Lab 12 - The Game of Pig
 * Name: Adrian Manchado
 * Created: 11/17/23
 */
package manchadoa;
/**
 * Creates the AI players
 */
public abstract class AIPlayer extends Player {
    private static int numberOfAIPlayers = 0;
    /**
     * passes in the name of the AI players as: Bot#0
     */
    public AIPlayer(){
        super("Bot #" + numberOfAIPlayers);
        numberOfAIPlayers++;
    }
}
