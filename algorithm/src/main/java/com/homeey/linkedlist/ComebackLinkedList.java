package com.homeey.linkedlist;

import com.homeey.common.ListNode;

import java.awt.*;
import java.util.Stack;

/**
 * Talk is cheap,show me the code
 *
 * @author Mr.G[jt4mrg@gmail.com]
 * @since 2024 2024/1/14 下午10:16
 **/
public class ComebackLinkedList {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param head ListNode类 the head
     * @return bool布尔型
     */
    public boolean isPail(ListNode head) {
        // write code here
        if (head == null || head.next == null) {
            return true;
        }
        ListNode tmp = head;
        ListNode reverse = reverse(head);

        while (tmp != null) {
            if (tmp.val != reverse.val) {
                return false;
            }
            tmp = tmp.next;
            reverse = reverse.next;
        }

        return true;
    }

    private ListNode reverse(ListNode head) {
        Stack<Integer> integers = new Stack<>();
        ListNode tmp = head;
        while (tmp != null) {
            integers.push(tmp.val);
            tmp = tmp.next;
        }

        ListNode nHead = new ListNode(-1);
        ListNode th = nHead;
        while (!integers.isEmpty()) {
            th.next =  new ListNode(integers.pop());
            th = th.next;
        }
        return nHead.next;
    }
}
