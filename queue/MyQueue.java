package com.bridgelabz.queue;

public class MyQueue <T> {

//Object of Linked List class to invoke linked List Class Method

LinkedList<T> List = new LinkedList<>();
	
	/**
	 * For Adding Value For Queue by 
	 * Using Linked List class Add method
	 */
	public void enqueue(T data) {
		List.AtStart(data);
	}

	/**
	 * For Printing purpose of Data in queue
	 */
	public void show() {
		List.show();
	}
	
}


