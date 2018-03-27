/**
 Given a linked list, swap every two adjacent nodes and return its head.

 For example,
 Given 1->2->3->4, you should return the list as 2->1->4->3.

 Your algorithm should use only constant space. You may not modify the values in the list, only
 nodes itself can be changed.
 */

package main.java;

public class SwapNodes {

  public ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null)
      return head;

    ListNode prev = new ListNode(0);
    ListNode first = head;
    ListNode second = head.next;
    prev.next = first;
    head = second;

    while (first != null && second != null){
      ListNode temp = first;
      ListNode nextOfSecond = second.next;
      first = second;
      second = temp;
      first.next = second;
      second.next = nextOfSecond;
      prev.next = first;
      prev = second;
      first = nextOfSecond;
      if (first == null || first.next == null)
        break;
      second = first.next;
    }

    return head;
  }
}
