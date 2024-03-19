package IntContainer;

public class IntContainer {
    private int[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public IntContainer() {
        array = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            int[] newArray = new int[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    public void add(int number) {
        ensureCapacity();
        array[size++] = number;
    }
}