package threads;

public class ThreadDemo {
	public static void main(String[] args) {
		System.out.println("Task1");
		System.out.println("Task2");
		Task t =new Task();
		Thread T =new Thread(t);
		T.start();
		System.out.println("task3");
	}

}
