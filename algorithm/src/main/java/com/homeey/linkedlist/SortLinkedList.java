package com.homeey.linkedlist;

import com.homeey.common.ListNode;

import java.util.*;

/**
 * Talk is cheap,show me the code
 *
 * @author Mr.G[jt4mrg@gmail.com]
 * @since 2024 2024/1/14 下午10:07
 **/
public class SortLinkedList {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param head ListNode类 the head node
     * @return ListNode类
     */
    public ListNode sortInList(ListNode head) {
        // write code here
        if (head == null || head.next == null) {
            return head;
        }
        List<Integer> integers = new ArrayList<>();
        while (head != null) {
            integers.add(head.val);
            head = head.next;
        }

        Collections.sort(integers);
        ListNode nh = new ListNode(-1);
        ListNode tmp = nh;
        for (Integer integer : integers) {
            tmp.next = new ListNode(integer);
            tmp = tmp.next;
        }

        return nh.next;
    }
}
