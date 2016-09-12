/*Kyle Verdeyen
 * kverdey1@jhu.edu
 * Data Structures
 * Counter.java
 * Assignment 1
 */
/** The essence of any counter. */
public interface Counter {
    /** Current value of this counter. */

    int value();
    /** Increment this counter. */

    void up();
    /** Decrement this counter. */

    void down();
}
