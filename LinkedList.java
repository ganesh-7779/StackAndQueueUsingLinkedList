/**
 * Purpose: Implementation of Linked List Data Structure
 * @author Ganesh Gavhad
 * Version 1.0
 * @param <T>
 */
package com.bridgelabz;

public class LinkedList <T> {
		Node<T> head;

		/**
		 * @param Node data added at Start
		 */
		public void AtStart(T data) {
			Node<T> node =new Node<>();
			node.data=data;
			node.next=head;
			head=node;
		}
		/**
		 * For Removing Top Most Value/Data from Stack and queue.
		 * @return
		 */
	
		public void pop() {
			if (head == null)
				System.out.println("\n" + "Stack is Empty!");
			else {
				Node<T> temp = head;
				System.out.printf("Deleted element: %d", head.data);
				System.out.println();
				head = temp.next;
			}
		}
		/**
		 * For Find First Element In Stack
		 */
		public T peak() {
			if(head != null)
				return head.data;
			else {
				System.out.println("Stack is Empty");
			}
	  
			return null;
		}

		/**
		 * Printing The Data Of Node till next equal to null
		 */
		public void show() {
			Node<T> node = head;
			if(head==null) {
				System.out.println("Stack is Empty");
			}
			while (node.next != null) {
				System.out.println(node.data);
				node = node.next;
			}
			System.out.println(node.data);
		}
	}



