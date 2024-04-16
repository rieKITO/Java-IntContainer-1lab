import IntContainer.IntContainer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntContainerTest {
    @Test
    public void testAddElementAndGetElement() {
        IntContainer container = new IntContainer();
        container.addElement(5);
        container.addElement(10);
        container.addElement(15);

        assertEquals(5, container.getElementFromIndex(0));
        assertEquals(10, container.getElementFromIndex(1));
        assertEquals(15, container.getElementFromIndex(2));
    }
}
