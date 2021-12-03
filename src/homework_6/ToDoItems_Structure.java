package homework_6;

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoItems_Structure {
	static String listName;
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<ToDoItem> toDoItem = new ArrayList<ToDoItem>();
	
	public ToDoItems_Structure() {
		listName = listName();
		what_ToDo();
		what_ToDo_Case(scanner.nextInt());
		
	}
	
	
	static String listName() {
		System.out.println("Please name your To-Do list: ");
		return scanner.nextLine();
	}
	
	static void what_ToDo() {
		System.out.println( "What do you wish to do?\n" +
							"1. Add To-Do Items\n" +
							"2. Mark Task as completed\n" +
							"3. Display all To-Do Items\n" + 
							"4. Display uncompleted To-Do Items\n" +
							"5. Display completed To-Do Items");
	}
	
	static void what_ToDo_Case(int option) {
		int optiont = option;
		switch (optiont) {
		case 1:
			scanner.nextLine();
			insertToDo();
			
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
	
		}
	}
	
	static ToDoItem insertToDo() {
		boolean quit = true;
		do {
			String title;
			String priority;
			System.out.println("Add item #" + (toDoItem.size() + 1) + " to list '" + listName + "'");
			System.out.print("Enter title: ");
			title = scanner.nextLine();
			System.out.print("Enter priority: ");
			priority = scanner.nextLine();
			
			
			ToDoItem toDo_Think = new ToDoItem();
			toDo_Think.setDescription(title);
			if (priority.toUpperCase().equals("HIGH")) {
				toDo_Think.setPriority(Priority.HIGH);
			} else if (priority.toUpperCase().equals("MEDIUM")) {
				toDo_Think.setPriority(Priority.MEDIUM);
			}else if (priority.toUpperCase().equals("LOW")) {
				toDo_Think.setPriority(Priority.LOW);
			}
			System.out.print("Press anything to continue or 'q' to stop adding items");
			
			if (scanner.nextLine().equals("q")) {
				quit = false;
				return toDo_Think;
			} else {
				return insertToDo();
			}
			
			
			
		} while (quit);
	}
	
	
}
