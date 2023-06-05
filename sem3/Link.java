
public class Link {
    public Node head;
    public Node tail;

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

    }

    public int get(int index) {

        if (head == null || index < 0) {
            throw new IndexOutOfBoundsException(index);
        }

        Node current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        if (currentIndex == index) {
            return current.value;
        }
        throw new IndexOutOfBoundsException(index);
    }

    public int getFirst() {
        return get(0);
    }

    public Node findLast() {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    public int pop(int index) {
        if (head == null || index < 0) {
            throw new IndexOutOfBoundsException(index);
        }
        if (index == 0) {
            int pop = head.value;
            head = head.next;
            return pop;
        }

        Node prev = head;
        int currentIndex = 1;
        while (prev.next != null) {
            if (currentIndex == index) {
                int pop = prev.next.value;
                prev.next = prev.next.next;
                return pop;
            }

            prev = prev.next;
            currentIndex++;
        }
        throw new IndexOutOfBoundsException(index);
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

    public int getSize() {
        int count = 0;
        if (head == null) {
            System.out.println("Список пуст");
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    public boolean contains(int value) {
        if (head == null) {
            System.out.println("Список пуст");
        }
        Node current = head;
        while (current.next != null) {
            if (current.value == value) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    public void reversed() {
        Link myLink = new Link();
        tail = head;
        Node current = head.next;
        head.next = null;
        while (current != null) {
            Node next = current.next;
            current.next = head;
            head = current;
            current = next;
        }
    }

    public void add(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node last = findLast();
            last.next = new Node(value);
        }
    }
}
