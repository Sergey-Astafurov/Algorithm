
public class Task {
    public static void main(String[] args) {

        Link myLinkedList = new Link();
        System.out.println(myLinkedList);
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        // System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList);

    }
}

// public class Link {

//     private class Node {
//         int value;
//         Node next;

//         Node(int value) {
//             this.value = value;
//         }

//     }

//     private Node head;

//     public void add(int value) {
//         if (head == null) {
//             head = new Node(value);
//         } else {
//             Node last = findLast();
//             last.next = new Node(value);
//         }
//     }

//     public int getFirst() {
//         return get(0);
//     }

//     public int get(int index) {
//         if (head == null || index < 0) {
//             throw new IndexOutOfBoundsException(index);
//         }

//         Node current = head;
//         int currentIndex = 0;

//         while (current != null && currentIndex < index) {
//             current = current.next;
//             currentIndex++;
//         }
//         if (currentIndex == index) {
//             return current.value;
//         }
//         throw new IndexOutOfBoundsException(index);
//     }

//     public int pop(int index) {
//         if (head == null || index < 0) {
//             throw new IndexOutOfBoundsException(index);
//         }
//         if (index == 0) {
//             int pop = head;
//             head = head.next;
//             return pop;
//         }

//         Node prev = head;
//         int currentIndex = 1;
//     }

//     private Node findLast() {
//         Node current = head;
//         while (current.next != null) {
//             current = current.next;
//         }
//         return current;
//     }

//     public String toString() {
//         StringBuilder result = new StringBuilder("[");
//         Node current = head;
//         while (current != null) {
//             result.append(current.value).append(" -> ");
//             current = current.next;
//         }
//         int lenght = result.length();
//         if (lenght > 4) {
//             result.delete(lenght - 4, lenght);
//         }
//         result.append("]");
//         return result.toString();
//     };
// }
