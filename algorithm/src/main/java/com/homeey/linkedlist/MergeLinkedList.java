package com.homeey.linkedlist;

import com.homeey.common.ListNode;

/**
 * Talk is cheap,show me the code
 *
 * @author Mr.G[jt4mrg@gmail.com]
 * @since 2024 2024/1/10 下午10:55
 **/
public class MergeLinkedList {
    /**
     * 输入两个递增的链表，单个链表的长度为n，合并这两个链表并使新链表中的节点仍然是递增排序的。
     * 数据范围
     * 如输入{1,3,5},{2,4,6}时，合并后的链表为{1,2,3,4,5,6}，所以对应的输出为{1,2,3,4,5,6}，转换过程如下图所示：
     *
     * @param pHead1
     * @param pHead2
     * @return
     */
    public ListNode merge(ListNode pHead1, ListNode pHead2) {
        // write code here
        if (pHead1 == null) {
            return pHead2;
        }

        if (pHead2 == null) {
            return pHead1;
        }

        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while (pHead1 != null && pHead2 != null) {
            if (pHead1.val <= pHead2.val) {
                tmp.next = pHead1;
                pHead1 = pHead1.next;
            } else {
                tmp.next = pHead2;
                pHead2 = pHead2.next;
            }
            tmp = tmp.next;
        }

        if (pHead1 != null) {
            while (pHead1 != null) {
                tmp.next = pHead1;
                pHead1 = pHead1.next;
                tmp = tmp.next;
            }
        }

        if (pHead2 != null) {
            while (pHead2 != null) {
                tmp.next = pHead2;
                pHead2 = pHead2.next;
                tmp = tmp.next;
            }
        }

        return newHead.next;
    }
}
