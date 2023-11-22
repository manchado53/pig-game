/*
 * Course: CSC1110 - 111
 * Fall 2023
 * Lab 12 - The Game of Pig
 * Name: Adrian Manchado
 * Created: 11/17/23
 */
package manchadoa;
/**
 * Creates the players
 */
public abstract class Player {
    private final String name;
    private int score;
    /**
     * Initializes the name of the player
     * @param name name of player
     */
    public Player(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int getScore(){
        return this.score;
    }
    /**
     * Adds a score to the current one
     * @param turnScore the score added after the turn
     */
    public void addToScore(int turnScore){
        this.score += turnScore;
    }
    /**
     * It checks if the player holds
     * @param turnScore the score to add if they hold
     * @return true if player hold, return false if keep going
     */
    public abstract boolean chooseToHold(int turnScore);
    /**
     * Gives status for single player
     * @return points of a player
     */
    public String toString(){
        return "\t" + getName() + " : " + getScore() + "\n";
    }


}
