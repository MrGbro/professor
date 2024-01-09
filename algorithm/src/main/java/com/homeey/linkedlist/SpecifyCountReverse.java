package com.homeey.linkedlist;

import com.homeey.common.ListNode;

import java.util.List;
import java.util.Stack;

/**
 * Talk is cheap,show me the code
 *
 * @author Mr.G[jt4mrg@gmail.com]
 * @since 2024 2024/1/9 下午10:35
 **/
public class SpecifyCountReverse {
    public ListNode reverseKGroup(ListNode head, int k) {
        // write code here
        if (head == null || head.next == null || k <= 1) {
            return head;
        }

        ListNode tmp = head;
        List<Integer> integers = new Stack<>();
        while (tmp != null) {
            integers.add(tmp.val);
            tmp = tmp.next;
        }

        //构造新链表
        int size = integers.size();
        if (size < k) {
            return head;
        }
        if (size == k) {
            ListNode res = new ListNode(-1);
            ListNode tmpRes = res;
            for (int j = integers.size(); j > 0; j--) {
                tmpRes.next = new ListNode(integers.get(j - 1));
                tmpRes = tmpRes.next;
            }
            return res.next;
        }

        int count = size / k;
        int flag = k;
        ListNode newHead = new ListNode(-1);
        ListNode tmpNewHead = newHead;
        for (int i = 0; i < count; i++) {
            ListNode mid = new ListNode(-1);
            ListNode midTmp = mid;
            while (flag - 1 >= 0) {
                midTmp.next = new ListNode(integers.get(i * k + flag - 1));
                midTmp = midTmp.next;
                flag--;
            }
            tmpNewHead.next = mid.next;
            tmpNewHead = midTmp;
            flag = k;
        }

        //如果没用完
        int index = count * k;
        for (int i = index; i < size; i++) {
            tmpNewHead.next = new ListNode(integers.get(i));
            tmpNewHead = tmpNewHead.next;
        }

        return newHead.next;
    }
}
