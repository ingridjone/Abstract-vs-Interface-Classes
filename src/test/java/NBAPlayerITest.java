import edu.du.ict4305.playerportfolio.NBAPlayerI;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ingrid
 */
public class NBAPlayerITest {
    
    @Test
    public void test() {
        
        NBAPlayerI nba = new NBAPlayerI();
        
        String expected = "Pau Gasol is a NBA player that has contributed to 1226 games in his career.";
        String actual = nba.getName()+" is a "+nba.getSport()+" player that has contributed to "+nba.getStats()+" games in his career.";
        assertEquals(expected, actual);
        
        System.out.println(expected);
        System.out.println(actual);
    }
}
