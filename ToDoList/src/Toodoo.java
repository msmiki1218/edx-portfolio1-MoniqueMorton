import java.util.ArrayList;
import java.util.Scanner;

public class Toodoo {
	
	static ArrayList<String> taskArray = new ArrayList<String>();
	private static Scanner scan;
	
	public static void addTask() {
		String task = getNewTask();
		
		taskArray.add(task);
		
		System.out.println("\nNew item \"" + task + "\" added to your list!");
		System.out.println();			
	}
	
	public static String getNewTask() {
		System.out.println("\nPlease enter a new item for your list:");
		scan = new Scanner(System.in);
		String item = scan.nextLine();
			
		return item;
	}
	
	public static void taskList() {
		// let us print all the values available in list
	      for (String value : taskArray) {
	         System.out.println((taskArray.indexOf(value)+1) +".  " + value);
	      }
	      System.out.println();
	}
	
	public static void removeTask(String complete) {
		//complete msg and remove from task from list
		taskArray.remove(complete);
		
		System.out.println("\nMarking \"" + complete + "\" as completed.  Great job.");
	}
	
	public static void completeTask() {
		 System.out.println("\nWhich task would you like to mark complete?");
		 taskList();
		 System.out.print("\nMake your selection: ");
		 
		 scan = new Scanner(System.in);
		 int index = Integer.parseInt(scan.nextLine())-1;
		 
		 removeTask(taskArray.get(index));
	 }

}
