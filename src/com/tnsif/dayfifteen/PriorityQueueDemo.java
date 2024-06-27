package com.tnsif.dayfifteen;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		pQueue.add(50);
		pQueue.add(100);
		pQueue.add(20);
		pQueue.add(90);
		pQueue.add(60);
		pQueue.add(80);
		pQueue.add(70);
		System.out.println(pQueue);
		while(!pQueue.isEmpty()) {
			System.out.println( pQueue.remove());
		}
	}

}
