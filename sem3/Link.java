

public class Link {

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

    }

    private Node head;

    public void add(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node last = findLast();
            last.next = new Node(value);
        }
    }

    private Node findLast() {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            result.append(current.value).append(" -> ");
            current = current.next;
        }
        int lenght = result.length();
        if (lenght > 4) {
            result.delete(lenght - 4, lenght);
        }
        result.append("]");
        return result.toString();
    };
}
