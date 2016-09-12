/*Kyle Verdeyen
 * kverdey1@jhu.edu
 * Data Structures
 * BasicCounter.java
 * Assignment 1
 */
public class BasicCounter implements ResetableCounter {
    int value;

    public int value() {

        return this.value;
    }

    public void up() {

        ++this.value;
    }

    public void down() {

        --this.value;
    }

    public void reset() {

        this.value = 0;
    }


    public static void main(String[] args) {

    }

}
