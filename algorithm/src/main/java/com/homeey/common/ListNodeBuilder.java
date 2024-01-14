package com.homeey.common;

import java.util.List;

/**
 * Talk is cheap,show me the code
 *
 * @author Mr.G[jt4mrg@gmail.com]
 * @since 2024 2024/1/14 下午10:45
 **/
public final class ListNodeBuilder {
    public static ListNode of(int... value) {
        ListNode head = new ListNode(-1);
        ListNode tmp = head;
        for (int i : value) {
            tmp.next = new ListNode(i);
            tmp = tmp.next;
        }
        return head.next;
    }
}
