package com.homeey.linkedlist;

import com.homeey.common.ListNode;

/**
 * 有道无术，术尚可求；有术无道，则止于术
 *
 * @author Mr.G[jtmrg@qq.com]
 * 2024/1/15 21:23
 **/
public class DeleteDuplicateElement {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param head ListNode类
     * @return ListNode类
     */
    public ListNode deleteDuplicates(ListNode head) {
        // write code here
        ListNode tmp = head;
        ListNode nhead = new ListNode(-1);
        int curValue = Integer.MAX_VALUE;
        ListNode th = nhead;
        while (tmp != null) {
            if (curValue != tmp.val) {
                th.next = new ListNode(tmp.val);
                curValue = tmp.val;
                th = th.next;
            }
            tmp = tmp.next;
        }

        return nhead.next;
    }
}
