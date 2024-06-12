package prob4;

public class DoublyLinkedList {

    Node header;

    DoublyLinkedList() {
        header = new Node();
    }

    //1. adds to the end of the list
    public void addLast(String item) {
        Node current = header;

        while (current.next != null) {
            current = current.next;
        }

        Node newNode = new Node();
        newNode.value = item;

        current.next = newNode;
        newNode.previous = current;

    }

    // 2. Remove by passing object
    public boolean remove(String item) {
        if (header.next == null) return false;

        Node current = header.next;

        while (current != null) {
            if (item.equals(current.value)) { // avoid NPE by reversing the comparison
                if (current.next != null) {
                    current.next.previous = current.previous;
                }
                current.previous.next = current.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // 3. Remove the First Node

    public boolean removeFirst() {

        if (header.next == null) return false; // list is empty

        Node firstNode = header.next;
        header.next = firstNode.next;

        if (firstNode.next != null) {
            firstNode.next.previous = header;
        }

        return true;
    }


    // 4. Prints the list from last to first
    public void printReverse() {
        if (header.next == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = header.next;

        while (current.next != null) {
            current = current.next;
        }

        while (current != header) {
            System.out.print(current.value + " ");
            current = current.previous;
        }
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();

    }

    private void toString(StringBuilder sb, Node n) {
        if (n == null) return;
        if (n.value != null) sb.append(n.value + " ");
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;

        public String toString() {
            return value == null ? "null" : value;
        }
    }
}
