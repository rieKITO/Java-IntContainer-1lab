import IntContainer.IntContainer;

public class Main {
    public static void main(String[] args) {
        IntContainer container = new IntContainer();

        // adding elements
        container.addElement(5);
        container.addElement(100);
        container.addElement(2);

        container.printElements();
        System.out.println("Container size: " + container.getSize());

        System.out.println("--------------------------");

        // get element
        System.out.println(container.getElementFromIndex(2));
        System.out.println(container.getElementFromIndex(0));

        System.out.println("--------------------------");

        // element removal
        container.removeElementFromIndex(0);
        container.removeElementFromIndex(1);

        container.printElements();
        System.out.println("Container size: " + container.getSize());
    }
}