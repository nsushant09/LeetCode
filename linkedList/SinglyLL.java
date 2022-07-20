package linkedList;

public class SinglyLL {

    private Node head;
    private Node tail;
    private int size;

    public SinglyLL() {
        this.size = 0;
    }

    //head and tail is null rn
    // and the list is empty
    // inserting first item to the list


    void setHead(Node head){
        this.head = head;
    }

    void setTail(Node tail){
        this.tail = tail;
    }


    int size(){
        return this.size;
    }

    void addNodeAtZero(int val){
        Node node = new Node(val);
        node.setNext(head);
        this.head = node;
        size++;

        if(tail == null){
            this.tail = this.head;
        }
    }

    void deleteAtZero(){
        this.head = this.head.next;
        if(head == null){
            tail = null;
        }
        size--;
    }

    void deleteAtLast(){
        if(size <= 1){
            deleteAtZero();
            return;
        }
        Node secondLast = get(size - 2);
        tail = secondLast;
        tail.next = null;
    }

    void deleteAtIndex(int index){
        if(index == 0){
            deleteAtZero();
        }else if(index >= size-1){
            deleteAtLast();
        }else{
            Node previousDeletionNode = get(index - 1);
            Node deletionNode = get(index);
            previousDeletionNode.next = deletionNode.next;
            deletionNode.next = null;
        }
    }

    public Node get(int index){
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }

    void addNodeAtLast(int val){
        if(tail == null){
            addNodeAtZero(val);
            return;
        }
        Node node = new Node(val);
        tail.setNext(node);
        this.tail = node;
        size++;
    }

    void addNodeAtIndex(int index, int val){
        if(index == 0){
            addNodeAtZero(val);
        }else if(index == size){
            addNodeAtLast(val);
        }else{
            Node temp = head;
            for(int i = 1; i<index; i++){
                temp = temp.next;
            }
            //next will be current.next
            Node node = new Node(val, temp.next);
            temp.setNext(node);
            size++;
        }
    }

    void display(){
        Node temp = this.head;
        while(temp != null){
            System.out.print(temp.val + " -> " );
            temp = temp.next;
        }
    }

    private class Node{

        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        void setVal(int val){
            this.val = val;
        }
        void setNext(Node next){
            this.next = next;
        }
    }

}
