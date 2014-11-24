import org.junit.Assert;
import org.junit.Test;
/**
 * Added some basic unit tests.
 * Created by zak on 11/24/14.
 */
public class ReverserTest {
    /**
     * Tests an even number of chars
     * @throws Exception
     */
    @Test
    public void testEven() throws Exception {
        char[] testString = "1234".toCharArray();
        Main.reverse(testString);
        Assert.assertEquals("4321", new String(testString));
    }

    /**
     * Tests odd number of chars
     * @throws Exception
     */
    @Test
    public void testOdd() throws Exception {
        char[] testString = "12345".toCharArray();
        Main.reverse(testString);
        Assert.assertEquals("54321", new String(testString));
    }

    /**
     * Tests a two char scenario. This test is important because if you calculate the incorrect number of flips,
     * there could be a double flip here, meaning the string is reversed, then reversed again (so nothing changes).
     * @throws Exception
     */
    @Test
    public void testTwo() throws Exception {
        char[] testString = "12".toCharArray();
        Main.reverse(testString);
        Assert.assertEquals("21", new String(testString));
    }

    /**
     * Tests a 3 char scenario.
     * @throws Exception
     */
    @Test
    public void testThree() throws Exception {
        char[] testString = "abc".toCharArray();
        Main.reverse(testString);
        Assert.assertEquals("cba", new String(testString));
    }

    /**
     * Tests a large, odd character-counted string.
     * @throws Exception
     */
    @Test
    public void testLargeOdd() throws Exception {
        char[] testString = "abcdefghijklmnopqrstuvwxy".toCharArray();
        Main.reverse(testString);
        Assert.assertEquals("yxwvutsrqponmlkjihgfedcba", new String(testString));
    }

    /**
     * Tests a large, even character-counted string.
     * @throws Exception
     */
    @Test
    public void testLargeEven() throws Exception {
        char[] testString = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Main.reverse(testString);
        Assert.assertEquals("zyxwvutsrqponmlkjihgfedcba", new String(testString));
    }

    /**
     * Tests a single char string.
     * @throws Exception
     */
    @Test
    public void testOne() throws Exception {
        char[] testString = "1".toCharArray();
        Main.reverse(testString);
        Assert.assertEquals("1", new String(testString));
    }


}
