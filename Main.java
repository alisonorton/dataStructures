import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		//Linked List for storing data
		LinkedList206<String> lnl = new LinkedList206<>();

		//Looping through scanner input
		while(s.hasNext()){
			System.out.println("In WHILE loop");
			String num = "";
			String action = s.next();
			if(action.equals("***")){
				break;
			}
			else if(action.equals("PUSH")){
				num = s.next();
				lnl.addNode(num);
				System.out.println(num);
			}
			else if(action.equals("POP")){
				//BUG
				lnl.removeAt(lnl.size-1);
			}
			else if(action.equals("CLEAR")){
				lnl.clear();
			}
			else if(action.equals("PRINT")){
				lnl.printAll();
			}
		}

		lnl.printAll();
		
	}

}
