import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Scanner sc = new Scanner(System.in);
	    boolean finished = false;
	    while (finished == false) {
			System.out.print("Please, select an option:\n"
					+ "1 Add a new contact.\n"
					+ "2 Modify a contact.\n"
					+ "3 View a contact's information.\n"
					+ "4 Remove a contact.");
			// Check that the user enters a number
			if (sc.hasNextInt()) {
				int option = sc.nextInt();
				// Jump the token '/n'
				sc.nextLine();
			    switch ( option ) {
			        case 1:
			        	System.out.println("First of all you will enter some information about the person of the new contact.");
			        	System.out.println("Please, enter the name.");
	        			String name = sc.next();
	        			boolean contactFound=false;
	        			for (int i=0;i<agenda.getContactArrayList().size();i++) {
	        				if (agenda.getContactArrayList().get(i).getPerson().getName().equals(name)) {
	        					contactFound=true;
	        					break;
	        				}
	        			}
	        			if (!contactFound) {
		        			sc.nextLine();
				        	System.out.println("Please, enter the age.");
				        	int age = sc.nextInt();
				        	sc.nextLine();
				        	System.out.println("Please, enter the weight.");
				        	int weight = sc.nextInt();
				        	System.out.println("Please enter the dni if you know it, otherwise enter 'unknown'.");
				        	String dni = sc.next();
			        		System.out.println("Now you will enter the missing information about the contact.");
				        	System.out.println("Please, enter the mobile number.");
				        	if (dni.equals("unknown")) {
				        		Person newPerson = new Person(name,age,weight);
					        	int mobileNum = sc.nextInt();
					        	sc.nextLine();
					        	System.out.println("Please, enter the address.");
					        	String address = sc.nextLine();
					        	agenda.addContact(newPerson, mobileNum, address);
				        	}else {
				        		Person newPerson = new Person(name,age,weight,dni);
				        		
					        	int mobileNum = sc.nextInt();
					        	sc.nextLine();
					        	System.out.println("Please, enter the address.");
					        	String address = sc.nextLine();
					        	agenda.addContact(newPerson, mobileNum, address);
				        	}
				        	System.out.println("The contact was added successfully.");
	        			}else {
	        				System.out.println("You have already added the contact of this person.");
	        			}
			            break;
			        case 2:
			        	System.out.println("Please, enter the name of the contact you want to modify.");
			        	String modName=sc.next();
			        	for (int i=0;i<agenda.getContactArrayList().size();i++) {
			        		if (agenda.getContactArrayList().get(i).getPerson().getName().equals(modName)) {
			        			System.out.print("Please, enter the new mobile number.");
			        			int mobileNum = sc.nextInt();
			        			// Jump the token '/n'
			        			sc.nextLine();
			        			System.out.print("Please, enter the new address.");
			        			String address = sc.nextLine();
			        			agenda.modifyContact(modName, mobileNum, address);
					        	System.out.println("The contact was modified successfully.");
			        			break;
			        		}
			        		else {
			        			System.out.println("The contact you want to modify does not exist.");
			        		}
			        	}
			            break;
			        case 3:
			        	System.out.println("Please, enter the name of the contact you want to view.");
			        	String viewName=sc.next();
			        	System.out.println(viewName);
			        	for (int i=0;i<agenda.getContactArrayList().size();i++) {
			        		if (agenda.getContactArrayList().get(i).getPerson().getName().equals(viewName)) {
			        			System.out.println(agenda.showContact(viewName));
			        			break;
			        		}else {
			        			System.out.println("The contact you want to modify does not exist.");
			        		}
			        	}
			            break;
			        case 4:
			        	System.out.println("Please, enter the name of the contact you want to remove.");
			        	String removeName=sc.next();
			        	for (int i=0;i<agenda.getContactArrayList().size();i++) {
			        		if (agenda.getContactArrayList().get(i).getPerson().getName().equals(removeName)) {
			        			agenda.removeContact(removeName);
			        			break;
			        		}else {
			        			System.out.println("The contact you want to remove does not exist.");
			        		}
			        	}
			            break;
			   	}
			}
			else {
				System.out.println("You didn't select a possible option");
				// Jump the token '/n'
				sc.nextLine();
			}
			// Ask if the user wants to see the menu again or not
		    System.out.println("Would you like to see the menu again?(y/n)");
		    // Open a loop
		    boolean goback = false;
		    while (goback == false) {
		    	// Create a string object with the user's token
			   	String back = sc.next();
				// Jump the token '/n'
				sc.nextLine();
			   	switch ( back ) {
			   	case "y":
			   		// Get out of the loop and print the menu again
			   		goback = true;
			   		break;
			   	case "n":
			   		// Get out of the loop and terminate the program
			   		goback = true;
			   		finished = true;
			   		break;
			   	default:
			   		// Ask for a possible value again
			   		System.out.println("Please, select a possible value(y/n)");
			   		break;
			   	}
		    }
	    }
        sc.close();
		/*Agenda agenda = new Agenda();
		Person firstPerson = new Person("Xabi", 21, 70, "12345678A");
		agenda.addPerson(firstPerson,655555555,"address");
		System.out.println(agenda.showPerson("Xabi"));
		Person secondPerson = new Person("Koldo", 18, 70, "12345678A");
		agenda.addPerson(secondPerson,655555555,"address");
		System.out.println(agenda.showPerson("Koldo"));
		agenda.modifyPerson("Koldo", 20, 72, "87654321B", 677777777, "address2");
		System.out.println(agenda.showPerson("Koldo"));
		agenda.removePerson("Xabi");
		System.out.println(agenda.showPerson("Xabi"));*/
	}
}