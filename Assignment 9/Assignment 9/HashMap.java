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
    private static class Node<K, V> {
        int hash;
        K key;
        V value;
        Node<K, V> next;

        Node(K k, V v) {
            key = k;
            value = v;
            next = null;
            hash = hash(key);
//            System.out.println("hash is: " + hash);
        }

        private int hash(K k) {
            int hash = k.hashCode();
            hash ^= hash >>> 16; //shift right zero fill
            hash *= 0x85ebca6b;
            hash ^= hash >>> 13;
            hash *= 0xc2b2ae35;
            hash ^= hash >>> 16;
            return hash;
        }
    }

    Node<K, V>[] nodes;
    
    public HashMap() {
        nodes = new Node[512];
        for (int i = 0; i < 512; ++i) {
            nodes[i] = null;
        }
    }
    
    @Override
    public Iterator<K> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void insert(K k, V v) throws IllegalArgumentException {
        //try {
        Node<K, V> n = this.find(k);
        if (n != null) {
            //throw new IllegalArgumentException("Duplicate key " + k);
            n.value = v;
            return;
        }
        n = new Node<K, V>(k, v);
        int hash = hash(k);
        int index = hashIndex(hash);
//        System.out.println("insert index: " + index + ", hash: " + hash);
        if (nodes[index] == null) {
            nodes[index] = n;
//            System.out.println("inserted: " + index);
        } else {
            Node<K, V> curr = nodes[index];
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = n;
//            Node<K, V> tempnext = nodes[index].next;
//            if (tempnext == null) {
//                nodes[index].next = n;
//            } else {
//                while (tempnext != null) {
//                    if (tempnext.next == null) {
//                        tempnext.next = n;
//                    }
//                    tempnext = tempnext.next;
//                }
//            }
        }
        //}
        //catch (NullPointerException e) {
        //    resizeArray(nodes);
        //}
    }

//    private void resizeArray(Node<K, V>[] input) {
//        nodes = new Node[input.length * 2];
////        System.arraycopy(input, 0, nodes, 0, input.length);
//        for (int i = input.length; i < nodes.length; i++) {
//            nodes[i] = null;
//        }
//    }

    private Node<K, V> find(K k) {
        if (k == null) {
            throw new IllegalArgumentException("Null key");
        }
//        Node<K, V> temp = null;
//        Node<K, V> nextnode;
        int hash = hash(k);
        int index = hashIndex(hash);
//        System.out.println("index: " + index + ", hash: " + hash);
        Node<K, V> n = nodes[index];
        while (n != null) {
            if (n.hash == hash) {
//                System.out.println("helllo i found at index: " + index);
                return n;
            }
            n = n.next;
        }
        return null;
//        try {
//            nextnode = (Node<K, V>) nodes[index].next;
//        } catch (NullPointerException e) {
//            nextnode = null;
//        }
//        try {
//            if (nodes[index].hash == hash) {
//                temp = nodes[index];
//            } else {
//                while (nextnode != null) {
//                    if (nextnode.hash == hash) {
//                        temp = nextnode;
//                    }
//                    nextnode = (Node<K, V>) nextnode.next;
//                }
//            }
//        } catch (NullPointerException e) {
//            temp = null;
//        }
//        return (Node<K, V>) temp;
    }

    private Node<K, V> findForSure(K k) {
        Node<K, V> temp = (Node<K, V>) this.find(k);
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
        Node<K, V> temp = this.findForSure(k);
        V v = (V) temp.value;
        temp.hash = 0;
        temp.key = null;
        temp.value = null;
        return v;
    }

    @Override
    public void put(K k, V v) throws IllegalArgumentException {
        Node<K, V> temp = this.findForSure(k);
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
        int i = x % (nodes.length - 1);
        if (i < 0) {
            return nodes.length - 1 + i;
        }
        return i;
    }

    @Override
    public V get(K k) throws IllegalArgumentException {
        Node<K, V> n = this.findForSure(k);
        return (V) n.value;
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
        int counter = 0;
        for (int i = 0; i < nodes.length; i++) {
            if (nodes[i] != null) {
                counter++;
            }
        }
        return counter;
    }

}