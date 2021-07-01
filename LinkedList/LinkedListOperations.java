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
    void midElement()
    {
        if(start == null)
        {
            System.out.println("Linked List Empty");
            return;
        }
        Node<T> slow = start;
        Node<T> fast = start;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("MID Data:"+slow.data);
    }

    void KthElementFromEnd(int k)
    {
        if(start == null)
        {
            System.out.println("Linked List Empty");
            return;
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
            System.out.println("12. Exit");
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

                default:
                        break outer;
            }
        }
        sc.close();        
    }

}
