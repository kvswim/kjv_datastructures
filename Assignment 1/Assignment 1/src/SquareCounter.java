/*Kyle Verdeyen
 * kverdey1@jhu.edu
 * Data Structures
 * SquareCounter.java
 * Assignment 1
 */
public class SquareCounter implements ResetableCounter {
    int value = 2;

    public int value() {

        return this.value;
    }

    public void up() {

        this.value = (int) (Math.pow(this.value, 2));
    }

    public void down() {

        this.value = (int) (Math.sqrt(this.value));
    }

    public void reset() {

        this.value = 2;
    }


    public static void main(String[] args) {


    }

}
