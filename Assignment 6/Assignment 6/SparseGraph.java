
public class SparseGraph<V, E> implements Graph<V, E> {

    @Override
    public Vertex<V> insert(V v) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Edge<E> insert(Vertex<V> from, Vertex<V> to, E e)
            throws PositionException, InsertionException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public V remove(Vertex<V> v) throws PositionException, RemovalException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E remove(Edge<E> e) throws PositionException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterable<Vertex<V>> vertices() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterable<Edge<E>> edges() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterable<Edge<E>> outgoing(Vertex<V> v) throws PositionException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterable<Edge<E>> incoming(Vertex<V> v) throws PositionException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Vertex<V> from(Edge<E> e) throws PositionException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Vertex<V> to(Edge<E> e) throws PositionException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void label(Vertex<V> v, Object l) throws PositionException {
        // TODO Auto-generated method stub

    }

    @Override
    public void label(Edge<E> e, Object l) throws PositionException {
        // TODO Auto-generated method stub

    }

    @Override
    public Object label(Vertex<V> v) throws PositionException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object label(Edge<E> e) throws PositionException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void clearLabels() {
        // TODO Auto-generated method stub

    }

}
