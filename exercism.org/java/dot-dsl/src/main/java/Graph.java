import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;


public class Graph {
    private final ArrayList<Node>     n = new ArrayList<>();
    private final ArrayList<Edge>     e = new ArrayList<>();
    private final Map<String, String> a;

    public Graph() {
        a = Collections.emptyMap();
    }

    public Graph(Map<String, String> attributes) {
        a = Map.copyOf(attributes);
    }

    public Collection<Node> getNodes()         {return n;}

    public Collection<Edge> getEdges()         {return e;}

    public Map<String, String> getAttributes() {return a;}

    public Graph node(String name) {
        n.add(new Node(name));
        return this;
    }

    public Graph node(String name, Map<String, String> attributes) {
        n.add(new Node(name, attributes));
        return this;
    }

    public Graph edge(String start, String end) {
        e.add(new Edge(start, end));
        return this;
    }

    public Graph edge(String start, String end, Map<String, String> attributes) {
        e.add(new Edge(start, end, attributes));
        return this;
    }
}
