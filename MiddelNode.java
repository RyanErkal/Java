// Given a non-empty, singly linked list with head node head, return a middle node of linked list.
//
// If there are two middle nodes, return the second middle node.
//
//Put every node into an array A in order. Then the middle node is just A[A.length // 2], since we can retrieve each node by index.
//

//WORKS ON LEETCODE DOESNT COMPILE HERE

class MiddleNode{

  public static void main(String[] args) {
    MiddleNode myInstance = new MiddleNode();
    int[] numlist = {1,2,3,4,5};
    myInstance.middleNode(numlist);

  }

  public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
