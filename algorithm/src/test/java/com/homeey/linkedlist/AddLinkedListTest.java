package com.homeey.linkedlist;

import com.homeey.common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Talk is cheap,show me the code
 *
 * @author Mr.G[jt4mrg@gmail.com]
 * @since 2024 2024/1/13 下午10:59
 **/
class AddLinkedListTest {

    private AddLinkedList instance;

    @BeforeEach
    void init() {
        instance = new AddLinkedList();
    }

    @Test
    void addInList() {
        ListNode listNode = new ListNode(9,
                new ListNode(3,
                        new ListNode(7)));

        ListNode listNode2 = new ListNode(6,
                new ListNode(3));

        ListNode node = instance.addInList(listNode, listNode2);
        assertEquals(node.val, 1);
    }

    @Test
    void addInList2() {
        ListNode listNode = new ListNode(0);

        ListNode listNode2 = new ListNode(6,
                new ListNode(3));

        ListNode node = instance.addInList(listNode, listNode2);
        assertEquals(node.val, 6);
    }


    @Test
    void addInList3() {
        ListNode listNode = new ListNode(5);

        ListNode listNode2 = new ListNode(6);

        ListNode node = instance.addInList(listNode, listNode2);
        assertEquals(node.val, 1);
    }
}