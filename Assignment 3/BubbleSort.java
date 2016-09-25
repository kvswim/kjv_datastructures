/**.
 * Kyle Verdeyen
 * kverdey1@jhu.edu
 * Assignment 3
 * BubbleSort.java
 *
 *
 * @param <T>
 */
public final class BubbleSort<T extends Comparable<T>> implements SortingAlgorithm<T> {

    /** nothing to do in main.
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    private boolean less(T a, T b) {
        return a.compareTo(b) < 0;
    }

    private void swap(Array<T> a, int i, int j) {
        T t = a.get(i);
        a.put(i, a.get(j));
        a.put(j, t);
    }

    @Override
    public void sort(Array<T> array) {
        // TODO Auto-generated method stub
        boolean changed;
        //prevents needlessly incrementing reads for Statablearray
        int length = array.length() - 1;
        for (int i = 0; i < length; i++) {
            changed = false;
            for (int j = 0; j < length; j++) {
                if (!less(array.get(j), array.get(j + 1))) {
                    swap(array, j, j + 1);
                    changed = true;
                }
            }
            //we need to check if the array hasn't been changed
            //(as in it was in order) so we can break out
            if (!changed) {
                break;
            }
        }
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        return "BubbleSort";
    }

}
