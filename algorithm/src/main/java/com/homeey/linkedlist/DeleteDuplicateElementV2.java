package com.homeey.linkedlist;

import com.homeey.common.ListNode;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

/**
 * 有道无术，术尚可求；有术无道，则止于术
 *
 * @author Mr.G[jtmrg@qq.com]
 * 2024/1/15 21:47
 **/
public class DeleteDuplicateElementV2 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param head ListNode类
     * @return ListNode类
     */
    public ListNode deleteDuplicates(ListNode head) {
        // write code here
        ListNode tmp = head;
        ListNode nh = new ListNode(-1);
        ListNode th = nh;
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        while (tmp != null) {
            map.put(tmp.val, Optional.ofNullable(map.get(tmp.val)).orElse(0) + 1);
            tmp = tmp.next;
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                th.next = new ListNode(entry.getKey());
                th = th.next;
            }
        }
        return nh.next;
    }

    public ListNode deleteDuplicatesV2(ListNode head) {
        // write code here
        ListNode tmp = head;
        ListNode nh = new ListNode(-1);
        ListNode th = nh;
        ListNode curNode = null;
        int currentValue = Integer.MAX_VALUE;

        while (tmp != null) {
            if (currentValue != tmp.val) {
                if (curNode != null) {
                    th.next = curNode;
                    th = th.next;
                }
                curNode = new ListNode(tmp.val);
            } else {
                curNode = null;
            }
            currentValue = tmp.val;
            tmp = tmp.next;
        }
        if (curNode != null) {
            th.next = curNode;
        }

        return nh.next;
    }
}
