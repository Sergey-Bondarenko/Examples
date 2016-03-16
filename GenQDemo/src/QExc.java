/**
 * Created by Admin on 06.04.2015.
 */
class QueueFullException extends Exception {
    int size;

    QueueFullException(int s) { size = s; }

    public String toString() {
        return "\nQueue is full. Maximus size is " + size;
    }
}

class QueueEmptyException extends Exception {

    public String toString() {
        return "\nQueue is empty.";
    }
}