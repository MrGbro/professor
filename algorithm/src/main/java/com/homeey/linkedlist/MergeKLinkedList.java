package com.homeey.linkedlist;

import com.homeey.common.ListNode;

import java.util.ArrayList;

/**
 * Talk is cheap,show me the code
 *
 * @author Mr.G[jt4mrg@gmail.com]
 * @since 2024 2024/1/10 下午11:13
 **/
public class MergeKLinkedList {
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        // write code here
        ListNode newHead = null;
        for (ListNode list : lists) {
            newHead = merge(newHead, list);
        }

        return newHead;
    }

    private ListNode merge(ListNode pHead1, ListNode pHead2) {
        // write code here
        if (pHead1 == null) {
            return pHead2;
        }

        if (pHead2 == null) {
            return pHead1;
        }

        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while (pHead1 != null && pHead2 != null) {
            if (pHead1.val <= pHead2.val) {
                tmp.next = pHead1;
                pHead1 = pHead1.next;
            } else {
                tmp.next = pHead2;
                pHead2 = pHead2.next;
            }
            tmp = tmp.next;
        }

        if (pHead1 != null) {
            while (pHead1 != null) {
                tmp.next = pHead1;
                pHead1 = pHead1.next;
                tmp = tmp.next;
            }
        }

        if (pHead2 != null) {
            while (pHead2 != null) {
                tmp.next = pHead2;
                pHead2 = pHead2.next;
                tmp = tmp.next;
            }
        }

        return newHead.next;
    }
}
