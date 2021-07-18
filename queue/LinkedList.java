/**
 * Purpose: Implementation of Linked List Data Structure
 * @author Ganesh Gavhad
 * Version 1.0
 * @param <T>
 */
package com.bridgelabz.queue;

public class LinkedList <T> {
		Node<T> head;

		public void add(T data) {
			Node<T> newNode = new Node<>();
			newNode.data = data;
			if (head == null) {
				head = newNode;
			
			} else {
				Node<T> node = head;
				while (node.next != null) {
					node = node.next;
				}
				node.next = newNode;
			}
		}
		
		/**
		 * For Removing Top Most Value/Data from Stack and queue.
		 * @return
		 */
	
		public void pop() {
			if (head == null)
				System.out.println("\n" + "is Empty!");
			else {
				Node<T> temp = head;
				System.out.printf("Dequeue element: %d", head.data);
				System.out.println();
				head = temp.next;
			}
		}
		
		/**
		 * Printing The Data Of Node till next equal to null
		 */
		
		public void show() {
			Node<T> node = head;
			if(head==null) {
				System.out.println(" is Empty");
			}
			while (node.next != null) {
				System.out.println(node.data);
				node = node.next;
			}
			System.out.println(node.data);
		}
	}



