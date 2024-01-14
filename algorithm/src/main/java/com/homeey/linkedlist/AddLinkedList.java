package com.homeey.linkedlist;

import com.homeey.common.ListNode;

import java.security.PrivateKey;
import java.util.List;
import java.util.Stack;

/**
 * Talk is cheap,show me the code
 *
 * @author Mr.G[jt4mrg@gmail.com]
 * @since 2024 2024/1/13 下午10:49
 **/
public class AddLinkedList {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param head1 ListNode类
     * @param head2 ListNode类
     * @return ListNode类
     */
    public ListNode addInList(ListNode head1, ListNode head2) {
        // write code here
        Stack<Integer> operandOne = new Stack<>();
        Stack<Integer> operandTwo = new Stack<>();

        while (head1 != null) {
            operandOne.push(head1.val);
            head1 = head1.next;
        }

        while (head2 != null) {
            operandTwo.push(head2.val);
            head2 = head2.next;
        }

        int baseValue = 0;
        int tmp = 0;
        ListNode header = null;
        int max = Math.max(operandOne.size(), operandTwo.size());
        for (int i = 0; i < max; i++) {
            if (!operandOne.isEmpty()) {
                tmp += operandOne.pop();
            }
            if (!operandTwo.isEmpty()) {
                tmp += operandTwo.pop();
            }
            tmp += baseValue;
            baseValue = tmp / 10;
            ListNode listNode = new ListNode(tmp % 10);
            listNode.next = header;
            header = listNode;
            tmp = 0;
        }

        if (baseValue != 0) {
            ListNode tn = new ListNode(baseValue);
            tn.next = header;
            header = tn;
        }

        return header;
    }
}
