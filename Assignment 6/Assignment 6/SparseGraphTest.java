
/**SparseGraphTest.
 * Helper class for GraphTestBase.
 * @author root
 *
 */
public class SparseGraphTest extends GraphTestBase {

    @Override
    protected SparseGraph<String, String> createGraph() {
        return new SparseGraph<>();
    }
}
