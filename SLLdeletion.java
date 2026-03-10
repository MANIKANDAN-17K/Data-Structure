class LinkedList {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }
     public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public void deleteAtBeginning(){
        if(head == null){
            return;
        }
        head = head.next;
    }
    public void deleteAtEnd(){
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }
    public void deleteAtPosition(int pos){
        if(pos == 1){
            head = head.next;
            return; 
        }
        Node temp = head;
        for(int i = 1;i<pos - 1 && temp.next != null;i++){
            temp = temp.next;
        }
        if(temp.next == null){
            return;
        }
        temp.next = temp.next.next;
    }
    public void deleteByValue(int key){
        if(head == null){
            return;
        }
        if(head.data == key){
            head = head.next;
        }
        Node temp = head;
        while(temp.next != null && temp.next.data != key){
            temp = temp.next;
        }
        if(temp.next == null){
            return;
        }
        temp.next = temp.next.next;
    }




    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.display();

        list.deleteAtBeginning();
        list.display();

        list.deleteAtEnd();
        list.display();

        list.deleteByValue(20);
        list.display();

        list.deleteAtPosition(1);
        list.display();
    }
}
