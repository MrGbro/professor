package com.homeey.linkedlist;

import com.homeey.common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Talk is cheap,show me the code
 *
 * @author Mr.G[jt4mrg@gmail.com]
 * @since 2024 2024/1/13 下午10:32
 **/
class CommonListNodeTest {

    private CommonListNode instance;

    @BeforeEach
    void setUp() {
        instance = new CommonListNode();
    }

    @Test
    void findFirstCommonNode() {
        ListNode branch1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(3)));

        ListNode branch2 = new ListNode(4,
                new ListNode(5));

        ListNode tail = new ListNode(6,
                new ListNode(7));

        branch1.next = tail;
        branch2.next = tail;

        ListNode listNode = instance.FindFirstCommonNode(branch1, branch2);
        assertEquals(listNode.val, 6);
    }

    @Test
    void findFirstCommonNode2() {
        ListNode branch1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(3)));

        ListNode branch2 = new ListNode(4,
                new ListNode(5));

//        ListNode tail = new ListNode(6,
//                new ListNode(7));
//
//        branch1.next = tail;
//        branch2.next = tail;

        ListNode listNode = instance.FindFirstCommonNode(branch1, branch2);
        assertNull(listNode);
    }
}