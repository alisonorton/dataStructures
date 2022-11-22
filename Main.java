import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		//Linked List for storing data
		LinkedList206<String> lnl = new LinkedList206<>();

		ArrayList<String> inputLines = new ArrayList<>();
		String currentLine = s.nextLine();
		inputLines.add(currentLine);

		while(!currentLine.contains("***")){
			currentLine = s.nextLine();
			inputLines.add(currentLine);
			
		}
		s.close();

		//Checking to see if we stored all the data
		for(int i = 0; i < inputLines.size(); i++){
			System.out.println(inputLines.get(i));
		}

		System.out.println("Program Output\n");

		for(int i = 0; i < inputLines.size(); i++){
			if(inputLines.get(i).contains("PUSH")){
				String data = inputLines.get(i).replace("PUSH ", "");
				lnl.addNode(data);
			}
			else if (inputLines.get(i).contains("POP")){
				if(lnl.isEmpty()){
					System.out.println("Pop Empty");
				}
				else{
					String data = lnl.pop();
					System.out.println(data);
				}
			}
			else if (inputLines.get(i).contains("CLEAR")){
				if(lnl.isEmpty()){
					System.out.println("Clear Empty");
				}
				else{
					lnl.clear();
				}
				
			}
			else if (inputLines.get(i).contains("PRINT")){
				lnl.printAll();
			}
		}
		
	}

}
