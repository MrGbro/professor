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
 * @since 2024 2024/1/13 下午9:26
 **/
class DeleteLastnNodeTest {

    private DeleteLastnNode instance;

    @BeforeEach
    void init() {
        instance = new DeleteLastnNode();
    }

    @Test
    void removeNthFromEnd() {
        ListNode listNode = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        ListNode listNode1 = instance.removeNthFromEnd(listNode, 2);
        ListNode listNode2 = instance.removeNthFromEnd2(listNode1, 2);
        Assertions.assertEquals(listNode1.val, 1);
        Assertions.assertEquals(listNode2.val, 1);
    }

    @Test
    void removeNthFromEnd2() {
        ListNode listNode = new ListNode(1,
                new ListNode(2));

        ListNode listNode1 = instance.removeNthFromEnd(listNode, 2);
        ListNode listNode2 = instance.removeNthFromEnd2(listNode, 2);
        Assertions.assertEquals(listNode1.val, 2);
        Assertions.assertEquals(listNode2.val, 2);
    }

    @Test
    void removeNthFromEnd3() {
        ListNode listNode = new ListNode(1,
                new ListNode(2));

        ListNode listNode1 = instance.removeNthFromEnd(listNode, 3);
        ListNode listNode2 = instance.removeNthFromEnd2(listNode, 3);
        Assertions.assertEquals(listNode1.val, 1);
        Assertions.assertEquals(listNode2.val, 1);
    }

    @Test
    void removeNthFromEnd4() {
        ListNode listNode = null;

        ListNode listNode1 = instance.removeNthFromEnd(listNode, 3);
        ListNode listNode2 = instance.removeNthFromEnd2(listNode, 3);
        assertNull(listNode1);
        assertNull(listNode2);
    }
}