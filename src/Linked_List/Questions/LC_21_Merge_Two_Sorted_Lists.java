package Linked_List.Questions;

import org.w3c.dom.NodeList;

public class LC_21_Merge_Two_Sorted_Lists {
    private ListNode head ;
    private ListNode tail ;

    public void insertLast(int val){
        ListNode node = new ListNode(val);
        if(head == null){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
    }

    public static LC_21_Merge_Two_Sorted_Lists mergeSort(LC_21_Merge_Two_Sorted_Lists first, LC_21_Merge_Two_Sorted_Lists second){
        ListNode f = first.head;
        ListNode s = first.head;

        LC_21_Merge_Two_Sorted_Lists merged = new LC_21_Merge_Two_Sorted_Lists();

        while(f != null && s != null){
            if(f.val < s.val){
                merged.insertLast(f.val);
                f = f.next;
            } else {
                merged.insertLast(s.val);
                s = s.next;
            }
        }

        while(f != null){
            merged.insertLast(f.val);
            f = f.next;
        }
        while(s != null){
            merged.insertLast(s.val);
            s = s.next;
        }
        return merged;
    }

    public void display() {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public class ListNode{
        int val;
        ListNode next;

        ListNode(){};
        ListNode(int val){ this.val = val; }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LC_21_Merge_Two_Sorted_Lists firstList = new LC_21_Merge_Two_Sorted_Lists();
        LC_21_Merge_Two_Sorted_Lists secondList = new LC_21_Merge_Two_Sorted_Lists();

        firstList.insertLast(1);
        firstList.insertLast(2);
        firstList.insertLast(4);
        System.out.print("first: ");
        firstList.display();

        secondList.insertLast(1);
        secondList.insertLast(3);
        secondList.insertLast(4);
        System.out.print("second: ");
        secondList.display();

        System.out.print("Merged and Sorted: ");
        LC_21_Merge_Two_Sorted_Lists ans = mergeSort(firstList, secondList);
        ans.display();
    }
}