package homework_6;

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoItems_Structure {
	static String listName;
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<ToDoItem> toDoItemArr = new ArrayList<ToDoItem>();
	
	public ToDoItems_Structure() {
		editFiveThinks();
		listName = listName();
		what_ToDo();
		what_ToDo_Case(scanner.next());
		
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
							"5. Display completed To-Do Items\n" +
							"6. Close all program press 'q'");
	}
	
	static void what_ToDo_Case(String option) {
		String optiont = option;
		switch (optiont) {
		case "1":
			scanner.nextLine();
			insertToDo();
			what_ToDo();
			what_ToDo_Case(scanner.next());
		    break;
		case "2":
			scanner.nextLine();
			System.out.print("What task mark as comlited: ");
			markTask_AsComplited(scanner.nextLine());
			what_ToDo();
			what_ToDo_Case(scanner.next());
			break;
		case "3":
			displayAllItems();
			what_ToDo();
			break;
		case "4":
			displayUncomplete_Items();
			what_ToDo();
			break;
		case "5":
			System.out.println("Friday");
			break;
		case "q":
			break;
		default:
			System.out.println("Insert right type!");
			what_ToDo();
			what_ToDo_Case(scanner.next());
	
		}
	}
	
	static ToDoItem insertToDo() {
		boolean quit = true;
		do {
			String title;
			String priority;
			System.out.println("Add item #" + (toDoItemArr.size() + 1) + " to list '" + listName + "'");
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
	
	static void markTask_AsComplited(String task) {
		boolean flag = false;
		
		for (int i = 0; i < toDoItemArr.size(); i++) {
			if (toDoItemArr.get(i).getDescription().equals(task)) {
				ToDoItem changeDoItem = new ToDoItem();
				changeDoItem.setDescription(toDoItemArr.get(i).getDescription());
				changeDoItem.setPriority(toDoItemArr.get(i).getPriority());
				changeDoItem.setCompleted(true);
				toDoItemArr.set(i, changeDoItem);
				flag = true;
			}
		}
		if (flag == false) {
			System.out.print(   "Task don't find!\n" +
								"Insert one more time correct task or 'q' to go main MENU...");
			task = scanner.nextLine();
			if (task.equals("q")) {
				what_ToDo();
				what_ToDo_Case(scanner.next());
			} else {
				markTask_AsComplited(task);
			}
		}
		
	}
	
	static void editFiveThinks() {

		ToDoItem soom = new ToDoItem();
		soom.setDescription("Iznest miskasti");
		soom.setPriority(Priority.HIGH);
		soom.setCompleted(true);
		
		ToDoItem soom1 = new ToDoItem();
		soom1.setDescription("Paçst");
		soom1.setPriority(Priority.MEDIUM);

		ToDoItem soom2 = new ToDoItem();
		soom2.setDescription("Aziet uz veikalu");
		soom2.setPriority(Priority.HIGH);
		
		ToDoItem soom3 = new ToDoItem();
		soom3.setDescription("Nolikt gulçt bçrnu");
		soom3.setPriority(Priority.LOW);
		
		ToDoItem soom4 = new ToDoItem();
		soom4.setDescription("Izmazgât veïu");
		soom4.setPriority(Priority.MEDIUM);
		soom4.setCompleted(true);

		toDoItemArr.add(soom);
		toDoItemArr.add(soom1);
		toDoItemArr.add(soom2);
		toDoItemArr.add(soom3);
		toDoItemArr.add(soom4);
	}
	
	static void displayAllItems() {

		for (int i = 0; i < toDoItemArr.size(); i++) {
			String complite = (toDoItemArr.get(i).getCompleted() == true) ? "Yes" : "No";
			System.out.print("Description: " + toDoItemArr.get(i).getDescription());
			System.out.print(", Priority: " + toDoItemArr.get(i).getPriority());
			System.out.print(", Completed: " + complite);
			System.out.println();
		}
	}

	static void displayUncomplete_Items() {
		
		for (int i = 0; i < toDoItemArr.size(); i++) {
			String complite = "No";
			if (toDoItemArr.get(i).getCompleted() == false) {
				System.out.print("Description: " + toDoItemArr.get(i).getDescription());
				System.out.print(", Priority: " + toDoItemArr.get(i).getPriority());
				System.out.print(", Completed: " + complite);
				System.out.println();
			}
		}
	}
	
}
