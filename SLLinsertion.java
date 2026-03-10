public class LinkedList
{   
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    public void insertAtPosition(int data,int pos){
        Node newNode = new Node(data);
        if(pos == 1){
            insertAtBeginning(data);
            return;
        }
        Node temp = head;
        for(int i = 1;i< pos - 1 && temp != null;i++){
            temp = temp.next;
        }
        if(temp == null) return;
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void insertAfterNode(int key,int data){
        Node temp = head;
        while(temp != null && temp.data != key){
            temp = temp.next;
        }
        if(temp == null) return;
        Node newNode = new Node(data);
        newNode.next = temp.next;
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
    
	public static void main(String[] args) {
		 LinkedList list = new LinkedList();

        list.insertAtBeginning(10);
        list.insertAtBeginning(5);

        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.insertAtPosition(15, 3);

        list.insertAfterNode(20, 25);

        list.display();
	}
}
