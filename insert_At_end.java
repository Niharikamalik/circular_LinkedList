class Node{
    int data ;
    Node next;
    Node(int x){
        data= x;
        next= null;
    }
}
class Main{
    public static void main(String [] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next= new Node(40);
        head.next.next.next.next = head;
        head  = insert(head,50);
        printlist(head);
    }
    /* insert at end of the linked list */
    static Node insertEnd(Node head , int x){
        Node temp = new Node(x);
        if(head == null) {
            temp.next = temp;
            return temp;
        }
        else{
            temp.next = head.next;
            head.next = temp;
            int t = head.data;
            head.data = temp.data;
            temp.data = t;
            
            return temp;
        }
    }
    static void printlist(Node head){
        if (head == null) return ;
        System.out.print(head.data +" ");
         Node r = head.next;
             do{
                 System.out.print( r.data + " ");
                 r=r.next;
             }
             while(r!=head);
        
    }
}
