import java.util.Arrays;
import java.util.Iterator;

public class ArrayListGB<I> implements ListGB<I> {
    private I[] values;

    @SuppressWarnings("unchecked")
    public ArrayListGB() {
        this.values = (I[]) new Object[0];
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean add(I i) {
        try {
            I[] temp = values;
            values = (I[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = i;
            return true;
        } catch (ClassCastException e) {
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public void remove(int index) {
        try {
            I[] temp = values;
            values = (I[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElemAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index+1, values, index, amountElemAfterIndex);
        } catch (ClassCastException e) {
            throw new RuntimeException();
        }
    }

    @Override
    public I get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, I i) {
        values[index] = i;
    }

    @Override
    public Iterator<I> iterator() {
        return new ArrayIterator<I>(values);
    }

    @Override
    public String toString() {
        return "ArrayListGB{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}
