package edu.du.ict4305.playerportfolio;

/**
 *
 * @author Ingrid
 */
public class NBAPlayerI implements Player {
    //Declaring the player's variables
    String name = "Pau Gasol";
    int gamesPlayed = 1226;
    String sport = "NBA";
    
    //Giving each method a body
    public String getName() {
        return name;
    }

    public int getStats() {
        return gamesPlayed;
    }

    public String getSport() {
        return sport;
    }
}
