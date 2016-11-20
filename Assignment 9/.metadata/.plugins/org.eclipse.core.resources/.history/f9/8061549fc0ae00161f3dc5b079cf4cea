import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**MapTestBase.java
 * Base JUnit4 tester for HashMap
 * and SimpleMap.
 * @author root
 *
 */
public abstract class MapTestBase {
    private Map<String, Integer> map;

    /**Shut up checkstyle.
     * @return nothin.
     */
    protected abstract Map<String, Integer> createMap();

    /**Method to create a new map.
     * Can be SimpleMap or HashMap.
     */
    @Before
    public void setupMap() {
        map = this.createMap();
    }

    /**Tests that the initial length is zero.
     *
     */
    @Test
    public void testInitialLength() {
        assertEquals(0, map.size());
    }

    /**Tests a series of inserts into the map.
     *
     */
    @Test
    public void testInsert() {
        for (int i = 0; i < 10; i++) {
            map.insert(Integer.toString(i), 1);
        }
        map.get(Integer.toString(1));
        //System.out.println(map.toString());
        assertEquals(10, map.size());
    }

    /**Tests that a get for an invalid key throws an exception.
     *(testing FindForSure) and by extension a bad put.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testBadGet() {
        for (int i = 0; i < 10; i++) {
            map.insert(Integer.toString(i), 1);
        }
        map.get("This should be illegal!");
    }

    @Test
    public void testPut() {
        for (int i = 1; i < 10; i++) {
            map.insert(Integer.toString(i), 1);
        }
        for (int i = 1; i < 10; i++) {
            map.put(Integer.toString(i), 2);
        }
        int test = map.get(Integer.toString(1));
        assertEquals(test, 2);
    }

}