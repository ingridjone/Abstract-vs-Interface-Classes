import edu.du.ict4305.playerportfolio.NFLPlayerI;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ingrid
 */
public class NFLPlayerITest {
    
    @Test
    public void test() {
        
        NFLPlayerI nfl = new NFLPlayerI();
        
        String expected = "Patrick Mahomes is a NFL player that has contributed to 63 games in his career.";
        String actual = nfl.getName()+" is a "+nfl.getSport()+" player that has contributed to "+nfl.getStats()+" games in his career.";
        assertEquals(expected, actual);
        
        System.out.println(expected);
        System.out.println(actual);
    }
}
