/**
 * Created by Admin on 06.04.2015.
 */
public interface IGenQ<T> {
    void put(T ch) throws QueueFullException;

    T get() throws QueueEmptyException;
}
