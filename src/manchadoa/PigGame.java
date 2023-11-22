/*
 * Course: CSC1110 - 111
 * Fall 2023
 * Lab 12 - The Game of Pig
 * Name: Adrian Manchado
 * Created: 11/17/23
 */
package manchadoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Pig game sets up the rules and the turns for the game
 */
public class PigGame {
    private final Die die;
    private final List<Player> players;
    /**
     * Initializes the value of the die and creates an arraylist object
     */
    public PigGame(){
        this.die = new Die();
        this.players = new ArrayList<>();
    }
    /**
     * Adds a new player to the game
     * @param player passes in the player
     */
    public void addPlayer(Player player){
        players.add(player);
    }
    /**
     * Prints the status for the players of the game
     * @return a String with the current points
     */
    public String toString(){
        StringBuilder x = new StringBuilder();
        for (Player p: players){
            x.insert(0, p.toString());
        }
        return x.toString();
    }
    /**
     * Simulates the play of the game
     * @return it returns the winner in the form of a Player
     */
    public Player playGame(){
        Player winner = null;
        int controler = 0;
        final int limitWin = 100;
        Die d3 = new Die(players.size());
        d3.roll();
        if (players.size() > 1){
            Collections.swap(players, 0, d3.getSideUp()-1);
        }
        while (controler <= limitWin) {
            for (Player p : players) {
                takeTurn(p);
                System.out.print(this);
                controler = p.getScore();
                if (controler >= limitWin){
                    winner = p;
                    break; //I used break, because I do not know
                    // how to exit the for each loop when the score is reached
                }
            }
        }
        return winner;
    }
    private void takeTurn(Player player){
        boolean controler = false;
        int total = 0;
        while (!controler){
            die.roll();
            total += die.getSideUp();
            if (die.getSideUp() == 1){
                System.out.println(player.getName() + " rolled a " + die.getSideUp());
                System.out.println(player.getName() + " busts");
                controler = true;
            } else {
                System.out.println(player.getName() + " rolled a "+ die.getSideUp());
                controler = player.chooseToHold(total);
                if (controler){
                    System.out.println(player.getName() + " holds");
                }
            }

        }
    }
}