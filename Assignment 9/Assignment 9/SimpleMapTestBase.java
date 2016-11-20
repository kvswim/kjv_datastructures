/**SimpleMapTestBase.java.
 * Helper file for MapTestBase.java.
 * Generates a new SimpleMap for testing.
 * @author root
 *
 */
public class SimpleMapTestBase extends MapTestBase {
    @Override
    protected SimpleMap<String, Integer> createMap() {
        return new SimpleMap<>();
    }
}