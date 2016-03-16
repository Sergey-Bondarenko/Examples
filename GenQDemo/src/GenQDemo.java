/**
 * Created by Admin on 06.04.2015.
 */
class GenQDemo {
    public static void main(String[] args) {
        Integer iStore[] = new Integer[10];
        GenQueue<Integer> q = new GenQueue<>(iStore);

        Integer iVal;

        System.out.println("Demonstrate a queue of Integers.");

        try {
            for (int i=0; i < 5; i++) {
                System.out.println("Adding " + i + " to the q.");
                q.put(i);
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (int i=0; i < 5; i++) {
                System.out.println("Getting next Integer from q: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println();

        Double dStore[] = new Double[10];
        GenQueue<Double> q2 = new GenQueue<>(dStore);

        Double dVal;

        System.out.println("Demontrate a queue of Double.");
        try {
            for (int i=0; i < 5; i++) {
                System.out.println("Adding " + (double)i/2 + " to the q2.");
                q2.put((double) i / 2);
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (int i=0; i < 5; i++) {
                System.out.println("Getting next Double from q2: ");
                dVal = q2.get();
                System.out.println(dVal);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}
