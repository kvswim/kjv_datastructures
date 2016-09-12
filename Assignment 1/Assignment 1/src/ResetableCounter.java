/*Kyle Verdeyen
 * kverdey1@jhu.edu
 * Data Structures
 * ResetableCounter.java
 * Assignment 1
 */
public interface ResetableCounter extends Counter {
    int value();

    void up();

    void down();

    void reset();

}
