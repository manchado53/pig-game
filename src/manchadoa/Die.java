/*
 * Course: CSC1110 - 111
 * Fall 2023
 * Lab 12 - The Game of Pig
 * Name: Adrian Manchado
 * Created: 11/17/23
 */
package manchadoa;

import java.util.Random;
/**
 *  Class that simulates the functionalities of a die
 */
public class Die {
    private static final int MIN_SIDES = 2;
    private static final int MAX_SIDES = 100;
    private static final int DEFAULT_SIDES = 6;
    private final Random generator = new Random();
    private final int numSides;
    private int currentvalue;
    /**
     * Initializes the value of the side die to 6 when there is no
     * value given
     */
    public Die(){
        this.numSides = DEFAULT_SIDES;
        this.currentvalue = 0;
    }
    /**
     * Initializes the value of the side die to the
     * value given
     * @param numSides the number of sides requested
     */
    public Die(int numSides){
        if (numSides> MAX_SIDES || numSides< MIN_SIDES){
            this.numSides = DEFAULT_SIDES;
        } else {
            this.numSides = numSides;
        }
        this.currentvalue = 0;
    }
    public int getSideUp(){
        return this.currentvalue;
    }
    /**
     * It rolls the dice
     */
    public void roll(){
        this.currentvalue = generator.nextInt(this.numSides) + 1;
    }


}
