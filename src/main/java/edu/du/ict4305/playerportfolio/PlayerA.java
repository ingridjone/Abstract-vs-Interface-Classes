package edu.du.ict4305.playerportfolio;

/**
 *
 * @author Ingrid
 */
abstract class PlayerA {
    
    public String name;
    public int gamesPlayed;
    public String sport;
    
    public String getNameA() {
        return name;
    }

    abstract int getStatsA();
    abstract String getSportA();
}
