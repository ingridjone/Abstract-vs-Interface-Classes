import edu.du.ict4305.playerportfolio.NBAPlayerA;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ingrid
 */
public class NBAPlayerATest {
    
    @Test
    public void test() {
        
        NBAPlayerA nba = new NBAPlayerA();
        
        String expected = "Pau Gasol is a NBA player that has contributed to 1226 games in his career.";
        String actual = nba.getNameA()+" is a "+nba.getSportA()+" player that has contributed to "+nba.getStatsA()+" games in his career.";
        assertEquals(expected, actual);
        
        System.out.println(expected);
        System.out.println(actual);
    }
}
