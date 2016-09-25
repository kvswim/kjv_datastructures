/**.
 * Kyle Verdeyen
 * kverdey1@jhu.edu
 * Assignment 3
 * StatableArrayTest.java
 *
 *  Junit testing for StatableArray
 *
 */
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


/**
 * Tester for StatableArray.
 *
 */
public class StatableArrayTest {
    static StatableArray testarray;

    /**
     * Setup for Stateable array, new array of size 5.
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        testarray = new StatableArray(5, "Et es verking!");
    }

    /**
     * test number of reads. perform 4 operations that
     * increase the reads int, then test that the int is 4.
    */
    @Test
    public void testNumberOfReads() {
        testarray.length();
        testarray.get(1);
        testarray.get(2);
        testarray.get(3);
        assertEquals(4, testarray.numberOfReads());
    }

    /**
     * test number of writes. perform 2 operations that
     * increase the writes int, then test the int is 2.
     */
    @Test
    public void testNumberOfWrites() {
        testarray.put(4, "Slot changed");
        testarray.put(3, "slot changed");
        assertEquals(2, testarray.numberOfWrites());
    }

    /**
     * test reset of statistics, ensure that both reads and writes are 0.
     */
    @Test
    public void testResetStatistics() {
        testarray.resetStatistics();
        assertEquals(0, testarray.numberOfWrites());
        assertEquals(0, testarray.numberOfReads());
    }

}
