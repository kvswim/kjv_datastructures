import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public abstract class GraphTestBase {
    private Graph<String, String> graph;
    protected abstract Graph<String, String> createGraph();
    @Before
    public void setupGraph() {
        graph = this.createGraph();
    }
    
    @Test
    public void newGraphEmpty() {
        ArrayList<String> list = new ArrayList<String>();
        assertEquals(list, graph.vertices());
        assertEquals(list, graph.edges());
    }
    
    @Test
    public void insertVertexWorks() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Inserted!");
        graph.insert("Inserted!");
        System.out.println(graph.toString());
        assertEquals("digraph {\n \"Inserted!\";\n}", graph.toString());
    }
}