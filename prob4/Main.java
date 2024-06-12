package prob4;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        System.out.println(list);
        //Test method 1
        list.addLast("Carol");
        System.out.println(list);

        //Test method 2
        System.out.println(list.remove("Harry"));
        System.out.println(list);
        System.out.println(list.remove("Harry"));
        System.out.println(list);
        System.out.println(list.removeFirst());
        System.out.println(list);
        list.printReverse();

    }
}
