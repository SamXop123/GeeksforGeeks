/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int d) {
        data = d;
        next = null;
        prev = null;
    }
}
*/

class Solution {
    public Node createDLL(int arr[]) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        
        Node head = new Node(arr[0]);
        Node current = head;
        
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
        }
        
        return head;
        
    }
}