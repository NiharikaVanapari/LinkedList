package linkedlist;

public class Node
{
    public static void main(String[] args)
	 {
       System.out.println("Welcome to Data Structure");
       
       LinkedList linkedList = new LinkedList();
	   linkedList.insert(56);
	   linkedList.insert(30);
	   linkedList.insert(40);
	   linkedList.insert(70);
	   linkedList.print();
	   linkedList.deleteElement(40);
	   linkedList.insert(70);
	   linkedList.print();
	   linkedList.printsize();
      
	}
}