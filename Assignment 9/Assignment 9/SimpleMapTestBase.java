/**
 * @author root
 *
 */
public class SimpleMapTestBase extends MapTestBase {
    @Override
    protected SimpleMap<String, Integer> createMap() {
        return new SimpleMap<>();
    }
}