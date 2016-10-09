/**Instantiate SentinelList to test.
 * @author root
 *
 */
public class SentinelListTest extends ListTestBase {

    @Override
    protected List<String> createList() {
        return new SentinelList<>();
    }
}