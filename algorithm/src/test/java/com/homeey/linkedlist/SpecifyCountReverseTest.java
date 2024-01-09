package com.homeey.linkedlist;

import com.homeey.common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Talk is cheap,show me the code
 *
 * @author Mr.G[jt4mrg@gmail.com]
 * @since 2024 2024/1/9 下午11:00
 **/
class SpecifyCountReverseTest {

    private SpecifyCountReverse target;

    @BeforeEach
    void init() {
        target = new SpecifyCountReverse();
    }

    @Test
    void reverseKGroup() {
        ListNode listNode = new ListNode(1,
                new ListNode(2,
                        new ListNode(3)));
        ListNode listNode1 = target.reverseKGroup(listNode, 1);
        assertEquals(1, listNode1.val);
        ListNode listNode2 = target.reverseKGroup(listNode, 2);
        assertEquals(2, listNode2.val);
    }

    @Test
    void reverseKGroup2() {
        ListNode listNode = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));
        ListNode listNode2 = target.reverseKGroup(listNode, 2);
        assertEquals(2, listNode2.val);
    }
}