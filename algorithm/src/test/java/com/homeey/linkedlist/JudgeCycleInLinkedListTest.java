package com.homeey.linkedlist;

import com.homeey.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Talk is cheap,show me the code
 *
 * @author Mr.G[jt4mrg@gmail.com]
 * @since 2024 2024/1/11 下午10:46
 **/
class JudgeCycleInLinkedListTest {

    private JudgeCycleInLinkedList instance;

    @BeforeEach
    void init() {
        instance = new JudgeCycleInLinkedList();
    }

    @Test
    void hasCycle() {
        ListNode node = new ListNode(1,
                new ListNode(2,
                        new ListNode(3)));

        boolean b = instance.hasCycle(node);
        Assertions.assertFalse(b);
    }

    @Test
    void hasCycle2() {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode2;
        boolean b = instance.hasCycle(listNode);
        Assertions.assertTrue(b);
    }

    @Test
    void hasCycle3() {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode.next = listNode2;
        boolean b = instance.hasCycle(listNode);
        Assertions.assertFalse(b);
    }
}