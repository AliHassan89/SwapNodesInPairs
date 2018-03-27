package test.java;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import main.java.ListNode;
import main.java.SwapNodes;
import org.junit.Test;

public class SwapNodesTest {

  private SwapNodes swapNodes = new SwapNodes();

  @Test
  public void swapPairs_checkForEmptyList(){
    //given
    ListNode head = null;

    //when
    ListNode result = swapNodes.swapPairs(head);

    //then
    assertThat(result, equalTo(head));
  }

  @Test
  public void swapPairs_checkForListOfLengthFour(){
    //given
    // 1->2->3->4->null
    ListNode head = new ListNode(1);
    ListNode second = new ListNode(2);
    ListNode third = new ListNode(3);
    ListNode fourth = new ListNode(4);

    head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = null;

    //when
    ListNode result = swapNodes.swapPairs(head);

    //then
    //expected: 2->1->4->3
    assertThat(result.val, equalTo(2));
    assertThat(result.next.val, equalTo(1));
    assertThat(result.next.next.val, equalTo(4));
    assertThat(result.next.next.next.val, equalTo(3));
  }

}
