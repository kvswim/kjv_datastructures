import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**MapTestBase.java
 * Base JUnit tester for HashMap
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

    /**
     * 
     */
    @Before
    public void setupMap() {
        map = this.createMap();
    }

    /**
     * 
     */
    @Test
    public void testInitialLength() {
        assertEquals(0, map.size());
    }

    /**
     * 
     */
    @Test
    public void testInsert() {
        map.insert("HashMap", 1);
        int result = map.get("HashMap");
        assertEquals(1, result);
        /*for(int i = 0; i < 20; i++) {
            map.insert(Integer.toString(i), 1);
        }*/ map.insert("Hashmap2", 1);
        map.insert("Hashmap3", 1);
        map.insert("Hashmap4", 1);
        map.insert("Hashmap5", 1);
        map.insert("hashmap6", 1);
        System.out.println(map.size());
    }

    /**
     * 
     */
    @Test
    public void test() {
    }
}