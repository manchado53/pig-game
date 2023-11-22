/*
 * Course: CSC1110 - 111
 * Fall 2023
 * Lab 12 - The Game of Pig
 * Name: Adrian Manchado
 * Created: 11/17/23
 */
package manchadoa;

import java.util.Scanner;
/**
 * Creates a human player
 */
public class HumanPlayer extends Player {
    private final Scanner in;
    /**
     * Initilizes name and in to pass in
     * @param name name of player
     * @param in scanner class
     */
    public HumanPlayer(String name, Scanner in){
        super(name);
        this.in = in;
    }

    @Override
    public boolean chooseToHold(int turnScore) {
        System.out.println("Hold? [y/n]");
        if (in.nextLine().equalsIgnoreCase("y")){
            addToScore(turnScore);
            return true;
        } else {
            return false;
        }
    }
}
