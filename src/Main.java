import com.zubiri.agenda.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, select an option:\n");
	    boolean finished = false;
	    while (finished == false) {
			System.out.println("1 Add a new contact.\n"
					+ "2 Modify a contact.\n"
					+ "3 View a contact's information.\n"
					+ "4 Remove a contact.\n"
					+ "0 Close the agenda.");
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
	        			sc.nextLine();
	        			boolean contactFound=false;
	        			for (int i=0;i<agenda.getContactArrayList().size();i++) {
	        				if (agenda.getContactArrayList().get(i).getPerson().getName().equals(name)) {
	        					contactFound=true;
	        					break;
	        				}
	        			}
	        			if (!contactFound) {
				        	System.out.println("Please, enter the age.");
				        	int age = sc.nextInt();
				        	sc.nextLine();
				        	System.out.println("Please, enter the weight.");
				        	int weight = sc.nextInt();
				        	System.out.println("Please enter the dni if you know it, otherwise enter 'unknown' and I will assign a random one to him/her.");
				        	String dni = sc.next();
			        		System.out.println("Now you will enter the missing information about the contact.");
				        	System.out.println("Please, enter the mobile number.");
				        	int mobileNum = sc.nextInt();
		        			sc.nextLine();
				        	if (dni.equals("unknown")) {
					        	System.out.println("Please, enter the address.");
					        	String address = sc.nextLine();
					        	agenda.addContact(new Contact(new Person(name,age,weight), mobileNum, address));
				        	}else{
					        	System.out.println("Please, enter the address.");
					        	String address = sc.nextLine();
					        	agenda.addContact(new Contact(new Person(name,age,weight,dni), mobileNum, address));
				        	}
				        	System.out.println("The contact was added successfully.");
	        			}else {
	        				System.out.println("You have already added the contact of this person.");
	        			}
			            break;
			        case 2:
			        	if (agenda.getContactArrayList().size()!=0) {
				        	System.out.println("Please, enter the name of the contact you want to modify.");
				        	String modName=sc.next();
		        			sc.nextLine();
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
				        		if (i==agenda.getContactArrayList().size()-1){
				        			System.out.println("The contact you want to modify does not exist.");
				        		}
				        	}
			        	}else {
			        		System.out.println("There is not any contact in your agenda.");
			        	}
			            break;
			        case 3:
			        	if (agenda.getContactArrayList().size()!=0) {
				        	System.out.println("Please, enter the name of the contact you want to view.");
				        	String viewName=sc.next();
		        			sc.nextLine();
				        	for (int i=0;i<agenda.getContactArrayList().size();i++) {
				        		if (agenda.getContactArrayList().get(i).getPerson().getName().equals(viewName)) {
				        			System.out.println(agenda.returnContact(viewName));
				        			break;
				        		}
				        		if (i==agenda.getContactArrayList().size()-1){
				        			System.out.println("The contact you want to view does not exist.");
				        		}
				        	}
			        	}else {
			        		System.out.println("There is not any contact in your agenda.");
			        	}
			            break;
			        case 4:
			        	if (agenda.getContactArrayList().size()!=0) {
				        	System.out.println("Please, enter the name of the contact you want to remove.");
				        	String removeName=sc.next();
		        			sc.nextLine();
				        	for (int i=0;i<agenda.getContactArrayList().size();i++) {
				        		if (agenda.getContactArrayList().get(i).getPerson().getName().equals(removeName)) {
				        			agenda.removeContact(removeName);
						        	System.out.println("The contact was removed successfully.");
				        			break;
				        		}
				        		if (i==agenda.getContactArrayList().size()-1){
				        			System.out.println("The contact you want to remove does not exist.");
				        		}
				        	}
			        	}else {
			        		System.out.println("There is not any contact in your agenda.");
			        	}
			            break;
			        case 0:
			        	finished=true;
			        	break;
			   	}
			}
			else {
				System.out.println("You didn't select a possible option");
				// Jump the token '/n'
				sc.nextLine();
			}
	    }
        sc.close();
	}
}