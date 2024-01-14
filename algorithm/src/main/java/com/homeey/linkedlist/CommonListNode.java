package com.homeey.linkedlist;

import com.homeey.common.ListNode;

/**
 * Talk is cheap,show me the code
 *
 * @author Mr.G[jt4mrg@gmail.com]
 * @since 2024 2024/1/13 下午10:20
 **/
public class CommonListNode {
    public ListNode FindFirstCommonNode(ListNode pHead1,
                                        ListNode pHead2) {
        ListNode ap = pHead1;
        ListNode bp = pHead2;

        boolean switchAp = false;
        boolean switchBp = false;

        while (ap != null && bp != null) {
            if (ap.val == bp.val) {
                return ap;
            }
            ap = ap.next;
            bp = bp.next;

            if (ap == null && switchAp == false) {
                ap = pHead2;
                switchAp = true;
            }

            if (bp == null && switchBp == false) {
                bp = pHead1;
                switchBp = true;
            }
        }

        return null;
    }
}
