package edu.du.ict4305.playerportfolio;

/**
 *
 * @author Ingrid
 */
public class NFLPlayerI implements Player {
    //Declaring the player's variables
    String name = "Patrick Mahomes";
    int gamesPlayed = 63;
    String sport = "NFL";

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
