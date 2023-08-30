/*
 * @lc app=leetcode id=23 lang=java
 *
 * [23] Merge k Sorted Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0) {
            return null;
        }

        while (lists.length > 1) {
            List<ListNode> mergedList = new ArrayList<ListNode>();
            for (int i = 0; i < lists.length; i+=2) {
                ListNode l1 = lists[i];
                ListNode l2 = (i + 1) < lists.length ? lists[i + 1] : null;
                
                mergedList.add(merge2List(l1, l2));
            }
               //Convert list back to array
                ListNode[] tempArray = new ListNode[mergedList.size()];
                lists = mergedList.toArray(tempArray);
        
        }
        return lists[0];
    }

    ListNode merge2List(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if (l1 != null)
            tail.next = l1;
        if (l2 != null)
            tail.next = l2;

        return dummy.next;
    }
}
// @lc code=end

`