import java.util.Scanner;

public class Menu {
	boolean exit;
	private Scanner input;
	
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.runMenu();
	}
	
	public void runMenu() {
		printHeader();
		while(!exit) {
			printMenu();
			int choice = getInput();
			performAction(choice);
		}
	}
	
	private void printHeader() {
		System.out.println("+***********************************+");
		System.out.println("|          Welome to Your           |");
		System.out.println("|            To-Do List!            |");
		System.out.println("+***********************************+");
	}
	
	private void printMenu() {
		System.out.println("\nPlease make a selection");
		System.out.println("1.  add an item to your to-do list");
		System.out.println("2.  mark an item on your to-do list complete");
		System.out.println("3.  print your to-do list");
		System.out.println("0.  end program");
	}
	
	private int getInput() {
		input = new Scanner(System.in);
		int choice = -1;
		while (choice < 0 || choice > 3) {
			try {
				System.out.print("\nEnter your choice: ");
				choice = Integer.parseInt(input.nextLine());
				
			}
			catch (NumberFormatException e) {
				System.out.println("\nInvalid choice.  Please try again");
			}
		}
		return choice;
	}
	
	private void performAction(int choice) {
		switch(choice) {
			case 0:
				exit = true;
				System.out.println("\nThank you for using our application.");
				break;
			case 1:
				Toodoo.addTask();
				break;
			case 2:
				Toodoo.completeTask();
				break;
			case 3:
				Toodoo.taskList();
				break;
			default:
				System.out.println("An unknown error has occured.");
		}
	}

}
