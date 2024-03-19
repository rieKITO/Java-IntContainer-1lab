package IntContainer;

public class IntContainer {
    private int[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public IntContainer() {
        array = new int[DEFAULT_CAPACITY];
        size = 0;
    }

}