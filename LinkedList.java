package com.datastructurs.algorithms;

 class LinkedList {
	 Node head;
	 class Node{
		 int data;
		 Node next;
		 Node(int d){data = d; next=null;}
	 }
	 void pairWiseSwap(){
		 Node temp = head;
		 while (temp!=null &&temp.next!=null){
			 int k = temp.data;
			 temp.data=temp.next.data;
			 temp.next.data=k;
			 temp = temp.next.next;
		 }
	 }
	 
	 public void push(int new_data){
		 Node new_node= new Node(new_data);
		 new_node.next=head;
		 head=new_node;
	 }
	 void printList(){
		 Node temp =head;
		 while(temp!=null){
			 System.out.print(temp.data + " ");
			 temp=temp.next;
			 }
		 System.out.println();
	 }
	 public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		llist.push(9);
		llist.push(8);
		llist.push(7);
		llist.push(6);
		llist.push(5);
		//llist.push(4);
		
        System.out.println("Linked List before calling pairWiseSwap() ");
        llist.printList();
        
        llist.pairWiseSwap();
        
        System.out.println("Linked List after calling pairWiseSwap() ");
        llist.printList();
	}

}
