import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		//Linked List for storing data
		LinkedList206<String> lnl = new LinkedList206<>();

		//Looping through scanner input
		while(s.hasNext()){
			String num = "";
			String action = s.next();
			if(action.equals("***")){
				break;
			}
			else if(action.equals("PUSH")){
				num = s.next();
				lnl.addNode(num);
				System.out.println("Adding: " + num);
			}
			else if(action.equals("POP")){
				System.out.println("Removing: " + num);
				if(!lnl.isEmpty()){
					//Do something
					lnl.pop();
				}
				else{
					System.out.println("EMPTY");
				}
				
				
			}
			else if(action.equals("CLEAR")){
				System.out.println("All clear!");
				lnl.clear();
			}
			else if(action.equals("PRINT")){
				lnl.printAll();
			}
		}

		lnl.printAll();
		
	}

}
