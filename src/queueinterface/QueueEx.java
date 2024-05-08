package queueinterface;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class QueueEx {

	public static void main(String[] args) {
		
Queue<Integer> queue = new LinkedBlockingDeque<>();
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);                                     // LinkedBlockingQueue
		queue.add(5);
		queue.add(6);
		queue.add(7);
		
		for(Integer num: queue) {
			System.out.println(num);
		}
		
		System.out.println("****************");
		
		
		Queue<String> queue1 = new ArrayBlockingQueue<String>(6);
		
		queue1.add("Yugandhar");
		queue1.add("Dharani");
		queue1.add("Yugandhar");                          //ArrayBlockingQueue
		queue1.add("Dharani");
		queue1.add("Yugandhar");
		queue1.add("Dharani");
		
		for(String names: queue1) {
			System.out.println(names);
		}
	}

}
