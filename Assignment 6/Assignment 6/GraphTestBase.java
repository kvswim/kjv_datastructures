import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
//import java.util.List;

import org.junit.Before;
import org.junit.Test;



/**Kyle Verdeyen
 * kverdey1@jhu.edu
 * JUnit test suite for SparseGraph.
 * @author root
 *
 */
public abstract class GraphTestBase {
    private Graph<String, String> graph;

    /**Shut your mouth checkstyle, no one likes you.
     * @return nothing.
     */
    protected abstract Graph<String, String> createGraph();

    /**Sets up graph.
     *
     */
    @Before
    public void setupGraph() {
        graph = this.createGraph();
    }

    /**Tests an empty graph.
     *
     */
    @Test
    public void newGraphEmpty() {
        ArrayList<String> list = new ArrayList<String>();
        assertEquals(list, graph.vertices());
        assertEquals(list, graph.edges());
    }

    /**Tests whether insertion of a vertex works.
     *
     */
    @Test
    public void insertVertexWorks() {
        graph.insert("Inserted!");
        String stringtest = "digraph {\n  \"Inserted!\";\n}";
        assertEquals(stringtest, graph.toString());
    }

    /**Tests toString.
     *
     */
    @Test
    public void toStringWorks() {
        graph.insert("Insertion I");
        graph.insert("Insertion II");
        String stringtest =
                ("digraph {\n  \"Insertion I\";\n  \"Insertion II\";\n}");
        assertEquals(stringtest, graph.toString());
    }

    /**Tests remove.
     *
     */
    @Test
    public void removeWorks() {
        graph.insert("Insertion");
        //To be honest I have no idea how to use remove.
    }

    /**Tests from and to.
     *
     */
    @Test
    public void fromToWorks() {
        //i feel like my skull is on fire
    }
}