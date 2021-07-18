package com.bridgelabz.queue;

public class QueueRunner {

	public static void main(String[] args) {
		MyQueue<Integer> List = new MyQueue<Integer>();
		List.enqueue(56);
		List.enqueue(70);
		List.enqueue(30);
		List.show();
		System.out.println("Before dequeue ");
		System.out.println();
		List.dequeue();
		System.out.println("After dequeue");
		List.show();
}
}