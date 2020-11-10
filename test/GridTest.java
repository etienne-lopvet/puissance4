import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class GridTest extends TestCase {

    Grid grid;

    @Before
    public void init() {
        grid = new Grid();
    }

    @Test
    public void testNewGridIsEmpty() {
        String testGrid =
                ". . . . . . . .\n" +
                ". . . . . . . .\n" +
                ". . . . . . . .\n" +
                ". . . . . . . .\n" +
                ". . . . . . . .\n" +
                ". . . . . . . .\n";

        assertEquals(testGrid, grid);
    }

}
