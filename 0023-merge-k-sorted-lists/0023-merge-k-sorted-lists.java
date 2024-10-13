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
        //ptrs
        List<ListNode> ptrs = new ArrayList<>();

        //solution LL 
        ListNode result = new ListNode();
        ListNode ptr = result; //pointing to result

        for(int i = 0 ; i < lists.length; i++){
            ListNode p = new ListNode();
            p = lists[i];
            ptrs.add(p);
        } 
        while(true){
            int min = Integer.MAX_VALUE;
            int index = 0;
            for(int j = 0; j < ptrs.size(); j++){
                if(ptrs.get(j) == null){ continue; }
                if(min > ptrs.get(j).val){
                    min = ptrs.get(j).val; 
                    index = j;
                }
            }
            if(min == Integer.MAX_VALUE){return result.next;}
            ptr.next = new ListNode(min);
            ptr = ptr.next; 
            ListNode temp = ptrs.get(index).next; 
            ptrs.remove(index); 
            ptrs.add(index, temp);
        }

    }
}