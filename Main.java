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
			//Dequeue logic
			else if(inputLines.get(i).contains("ENQUEUE")){
				if(lnl.isEmpty()){
					String data = inputLines.get(i).replace("ENQUEUE ", "");
					lnl.insertAt(0, data);
				}
				else{
					//BUG
					String data = inputLines.get(i).replace("ENQUEUE ", "");
					lnl.insertAt(lnl.size, data);
				}
				
				
			}
			else if(inputLines.get(i).contains("DEQUEUE")){
				if(lnl.isEmpty()){
					System.out.println("Empty");
				}
				else{
					String n = lnl.get(0);
					String data = lnl.dequeue();
					System.out.println(data);
				}
			}
		}
		
	}

}
