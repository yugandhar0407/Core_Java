package enumsinjava;
public enum learning{
COREJAVA(1),COLLECTIONS(2),GENERICS(3),JSPANDSERVLETS(4),MULTITHREADING(5);

public int value;

private learning(int value) {
  this.value = value;
}


public static void main(String[]args) {
	
	learning learn = learning.COREJAVA;
	
	switch(learn) {
	case COLLECTIONS:
		System.out.println("Step2: i am learning Collections");
		break;
	case COREJAVA:
		System.out.println("Step1: i am learning CoreJava");
		break;
	case GENERICS:
		System.out.println("Step3: i am learning Generics");
		break;
	case JSPANDSERVLETS:
		System.out.println("Step1: i am learning Jsp&Servlets");
		break;
	case MULTITHREADING:
		System.out.println("Step1: i am learning Multithreading");
		break;
	}
	
}

}