package com.nf.leetcode.hot100;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class No2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode re = new ListNode(-1);
        ListNode listNode = new ListNode(-1);
        int v3 = 0;
        boolean co = false;
        boolean first = false;
        while(null != l1 || null != l2) {
            int v1 = l1 == null ? 0 : l1.val;
            int v2 = l2 == null ? 0 : l2.val;

            v3 =  v3 >= 10 ?  v1 + v2 + 1: v1 + v2;
            co = v3 >= 10 ? true : false;
            if(!first) {
                re = new ListNode(v3 >= 10 ? v3 % 10 : v3);
                first = true;
                listNode = re;
            }else {
                re.next = new ListNode(v3 >= 10 ? v3 % 10 : v3);
                re = re.next;
            }

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }

        if(v3 >= 10){
            re.next = new ListNode(1);
        }


        return listNode;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


}
