package queueinterface;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeEx {

	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedBlockingDeque<>();
		deque.add(1);
		deque.add(2);
		deque.add(3);
		deque.add(4);
		deque.add(5);
		deque.add(6);
		
		for(Integer element: deque) {
			System.out.println(element);

	}
		System.out.println("************");
		deque.addFirst(0);
		
		deque.removeLast();
		
		for(Integer element: deque) {
			System.out.println(element);
		
	}
	}

}
