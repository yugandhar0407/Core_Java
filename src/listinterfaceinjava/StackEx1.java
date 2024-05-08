package listinterfaceinjava;

import java.util.Stack;

public class StackEx1 {

	public static void main(String[] args) {
		Stack<String> demo = new Stack<>();

		demo.push("Yugandhar");
		demo.push("Dharani");
		demo.push("RamaLakshmi");
		demo.push("Govinarajulu");

		for (String Data : demo) {
			System.out.println(Data);
		}

		System.out.println("************");

		System.out.println(demo.peek());

		System.out.println("*************");

		if (demo.isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			System.out.println("Stack is not empty");
		}

		System.out.println("************");

		System.out.println(demo.search("Yugandhar"));

	}

}
