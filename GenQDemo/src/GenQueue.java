/**
 * Created by Admin on 06.04.2015.
 */
class GenQueue<T> implements IGenQ<T> {
    private T q[];
    private int putloc, getloc;

    public GenQueue(T[] aRef) {
        q = aRef;
        putloc = getloc = 0;
    }

    public void put(T obj) throws QueueFullException {
        if (putloc==q.length-1)
            throw new QueueFullException(q.length-1);

        putloc++;
        q[putloc] = obj;
    }

    public T get() throws QueueEmptyException {

        if(getloc == putloc)
            throw new QueueEmptyException();

        getloc++;
        return q[getloc];
    }
}
