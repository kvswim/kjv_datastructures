/*Kyle Verdeyen
 * kverdey1@jhu.edu
 * Data Structures
 * Unique.java
 * Assignment 1
 */
public class Unique {
    public static void main(String[] args) {
        int iInput[] = new int[args.length];
        boolean[] bSeen = new boolean[args.length];
        for (int i = 0; i < args.length; i++) {
            iInput[i] = Integer.parseInt(args[i]);
            bSeen[i] = true;
            for (int j = 0; j < args.length; j++) {
                if (iInput[i] == iInput[j] && i != j) {
                    bSeen[i] = false;
                }
            }
        }
        for (int i = 0; i < args.length; i++) {
            if (bSeen[i]) {
                System.out.println(iInput[i]);
            }
        }
    }
}