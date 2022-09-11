class Solution
{
	public static Node sortedInsert(Node head,int data)
         {
            //(add code here.)
             Node newNode = new Node(data);
       Node curr = head;
       if(data <= curr.data) {
           while(curr.next != head) {
              curr= curr.next;
           }
          curr.next = newNode;
          newNode.next = head;
          head = newNode;
       }
       else {
           Node prev = curr;
           curr = curr.next;
           while(curr != head && curr.data <= data) {
              prev = curr;
              curr= curr.next;
           }
          
          prev.next = newNode;
          newNode.next = curr;
      }
   return head;
         }
}
