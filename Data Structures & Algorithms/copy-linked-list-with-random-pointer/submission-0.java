/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> hm = new HashMap<>();

        Node temp = head;
        Node dummy = null;
        Node dummyHead = null;

        while (temp != null) {
            Node nNode = new Node(temp.val);

            // mapping orginal node --> new copy node
            hm.put(temp, nNode);

            if (dummy == null) {
                dummyHead = nNode;
            } else {
                dummy.next = nNode;
            }
            dummy = nNode;
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            Node copyNode = hm.get(temp);
            Node randomNode = hm.get(temp.random);
            copyNode.random = randomNode;
            temp = temp.next;
        }
        
        return dummyHead;
    }
}
