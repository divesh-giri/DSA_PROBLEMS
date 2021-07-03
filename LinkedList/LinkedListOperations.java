package LinkedList;

import java.util.Scanner;


/*
class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
    }
}
*/

class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
    }
}

/*
interface LinkedListOperation
{
    static void addAtEnd(){

    };
    static void print(){

    };
}
*/

class LinkedListOperation<T>{
    Node<T> start;

    void addAtEnd(Node<T> node)
    {
        if(start == null) {// List Empty
            start = node;
        }
        else{
            Node<T> temp = start;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    void addAtBeg(Node<T> node)
    {
        node.next = start;
        start = node;
    }

    void atAnyPosition(Node<T> node, int pos)
    {
        Node<T> temp = start;
        if(pos==0)
        {
            addAtBeg(node);
            return;
        }
        while(pos>1)
        {
            if(temp == null)
            {
                System.out.println("Insertion at this position not possible.");
                return ;
            }
            temp = temp.next;
            pos--;
        }
        node.next = temp.next;
        temp.next = node;
    }

    void delAtEnd()
    {
        if(start == null)
        {
            System.out.println("No element to delete");
            return;
        }

        if(start.next == null)
        {
            start = null;
            return ;
        }
        Node<T> temp = start;
        Node<T> prevTemp = start;   

        while(temp.next != null)
        {
            prevTemp = temp;
            temp = temp.next;
        }
        temp = null;
        prevTemp.next = null;
    }

    void delAtBeg()
    {
        if(start == null)
        {
            System.out.println("List is empty");
            return;
        }
        start = start.next;
    }

    void delAtPos(int pos)
    {
        if(start == null)
        {
            System.out.println("List is empty");
            return;
        }
        if(pos == 1)
        {
            delAtBeg();
            return;
        }
        Node<T> temp = start;
        while(pos>2)
        {
            temp = temp.next;
            if(temp == null)
            {
                System.out.println("Deletion not possible");
                return;
            }
            pos--;
        }
        if(temp.next == null)
        {
            System.out.println("Deletion not possible");
            return;
        }
        temp.next = temp.next.next;
    }

    void searchLL(T data)
    {
        Node<T> temp = start;
        if(temp == null)
        {
            System.out.println("Linked List is empty");
            return;
        }
        while(temp!=null)
        {
            if(temp.data == data)
            {
                System.out.println("Data found in Linked List");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Data Not found in Linked List");
    }

    void updateLL(T data, T updatedData)
    {
        Node<T> temp = start;
        if(temp == null)
        {
            System.out.println("Linked List is empty");
            return;
        }
        while(temp!=null)
        {
            if(temp.data == data)
            {
                temp.data = updatedData;
                System.out.println("Update Succesfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Data not found in Linked List");
    }
    // void midElement()
    // {
    //     if(start == null)
    //     {
    //         System.out.println("Linked List Empty");
    //         return;
    //     }
    //     Node<T> slow = start;
    //     Node<T> fast = start;
    //     while(fast!=null && fast.next!=null)
    //     {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
    //     System.out.println("MID Data:"+slow.data);
    // }
    Node<T> midElement()
    {
        if(start == null)
        {
            System.out.println("Linked List Empty");
            return null;
        }
        Node<T> slow = start;
        Node<T> fast = start;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("MID Data:"+slow.data);
        return slow;
    }

    Node<T> KthElementFromEnd(int k)
    {
        if(start == null)
        {
            System.out.println("Linked List Empty");
            return null;
        }
        Node<T> i = start;
        Node<T> j = start;
        while(k>1)
        {
            j = j.next;
            k--;
        }
        while(j.next!=null)
        {
            i = i.next;
            j = j.next;
        }
        System.out.println(i.data);
        return i;

    }

    void removeKthFromEnd(int k)
    {
        Node<T> kNode = KthElementFromEnd(k);
        Node<T> temp = start;
        while(temp.next != kNode)
        {
            temp = temp.next;
        }
        temp.next = kNode.next;
        kNode = null;
    }

    void detectLoopAndRemove()
    {
        Node<T> fast = start;
        Node<T> slow = start;
        if(fast == null)
        {
            System.out.println("Linked list empty");
            return;
        }
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                // Node<T> temp = start;
                // Node<T> curr = slow;
                // while(true)
                // {
                //     curr = slow;
                //     while(curr.next != slow && curr.next != temp)
                //     {
                //         curr = curr.next;
                //     }
                //     if(curr.next == temp)
                //     {
                //         curr.next = null;
                //         return;
                //     }
                //     temp = temp.next;
                // }
                removeLoop(slow);

            }
        }
        System.out.println("No Loop Detected.");


    }

    void removeLoop(Node<T> p1)
    {
        Node<T> p2 = p1;
        int k=1;
        while(p2.next != p1)
        {
            k++;
            p2 = p2.next;
        }
        p1 = start;
        p2 = start;
        while(k>0)
        {
            p2 = p2.next;
        }
        while(p1 != p2)
        {
            p1 = p1.next;
            p2 = p2.next;
        }
        while(p2.next != p1)
        {
            p2 = p2.next;
        }
        p2.next = null;
    }

    int size()
    {
        int count = 0;
        Node<T> temp = start;
        while(temp != null)
        {
            temp = temp.next;
            count++;
        }
        return count;
    }

    Node<T> get(int index)
    {
        int size = size();
        if(size == 0)
        {
            throw new RuntimeException("LL is empty");
        }
        if(index<0 || index>=size())
        {
            throw new RuntimeException("Index Out of BOund");
        }
        Node<T> temp = start;
        while(index>0)
        {
            temp = temp.next;
            index--;
        }
        return temp;
    }
    void reverseByData()
    {
        int size = size();
        int left = 0;
        int right = size -1;
        while(left<right)
        {
            Node<T> leftNode = get(left);
            Node<T> rightNode = get(right);
            T temp = leftNode.data;
            leftNode.data = rightNode.data;
            rightNode.data = temp;
            left++;
            right--;
        }
    }

    void reverseNodes()
    {
        Node<T> previous = start;
        Node<T> current = previous.next;
        previous.next = null;
        while(current != null)
        {
            Node<T> ahead = current.next;
            current.next = previous;
            previous = current;
            current = ahead;
        }
        start = previous;
    }

    int size(Node<T> st)
    {
        int count = 0;
        while(st != null)
        {
            st = st.next;
            count++;
        }
        return count;
    }

    Node<T> intersectionOfTwoNode(Node<T> start1, Node<T> start2)
    {
        int s1 = size(start1);
        int s2 = size(start2);
        int diff = Math.abs(s1-s2);
        if(s1>s2)
        {
            while(diff>0)
            {
                start1 = start1.next;
                diff--;
            }
        }
        else
        {
            while(diff>0)
            {
                start2 = start2.next;
            }
        }
        while(start1 != start2)
        {
            start1 = start1.next;
            start2 = start2.next;
        }
        return start1;
    }

    
    void print()
    {
        if(start == null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node<T> temp = start;
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");

    }
}

public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedListOperation<Integer> list = new LinkedListOperation<>();
        Scanner sc = new Scanner(System.in);
        outer:
        while(true){
            System.out.println("01. To add at end.");
            System.out.println("02. Add at begining");
            System.out.println("03. Add at any position");
            System.out.println("04. Delete at End");
            System.out.println("05. Delete at Begining");
            System.out.println("06. Delete at Position");
            System.out.println("07. Search Linked List");
            System.out.println("08. Updata data in Linked List");
            System.out.println("09. Print");
            System.out.println("10. Middle element of the linked list");
            System.out.println("11. Kth Element from end");
            System.out.println("12. Reverse Linked List by Node");
            System.out.println("13. Reverse Linked List by Data");
            System.out.println("14. Exit");
            int ch = sc.nextInt();
            int data,pos;
            Node<Integer> node;
            switch(ch)
            {
                case 1:
                        System.out.println("Enter element:");
                        data = sc.nextInt();
                        node = new Node<>(data);
                        list.addAtEnd(node);
                        break;
                case 2:
                        System.out.println("Enter element:");
                        data = sc.nextInt();
                        node = new Node<>(data);
                        list.addAtBeg(node);
                        break;
                case 3:
                        System.out.println("Enter element:");
                        data = sc.nextInt();
                        System.out.println("Enter Position:");
                        pos = sc.nextInt();
                        node = new Node<>(data);
                        list.atAnyPosition(node, pos);
                        break;
                case 4: list.delAtEnd();
                        break;
                case 5: 
                        list.delAtBeg();
                        break;
                case 6:
                        System.out.println("Enter Position:");
                        pos = sc.nextInt();
                        list.delAtPos(pos);
                        break;
                case 7:
                        System.out.println("Enter data element to search");
                        data = sc.nextInt();
                        list.searchLL(data);
                        break;
                case 8: System.out.println("Enter data value you want to update");
                        data = sc.nextInt();
                        System.out.println("Enter the New value");
                        int updatedData = sc.nextInt();
                        list.updateLL(data, updatedData);
                        break;
                case 9:
                        list.print();
                        break;
                case 10: list.midElement();
                        break;
                case 11: System.out.println("Enter value of K:");
                         int k = sc.nextInt();
                         list.KthElementFromEnd(k);
                         break;
                case 12: list.reverseNodes();
                         break;
                case 13: list.reverseByData();
                         break;
                default:
                        break outer;
            }
        }
        sc.close();        
    }

}
