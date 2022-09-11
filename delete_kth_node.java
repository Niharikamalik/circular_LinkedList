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
        deleteKth(head,2);
        printlist(head);
    }
   
    static Node deleteKth(Node head , int k){
        
        if(head == null) return head;
        if (k==1) {
            head.data = head.next.data;
            head.next = head.next.next;
            return head;
        }
        Node curr = head;
        for(int i = 0 ; i < k-2 ; i++){
            curr=curr.next;
        }
        curr.next = curr.next.next;
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
