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
    }
    static void printlist(Node head){
        if (head == null) return ;
        System.out.print(head.data +" ");
        // ********************************METHOD - 1 (USING FOR LOOP) *******************************
        // for(Node r= head.next ; r!=head;r=r.next ){
        //     System.out.print(r.data + " ");
    //   }
    // ********************************METHOD - 2 (USING DO WHILE LOOP) *******************************
         Node r = head.next;
             do{
                 System.out.print( r.data + " ");
                 r=r.next;
             }
             while(r!=head);
        
    }
}
