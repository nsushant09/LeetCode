package linkedList;

public class SinglyMain {
    public static void main(String[] args) {

        SinglyLL list = new SinglyLL();
//        list.addNodeAtZero(3);
//        list.addNodeAtZero(2);
//        list.addNodeAtZero(17);
//        list.addNodeAtZero(8);

        list.addNodeAtLast(3);
        list.addNodeAtLast(12);
        list.addNodeAtLast(17);
        list.addNodeAtLast(22);
        list.addNodeAtIndex(2, 100);

        list.deleteAtIndex(2);
        list.display();

    }
}
