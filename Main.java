import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		LinkedList206<Double> lnl = new LinkedList206<>();
		ArrayList<Double> arl = new ArrayList<>();
		final int n = 50000;
		long time = System.currentTimeMillis();
		//EVENT ONE
		System.out.println("Adding items to Linked list...");
		for (int i=0; i<n; i++) {
			lnl.addNode(Math.random());
		}
		long diff = System.currentTimeMillis() - time;
		System.out.println("That took " + diff + " ms");
		time = System.currentTimeMillis();
		System.out.println("Adding items to arraylist...");
		for (int i=0; i<n; i++) {
			arl.add(Math.random());
		}
		diff = System.currentTimeMillis() - time;
		System.out.println("That took " + diff + " ms");
		System.out.println("all done");

		//EVENT TWO
		System.out.println("Deleting items from linked list...");
		time = System.currentTimeMillis();
		for (int i=0; i<n; i++) {
			lnl.removeAt(lnl.size-1);
		}
		diff = System.currentTimeMillis() - time;
		System.out.println("That took " + diff + " ms");
		System.out.println("Deleting items from array list...");
		time = System.currentTimeMillis();
		for (int i=0; i<n; i++) {
			arl.remove(arl.size()-1);
		}
		diff = System.currentTimeMillis() - time;
		System.out.println("That took " + diff + " ms");

		//EVENT THREE
		System.out.println("Adding items to the front of a linked list");
		time = System.currentTimeMillis();
		for (int i=0; i<n; i++) {
			lnl.insertAt(0, Math.random());
		}
		diff = System.currentTimeMillis() - time;
		System.out.println("That took " + diff + " ms");

		System.out.println("Adding items to the front of an arraylist...");
		time = System.currentTimeMillis();
		for (int i=0; i<n; i++) {
			arl.add(0, Math.random());
		}
		diff = System.currentTimeMillis() - time;
		System.out.println("That took " + diff + " ms");

		//EVENT FOUR
		System.out.println("Deleting items from the front of linked list...");
		time = System.currentTimeMillis();
		for (int i=0; i<n; i++) {
			lnl.removeAt(0);
		}
		diff = System.currentTimeMillis() - time;
		System.out.println("That took " + diff + " ms");
		System.out.println("Deleting items from the front of an arraylist");
		time = System.currentTimeMillis();
		for (int i=0; i<n; i++) {
			arl.remove(0);
		}
		diff = System.currentTimeMillis() - time;
		System.out.println("That took " + diff + " ms");
	}

}
