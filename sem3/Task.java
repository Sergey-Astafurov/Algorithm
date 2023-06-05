
public class Task {
    public static void main(String[] args) {

        Link myLinkedList = new Link();
        System.out.println(myLinkedList);
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.contains(0));

        myLinkedList.reversed();
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));


    }
}

