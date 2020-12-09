package Listiterator;

class Node {
   int num;
   Node next;

   Node() {
       num = 0;
       next = null;
   }
}

class List {
   Node first;

   public List() { first = new Node(); }

   public List(int num) {
       first = new Node();
       first.num = num;
   }

   List addList(List other) {
       if ( first.next == null) first.next = other.first;
       else {
           Node temp = first;
           while(temp.next != null) temp = temp.next;
           temp.next = other.first;
       }
       return this;
   }

   List addNode(int num) {
       Node nextNode = new Node();
       nextNode.num = num;

       if (first.next == null) first.next = nextNode;
       else {
           Node temp = first;
           while (temp.next != null) temp = temp.next;
           temp.next = nextNode;
       }
       return this;
   }

   void showList() {
       Node temp = this.first;
       int i = 1;
       while (temp != null) {
           System.out.println("Node " + i + ": " + temp.num);
           temp = temp.next;
           i++;
       }
   }
}

class ListIter {

   List list;
   static Node current;

   ListIter(List l) {
       list = l;
       current = l.first;
   }

   int First() {
       return list.first.num;
   }

   int Next() {
       int n = current.num;
       current = current.next;
       return n;
   }

   boolean NotNull() {
       if (current == null) return false;
       else return true;
   }

   boolean NextNotNull() {
       if (current.next == null) return false;
       else return true;
   }
}



public class ListIterator {

   public static int sum(List l) {

       ListIter Iter = new ListIter(l);

       int sum = 0;

       while (Iter.NotNull()) {
           sum += Iter.Next();
       }

       return sum;
   }

   public static int max(List l) {

       ListIter Iter = new ListIter(l);

       int max = 0;

       while (Iter.NotNull()) {
           int flag = Iter.Next();
           if (flag > max) max = flag;
       }
       return max;
   }

   public static void main(String[] args) {

       List l1 = new List(1);
       l1.addNode(2);

       List l2 = new List(3);
       l2.addNode(4);
       l2.addNode(5);
       l2.addNode(6);

       l1.addList(l2);

       int sumResult = sum(l1);
       System.out.println(sumResult);

       int maxResult = max(l1);
       System.out.println(maxResult);

   }
}

