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
	        			if (agenda.findContact(name)==-1) {
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
				        	System.out.println("Please, enter the address.");
				        	String address = sc.nextLine();
				        	if (dni.equals("unknown")) {
					        	agenda.addContact(new Contact(new Person(name,age,weight), mobileNum, address));
				        	}else{
					        	agenda.addContact(new Contact(new Person(name,age,weight,dni), mobileNum, address));
				        	}
				        	System.out.println("The contact was added successfully.");
	        			}else {
	        				System.out.println("You have already added the contact of this person.");
	        			}
			            break;
			        case 2:
			        	if (agenda.getContacts().size()!=0) {
				        	System.out.println("Please, enter the name of the contact you want to modify.");
				        	String modName=sc.next();
		        			sc.nextLine();
				        	if (agenda.findContact(modName)!=-1) {
				        			System.out.print("Please, enter the new mobile number.");
				        			int mobileNum = sc.nextInt();
				        			// Jump the token '/n'
				        			sc.nextLine();
				        			System.out.print("Please, enter the new address.");
				        			String address = sc.nextLine();
				        			//agenda.getContact(agenda.findContact(modName)).setMobileNum(mobileNum);
				        			//agenda.getContact(agenda.findContact(modName)).setAddress(address);
				        			agenda.modifyContact(agenda.findContact(modName),new Contact (agenda.getContact(agenda.findContact(modName)).getPerson(),mobileNum, address));
						        	System.out.println("The contact was modified successfully.");
				        			break;
				        	}else{
				        			System.out.println("The contact you want to modify does not exist.");
				        	}
			        	}else {
			        		System.out.println("There is not any contact in your agenda.");
			        	}
			            break;
			        case 3:
			        	if (agenda.getContacts().size()!=0) {
				        	System.out.println("Please, enter the name of the contact you want to view.");
				        	String viewName=sc.next();
		        			sc.nextLine();
				        	if (agenda.findContact(viewName)!=-1) {
				        		System.out.println(agenda.getContact(agenda.findContact(viewName)).getPerson().toString()+ " " + agenda.getContact(agenda.findContact(viewName)).getMobileNum() + " " + agenda.getContact(agenda.findContact(viewName)).getAddress());
				        	}
				        	else {
				        		System.out.println("The contact you want to view does not exist.");
				        	}
			        	}else {
			        		System.out.println("There is not any contact in your agenda.");
			        	}
			            break;
			        case 4:
			        	if (agenda.getContacts().size()!=0) {
				        	System.out.println("Please, enter the name of the contact you want to remove.");
				        	String removeName=sc.next();
		        			sc.nextLine();
				        	if (agenda.findContact(removeName)!=-1) {
				        		agenda.removeContact(agenda.findContact(removeName));
						       	System.out.println("The contact was removed successfully.");
				        	}
				        	else {
				        		System.out.println("The contact you want to remove does not exist.");
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