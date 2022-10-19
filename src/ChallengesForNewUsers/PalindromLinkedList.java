package ChallengesForNewUsers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

public class PalindromLinkedList {
    public static boolean isPalindrome(ListNode head) {
        boolean answer = true;
        List<Integer> list = new ArrayList<>();
        while(head != null) {
            list.add(head.val);
            head = head.next;
        }

        for(int i = 0; i < (list.size() / 2); i++) {
            if(!Objects.equals(list.get(i), list.get(list.size() - 1 - i))) {
                answer = false;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        System.out.println(isPalindrome(head));
    }
}
