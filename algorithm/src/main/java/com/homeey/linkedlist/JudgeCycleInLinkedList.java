package com.homeey.linkedlist;

import com.homeey.common.ListNode;

/**
 * Talk is cheap,show me the code
 *
 * @author Mr.G[jt4mrg@gmail.com]
 * @since 2024 2024/1/11 下午10:28
 **/
public class JudgeCycleInLinkedList {
    /**
     * check cecyle for ListNode
     *
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (true) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == null || fast.next == null) {
                return false;
            }
            if (slow.val == fast.val) {
                return true;
            }
        }
    }
}
