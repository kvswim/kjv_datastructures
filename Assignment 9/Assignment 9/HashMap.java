import java.util.Iterator;


/**HashMap.java.
 * Kyle Verdeyen
 * kverdey1@jhu.edu
 * 600.226
 * @author root
 *
 * @param <K> key.
 * @param <V> value.
 */
public class HashMap<K, V> implements Map<K, V> {
    private class Node {
        int hash;
        K key;
        V value;
        Node next;
        Node(K k, V v) {
            key = k;
            value = v;
            next = null;
            hash = hash(k);
        }
    }
    Node[] nodes = (Node[]) new Object[256];
    @Override
    public Iterator<K> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void insert(K k, V v) throws IllegalArgumentException {
        Node n = this.find(k);
        if (n != null) {
            throw new IllegalArgumentException("Duplicate key " + k);
        }
        n = new Node(k, v);
        int index = hashIndex(hash(k));
        if (nodes[index] == null) {
            nodes[index] = n;
        } else {
            Node tempnext = nodes[index].next;
            if (tempnext == null) {
                nodes[index].next = n;
            } else {
                while (tempnext != null) {
                    if (tempnext.next == null) {
                        tempnext.next = n;
                    }
                    tempnext = tempnext.next;
                }
            }
        }
    }

    private Node find(K k) {
        if (k == null) {
            throw new IllegalArgumentException("Null key");
        }
        Node temp = null;
        Node nextnode;
        int hash = hash(k);
        int index = hashIndex(hash);
        nextnode = nodes[index].next;
        if (nodes[index].hash == hash) {
            temp = nodes[index];
        } else while (nextnode != null) {
            if (nextnode.hash == hash) {
                temp = nextnode;
            }
            nextnode = nextnode.next;
        }
        return temp;
    }
    private Node findForSure(K k) {
        Node temp = this.find(k);
        if (temp == null) {
            throw new IllegalArgumentException("Can't find key " + k);
        }
        return temp;
    }

    /**Remove method.
     * Node is only logically nulled as to not disturb the next
     * field.
     * @return v value that was in the key k.
     */
    @Override
    public V remove(K k) throws IllegalArgumentException {
        Node temp = this.findForSure(k);
        V v = temp.value;
        temp.hash = 0;
        temp.key = null;
        temp.value = null;
        return v;
    }

    @Override
    public void put(K k, V v) throws IllegalArgumentException {
        Node temp = this.findForSure(k);
        temp.value = v;
    }

    
    /**Hashing function. Adaptation based on Murmurhash3 (orig. C++).
     * Takes Java's internal hashcode (data into int), then
     * performs bit shifts and byte multiplication to put
     * the given hashcode into a hash with the minimum amount of
     * collisions. Original algorithm pre-hashes the input
     * string byte by byte, but ain't nobody got time for that.
     * @param k key given.
     * @return x int form of final hash code.
     */
    private int hash(K k) {
        int hash = k.hashCode();
        hash ^= hash >>> 16; //shift right zero fill
        hash *= 0x85ebca6b;
        hash ^= hash >>> 13;
        hash *= 0xc2b2ae35;
        hash ^= hash >>> 16;
        return hash;
    }
    
    private int hashIndex(int x) {
        return x & (Integer.MAX_VALUE - 1);
    }
    @Override
    public V get(K k) throws IllegalArgumentException {
        Node n = this.findForSure(k);
        return n.value;
    }

    @Override
    public boolean has(K k) {
        if (k == null) {
            return false;
        }
        return this.find(k) != null;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

}
