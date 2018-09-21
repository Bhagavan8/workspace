package threads;
public class ThreadMain {
	public static void main(String[] args) {
	ThreadResults t1 =new ThreadResults();
	Thread t2 =new Thread(t1);
	t2.start();
	}
}