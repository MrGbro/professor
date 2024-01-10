package com.homeey.linkedlist;

import com.homeey.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Talk is cheap,show me the code
 *
 * @author Mr.G[jt4mrg@gmail.com]
 * @since 2024 2024/1/10 下午11:00
 **/
class MergeLinkedListTest {

    private MergeLinkedList instance;

    @BeforeEach
    void init() {
        instance = new MergeLinkedList();
    }

    @Test
    void merge() {
        ListNode listNode1 = new ListNode(1,
                new ListNode(3,
                        new ListNode(5)));
        ListNode listNode2 = new ListNode(2,
                new ListNode(4));

        ListNode merge = instance.merge(listNode1, listNode2);
        Assertions.assertEquals(1, merge.val);
        Assertions.assertEquals(2, merge.next.val);
        Assertions.assertEquals(3, merge.next.next.val);
    }
}