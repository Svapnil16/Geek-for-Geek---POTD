//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Main {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = sc.nextLine();
            Scanner ss = new Scanner(input);

            while (ss.hasNextInt()) {
                arr.add(ss.nextInt());
            }

            Node head = new Node(arr.get(0));
            Node tail = head;

            for (int i = 1; i < arr.size(); ++i) {
                tail.next = new Node(arr.get(i));
                tail = tail.next;
            }

            Solution ob = new Solution();
            Node[] result = ob.alternatingSplitList(head);
            printList(result[0]);
            printList(result[1]);
        }

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java
/*
struct Node
{
    int data;
    struct Node* next;

    Node(int x){
        data = x;
        next = NULL;
    }

};
*/

class Solution {
    // Function to append a new node with newData at the end of a linked list
    Node[] alternatingSplitList(Node head) {
        // code here
        Node[] ans=new Node[2];
        Node temp=head;
        Node even =new Node(0);
        Node odd =new Node(0);
        Node evenhead=even;
        Node oddhead=odd;
        int i=0;
        while(temp!=null){
            if(i%2==1){
                even.next=new Node(temp.data);
                even=even.next;
                temp=temp.next;
            }
            else{
                odd.next=new Node(temp.data);
                odd=odd.next;
                temp=temp.next;
            }
            i++;
        }
        evenhead=evenhead.next;
        oddhead=oddhead.next;
        ans[0]=oddhead;
        ans[1]=evenhead;
        return ans;
    }
}
