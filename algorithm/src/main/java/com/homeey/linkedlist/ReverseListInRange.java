package com.homeey.linkedlist;

import com.homeey.common.ListNode;

import javax.swing.*;
import java.util.Stack;

/**
 * Talk is cheap,show me the code
 *
 * @author Mr.G[jt4mrg@gmail.com]
 * @since 2024 2024/1/8 下午10:16
 **/
public class ReverseListInRange {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null) {
            return head;
        }
        Stack<Integer> integers = new Stack<>();
        ListNode tmp = head;
        while (tmp != null) {
            integers.push(tmp.val);
            tmp = tmp.next;
        }

        int total = integers.size();

        ListNode tail = null;
        ListNode mid = new ListNode(-1);
        ListNode tmpMid = mid;
        ListNode header = null;
        ListNode tmpHeader = null;
        int i = 1;
        while (!integers.isEmpty()) {
            if (i <= total - n) {
                tail = new ListNode(integers.pop(), tail);
            } else if (i <= total - m + 1) {
                tmpMid.next = new ListNode(integers.pop());
                tmpMid = tmpMid.next;
            } else {
                header = new ListNode(integers.pop(), header);
                if (tmpHeader == null) {
                    tmpHeader = header;
                }
            }
            i++;
        }

        tmpMid.next = tail;
        if (tmpHeader == null) {
            return mid.next;
        }
        tmpHeader.next = mid.next;
        return header;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2));
        ReverseListInRange reverseListInRange = new ReverseListInRange();
        reverseListInRange.reverseBetween(listNode, 1, 2);
    }
}
