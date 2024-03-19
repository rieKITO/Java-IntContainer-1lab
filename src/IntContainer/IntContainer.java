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

    public void addElement(int number) {
        ensureCapacity();
        array[size++] = number;
    }

    public void removeElementFromIndex(int elementIndex) {
        if (elementIndex < 0 || elementIndex >= size)
            throw new IndexOutOfBoundsException("Index: " + elementIndex + ", Size: " + size);
        for (int index = elementIndex; index < size - 1; ++index)
            array[index] = array[index + 1];
        --size;
    }

    public int getElementFromIndex(int elementIndex) {
        if (elementIndex < 0 || elementIndex >= size)
            throw new IndexOutOfBoundsException("Index: " + elementIndex + ", Size: " + size);
        return array[elementIndex];
    }
}