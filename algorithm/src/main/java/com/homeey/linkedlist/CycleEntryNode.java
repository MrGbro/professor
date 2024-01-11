package com.homeey.linkedlist;

import com.homeey.common.ListNode;

import java.util.HashMap;

/**
 * Talk is cheap,show me the code
 *
 * @author Mr.G[jt4mrg@gmail.com]
 * @since 2024 2024/1/11 下午11:08
 **/
public class CycleEntryNode {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        HashMap<Integer, ListNode> nodeMap = new HashMap<>();
        ListNode tmp = pHead;
        while (tmp != null) {
            if (nodeMap.containsKey(tmp.val)) {
                return nodeMap.get(tmp.val);
            }
            nodeMap.put(tmp.val, tmp);
            tmp = tmp.next;
        }
        return null;
    }

    /**
     * 快慢指针
     *
     * @param pHead
     * @return
     */
    public ListNode EntryNodeOfLoopV2(ListNode pHead) {
        if (pHead == null && pHead.next == null) {
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = fast;
        while (true) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == null || fast.next == null) {
                return null;
            }
            if (fast.val == slow.val) {
                break;
            }
        }

        ListNode slow2 = pHead;
        while (slow2.val != fast.val) {
            slow2 = slow2.next;
            fast = fast.next;
        }

        return fast;
    }
}
