import edu.du.ict4305.playerportfolio.NFLPlayerA;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ingrid
 */
public class NFLPlayerATest {
    
    @Test
    public void test() {
        
        NFLPlayerA nfl = new NFLPlayerA();
        
        String expected = "Patrick Mahomes is a NFL player that has contributed to 63 games in his career.";
        String actual = nfl.getNameA()+" is a "+nfl.getSportA()+" player that has contributed to "+nfl.getStatsA()+" games in his career.";
        assertEquals(expected, actual);
        
        System.out.println(expected);
        System.out.println(actual);
        
    }
}
