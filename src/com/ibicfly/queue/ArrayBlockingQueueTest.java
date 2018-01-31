package com.ibicfly.queue;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueTest {
public static void main(String[] args) throws InterruptedException {
	ArrayBlockingQueue arrayBlockingQueue=new ArrayBlockingQueue(10);
	for(int i=0;i<10;i++)
		arrayBlockingQueue.add(i);
	int num=arrayBlockingQueue.size();
	for(int i=0;i<num;i++)
		System.out.println(arrayBlockingQueue.poll());
}
}
