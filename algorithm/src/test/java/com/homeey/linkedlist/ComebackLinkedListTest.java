package com.homeey.linkedlist;

import com.homeey.common.ListNode;
import com.homeey.common.ListNodeBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Talk is cheap,show me the code
 *
 * @author Mr.G[jt4mrg@gmail.com]
 * @since 2024 2024/1/14 下午10:42
 **/
class ComebackLinkedListTest {

    private ComebackLinkedList comebackLinkedList;

    @BeforeEach
    void setUp() {
        comebackLinkedList = new ComebackLinkedList();
    }

    @Test
    void isPail() {
        ListNode listNode = new ListNode(1,
                new ListNode(2,
                        new ListNode(2,
                                new ListNode(1))));
        boolean pail = comebackLinkedList.isPail(listNode);
        assertTrue(pail);
    }

    @Test
    void isPail2() {
        ListNode listNode = new ListNode(1);
        boolean pail = comebackLinkedList.isPail(listNode);
        assertTrue(pail);
        boolean pail1 = comebackLinkedList.isPail(null);
        assertTrue(pail1);
    }

    @Test
    void isPail3() {
        ListNode listNode = new ListNode(1,
                new ListNode(2,
                        new ListNode(2,
                                new ListNode(3))));
        boolean pail = comebackLinkedList.isPail(listNode);
        assertFalse(pail);
    }

    @Test
    void isPail4() {
        int[] values = {1,2,3,4,5,4,3,2,1,1};
        ListNode listNode = ListNodeBuilder.of(values);
        boolean pail = comebackLinkedList.isPail(listNode);
        assertFalse(pail);
    }
}