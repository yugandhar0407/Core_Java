package queueinterface;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueEx1 {

	public static void main(String[] args) {
		Queue<Integer> queue2 = new ArrayBlockingQueue<>(6);

		queue2.add(1);
		queue2.add(2);
		queue2.add(3);
		queue2.add(4);
		queue2.add(5);

		for (Integer num : queue2) {
			System.out.println(num);
		}

		System.out.println("******************");

		queue2.remove(3);

		for (Integer num : queue2) {
			System.out.println(num);
		}

		System.out.println("*************");
		queue2.add(3);
		queue2.add(6);

		for (Integer num : queue2) {
			System.out.println(num);
		}
		System.out.println("*************");
		queue2.poll();

		for (Integer num : queue2) {
			System.out.println(num);
		}
		System.out.println("*************");

		queue2.peek();
		for (Integer num : queue2) {
			System.out.println(num);
		}

	}

}
