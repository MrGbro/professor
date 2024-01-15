package com.homeey.linkedlist;

import com.homeey.common.ListNode;

import java.util.ArrayList;

/**
 * 有道无术，术尚可求；有术无道，则止于术
 *
 * @author Mr.G[jtmrg@qq.com]
 * 2024/1/15 21:17
 **/
public class OddEvenListNode {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param head ListNode类
     * @return ListNode类
     */
    public ListNode oddEvenList(ListNode head) {
        // write code here
        ListNode tmp = head;
        ArrayList<Integer> integers = new ArrayList<>();
        while (tmp != null) {
            integers.add(tmp.val);
            tmp = tmp.next;
        }

        ListNode nhead = new ListNode(-1);
        ListNode th = nhead;

        for (int i = 0; i < integers.size(); i = i + 2) {
            th.next = new ListNode(integers.get(i));
            th = th.next;
        }
        for (int i = 1; i < integers.size(); i = i + 2) {
            th.next = new ListNode(integers.get(i));
            th = th.next;
        }

        return nhead.next;
    }
}
