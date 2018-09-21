package files;

public class ChatApp {
		public static void startChat(String ip,int port){
			System.out.println("Bhagavan printing ip address");
		}
		public static void main(String[] args) {
			try{

			startChat(args[0], Integer.parseInt(args[1]));
			}
			catch(ArrayIndexOutOfBoundsException e){
			System.out.println("enter the corect port or ip address");		
			}
		}
	}
