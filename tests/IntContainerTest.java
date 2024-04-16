import IntContainer.IntContainer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntContainerTest {

    private IntContainer container;

    @BeforeEach
    public void setUp() {
        container = new IntContainer();
    }

    @Test
    public void testAddElementAndGetElement() {
        container.addElement(5);
        container.addElement(10);
        container.addElement(15);

        assertEquals(5, container.getElementFromIndex(0));
        assertEquals(10, container.getElementFromIndex(1));
        assertEquals(15, container.getElementFromIndex(2));
    }

    @Test
    public void testRemoveElement() {
        container.addElement(5);
        container.addElement(10);
        container.addElement(15);

        container.removeElementFromIndex(1);

        assertEquals(2, container.getSize());
        assertEquals(5, container.getElementFromIndex(0));
        assertEquals(15, container.getElementFromIndex(1));
    }

    @Test
    public void testAddElementWithNegativeCapacity() {
        assertThrows(IllegalArgumentException.class, () -> {
            IntContainer container = new IntContainer(-1);
        });
    }
}
