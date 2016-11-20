/**HashMapTestBase.java.
 * Helper file for MapTestBase.
 * Generates a new HashMap for testing.
 * @author root
 *
 */
public class HashMapTestBase extends MapTestBase {
    @Override
    protected HashMap<String, Integer> createMap() {
        return new HashMap<>();
    }
}
