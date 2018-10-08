package com.toma.tutorial;

public class Node {

	private Integer value;
	private Node next;

	public Node(Integer value) {
		this.value = value;
	}

	public Node() {
		// TODO Auto-generated constructor stub
	}

	public static Node createLinkedList(int number) {
		if(number>=0) {
			number = reverseNumber(number);
			int num = number % 10;
			number = number / 10;
			Node head = new Node(num);
			Node next = new Node();
			head.setNext(next);
			while (number > 0) {
				num = number % 10;
				number = number / 10;
				next.setValue(num);
				Node node = new Node();
				next.setNext(node);
				next = node;
			}
			return head;
		}
		return null;
	}

	public static int sumTwoLinkedLists(Node first, Node second) {
		if(first!=null && second!=null) {
			return readFromList(first)+readFromList(second);
		}
		return -1;
	}

	private static int readFromList(Node head) {
		// TODO Auto-generated method stub
		int rez = 0;
		while(head.next!=null) {
			rez=(rez+head.value)*10;
			head = head.next;		
		}
		
		return rez/10;
	}

	private static int reverseNumber(int number) {
		int reverseNumber = 0;
		while (number > 0) {
			int num = number % 10;
			reverseNumber = (reverseNumber + num) * 10;
			number = number / 10;
		}
		return reverseNumber / 10;
	}

	public static void printList(Node head) {
		while (head.next != null) {
			System.out.print(head.value);
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		printList(createLinkedList(1234));
		printList(createLinkedList(1234));
		System.out.println(sumTwoLinkedLists(createLinkedList(1977), createLinkedList(0)));
		
//		System.out.println(readFromList(createLinkedList(1234)));
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

}
