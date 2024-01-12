package com.homeey.linkedlist;

import com.homeey.common.ListNode;

import java.util.HexFormat;
import java.util.List;
import java.util.Stack;

/**
 * Talk is cheap,show me the code
 *
 * @author Mr.G[jt4mrg@gmail.com]
 * @since 2024 2024/1/12 下午9:41
 **/
public class LastKCountListNode {
    public ListNode FindKthToTail(ListNode pHead, int k) {
        // write code here
        Stack<Integer> integers = new Stack<>();
        ListNode tmp = pHead;
        while (tmp != null) {
            integers.push(tmp.val);
            tmp = tmp.next;
        }

        ListNode nhead = null;
        for (int i = 0; i < k; i++) {
            nhead = new ListNode(integers.pop(), nhead);
        }

        return nhead;
    }

    public ListNode FindKthToTailV2(ListNode pHead, int k) {
        // write code here
        ListNode reverse = reverse(pHead);
        ListNode head = null;
        for (int i = 0; i < k; i++) {
            if (reverse == null) {
                return null;
            }
            ListNode node = new ListNode(reverse.val);
            node.next = head;
            head = node;
            reverse = reverse.next;
        }

        return head;
    }


    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode reverse = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return reverse;
    }
}
