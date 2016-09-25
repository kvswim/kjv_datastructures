/**.
 * Kyle Verdeyen
 * kverdey1@jhu.edu
 * Assignment 3
 * StatableArray.java
 *
 *
 * @param <T>
 */
public class StatableArray<T> extends SimpleArray<T> implements Statable {


    int reads;
    int writes;

    /**
        Constructs a new StatableArray.

        @param n Length of array, must be n &gt; 0.
        @param t Default value to store in each slot.
        @throws LengthException if n &le; 0.
    */
    public StatableArray(int n, T t) {
        super(n, t);
    }

    @Override
    public T get(int i) throws IndexException {
        reads++;
        return super.get(i);
    }

    @Override
    public void put(int i, T t) throws IndexException {
        writes++;
        super.put(i, t);
    }

    @Override
    public int length() {
        reads++;
        return super.length();
    }

    @Override
    public void resetStatistics() {
        // TODO Auto-generated method stub
        reads = 0;
        writes = 0;
    }

    @Override
    public int numberOfReads() {
        // TODO Auto-generated method stub
        return reads;
    }

    @Override
    public int numberOfWrites() {
        // TODO Auto-generated method stub
        return writes;
    }

    /**.
     * blank main
     * @param args
     */
    public static void main(String[] args){

    }
}
