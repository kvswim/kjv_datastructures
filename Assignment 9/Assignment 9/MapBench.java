import java.util.Random;
import com.github.phf.jb.Bench;
import com.github.phf.jb.Bee;

/**MapBench.java.
 * Jaybee testing for HashMap.
 * @author root
 *
 */
public final class MapBench {
    private static final int SIZE = 100;
    private static final Random RAND = new Random();

    private MapBench(){}

    private static void insertLinear(Map<Integer, Integer> m) {
        for (int i = 0; i < SIZE; i++) {
            if (m.has(i)) {
                m.put(i, m.get(i) + 1);
            } else {
                m.insert(i, 1);
            }
        }
    }

    private static void insertRandom(Map<Integer, Integer> m) {
        int temp;
        for (int i = 0; i < SIZE; i++) {
            temp = RAND.nextInt(SIZE * 4);
            if (m.has(temp)) {
                m.put(temp, m.get(temp) + 1);
            } else {
                m.insert(temp, 1);
            }
        }
    }

    private static void removeLinear(Map<Integer, Integer> m) {
        for (int i = 0; i < SIZE; i++) {
            if (m.has(i)) {
                m.remove(i);
            }
        }
    }

    private static void removeRandom(Map<Integer, Integer> m) {
        int temp;
        for (int i = 0; i < SIZE; i++) {
            temp = RAND.nextInt(SIZE * 4);
            if (m.has(temp)) {
                m.remove(temp);
            }
        }
    }

    private static void lookupLinear(Map<Integer, Integer> m) {
        boolean temp = false;
        for (int i = 0; i < SIZE; i++) {
            temp = m.has(i);
        }
        if (temp) {
            System.out.print("");
        }
    }

    private static void lookupRandom(Map<Integer, Integer> m) {
        boolean temp = false;
        int temp2;
        for (int i = 0; i < SIZE; i++) {
            temp2 = RAND.nextInt(SIZE * 4);
            temp = m.has(temp2);
        }
        if (temp) {
            System.out.print("");
        }
    }

    /**
     * @param b
     */
    public static void insertLinearHM(Bee b) {
        for (int n = 0; n < b.reps(); n++) {
            b.stop();
            Map<Integer, Integer> m =
                new HashMap<Integer, Integer>();
            b.start();
            insertLinear(m);
        }
    }

    public static void insertRandomHM(Bee b) {
        for (int n = 0; n < b.reps(); n++) {
            b.stop();
            Map<Integer, Integer> m =
                new HashMap<Integer, Integer>();
            b.start();
            insertRandom(m);
        }
    }

    
}
