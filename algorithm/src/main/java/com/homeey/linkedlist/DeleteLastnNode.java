package com.homeey.linkedlist;


import com.homeey.common.ListNode;

import java.util.List;
import java.util.Stack;

/**
 * Talk is cheap,show me the code
 *
 * @author Mr.G[jt4mrg@gmail.com]
 * @since 2024 2024/1/13 下午9:18
 **/
public class DeleteLastnNode {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param head ListNode类
     * @param n    int整型
     * @return ListNode类
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // write code here
        if (head == null) {
            return null;
        }

        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        int m = 0;
        ListNode nhead = null;
        while (!stack.isEmpty()) {
            if (++m == n) {
                stack.pop();
                continue;
            }

            ListNode tm = new ListNode(stack.pop());
            tm.next = nhead;
            nhead = tm;
        }

        return nhead;
    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {
        // write code here
        ListNode reverse = reverse(head);
        ListNode tmp = reverse;
        ListNode last = null;
        int m = 1;
        while (tmp != null) {
            if (m == n) {
                if (last == null) {
                    reverse = reverse.next;
                    break;
                } else {
                    last.next = tmp.next;
                    break;
                }
            }
            last = tmp;
            tmp = tmp.next;
            m++;
        }
        return reverse(reverse);
    }


    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode nheade = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return nheade;
    }

}
