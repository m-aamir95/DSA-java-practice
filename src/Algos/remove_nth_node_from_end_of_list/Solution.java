package Algos.remove_nth_node_from_end_of_list;

import javax.swing.text.StyledEditorKit;
import java.util.List;

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int counter = 0;
        ListNode traverser = head;

        //Exploration the total num of available nodes
        while (traverser != null){
            counter++;
            traverser = traverser.next;
        }

        int target_to_remove_count_index = (counter - n) + 1;
        traverser = head;
        ListNode previous_node = null;
        counter = 0;
        while (traverser != null){
            counter++;

            if (counter == target_to_remove_count_index){
                //Node deletion cases
                if (previous_node == null){ //very start of the list
                    head = head.next;
                }else if(traverser.next == null) {//is the last node in the list
                    previous_node.next = null;
                }else{
                    previous_node.next = traverser.next;
                }
                break;
            }

            previous_node = traverser;
            traverser = traverser.next;
        }
        return head;
    }

}

class Solution_2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode left = head;
        //Move right pointer ahead of left by n
        //We are doing this so that left stops at just the right node when right is out of bound
        //Because we are shifting right by n, this will make sure that there stays a N diff between them
        ListNode right = head;
        n = n+1;
        while (n > 0 &&  right != null){
            right = right.next;
            n--;
        }

        //Now keep moving right towards the end of the list until it becomes out of bound
        while (right != null){
            left = left.next;
            right = right.next;
        }

        //Adjust left pointers next reference
        left.next =  left.next.next;

        return head;
    }
}