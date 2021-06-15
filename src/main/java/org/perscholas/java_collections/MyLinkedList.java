package org.perscholas.java_collections;

import java.util.function.Function;

public class MyLinkedList<E> {

	
	private Node top; // the first node of the linked list
	private Node bottom; // the last node of the linked list
	private int size; // the number of nodes in the list	
		
	
	public void add(E value) {
		Node n = new Node(bottom, value);		
		if (top == null)
			top = bottom = n;
		else {
			bottom.next = n;
			bottom = n;		
		}		
		size++;
	}
	
	public boolean remove(E value) {
		boolean found = false;
		Node n = top;
		while (!found && n != null) {
			if (n.value.equals(value)) {
				if (n == top) {					
					top = n.next;
				} else {
					n.prev.next = n.next;
				}
				n.next.prev = n.prev;
				size--;
				found = true;
			} else
				n = n.next;			
		}
		return found;
	}
	
	public boolean contains(E value) {
		boolean found = false;
		Node n = top;
		while (!found && n != null) {
			if (n.value.equals(value)) 				
				found = true;
			else
				n = n.next;			
		}
		return found;
	}
	
	public int size() {
		return size;
	}
	
	public void traverse(Function<E, Boolean> method) {
		Node n = top;
		while (n != null) {
			if (!method.apply(n.value)) return;
			n = n.next;
		}
	}
	
	public void reverseTraverse(Function<E, Boolean> method) {
		Node n = bottom;
		while (n != null) {
			if (!method.apply(n.value)) return;
			n = n.prev;
		}
	}
	
	@Override
	public String toString() {
		String result = "[";
		Node curNode = top;
		while (curNode != null) {
			result += curNode.value.toString() + ", ";
			curNode = curNode.next;		
		}
		return result.substring(0,result.length()-2) + "]";
	}
	
	
	/* 
	 * The user of this class doesn't need to know about the Node class. (Encapsulation)
	 * Therefore, we declare a private nested class.
	 * */
	private class Node {
		
		// The fields have default access, so the outer class can use them.
		E value;
		Node next, prev;
		
		Node(Node prev, E value) {
			this.prev = prev;
			this.value = value;			
		}
	}
}
