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
        printlist(head);
        System.out.println();
        deletehead(head);
        printlist(head);
    }
   
    static Node deletehead(Node head){
        
        if(head == null) return null;
        if(head.next == null) return null;
        
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
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
