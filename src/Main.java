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
					+ "5 View all the contacts ordered.\n"
					+ "6 Add a contact to favorites.\n"
					+ "7 View the favorite contacts.\n"
					+ "8 Add or modify the note of a contact.\n"
					+ "0 Close the agenda.");
			// Check that the user enters a number
			if (sc.hasNextInt()) {
				int option = sc.nextInt();
				// Jump the token '/n'
				sc.nextLine();
			    switch ( option ) {
			        case 1: /*New contact*/
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
				        	sc.nextLine();
				        	System.out.println("Please enter the dni if you know it, otherwise enter 'unknown' and I will assign a random one to him/her.");
				        	String dni = sc.next();
				        	sc.nextLine();
			        		System.out.println("Now you will enter the missing information about the contact.");
				        	System.out.println("Please, enter the mobile number.");
				        	int mobileNum = sc.nextInt();
				        	sc.nextLine();
				        	System.out.println("Please, enter the address.");
				        	String address = sc.nextLine();
				        	if (dni.equals("unknown")) {
					        	Person newPerson = new Person(name,age,weight);
					        	Contact newContact = new Contact(newPerson, mobileNum, address);
						        agenda.addContact(newContact);
				        	}else {
				        		Person newPerson = new Person(name,age,weight,dni);
					        	Contact newContact = new Contact(newPerson, mobileNum, address);
						        agenda.addContact(newContact);
				        	}
				        	System.out.println("The contact was added successfully.");
	        			}else {
	        				System.out.println("You have already added the contact of this person.");
	        			}
			            break;
			        case 2: /*Modify contact*/
			        	if (agenda.getContacts().size()!=0) {
				        	System.out.println("Please, enter the name of the contact you want to modify.");
				        	String modName=sc.next();
		        			sc.nextLine();
		        			int index = agenda.findContact(modName);
				        	if (index!=-1) {
				        			System.out.print("Please, enter the new mobile number.");
				        			int mobileNum = sc.nextInt();
				        			// Jump the token '/n'
				        			sc.nextLine();
				        			System.out.print("Please, enter the new address.");
				        			String address = sc.nextLine();
				        			Contact newContact = agenda.getContact(index);
				        			newContact.setMobileNum(mobileNum);
				        			newContact.setAddress(address);
				        			// Contact newContact = new Contact (agenda.getContact(index).getPerson(),mobileNum, address);
				        			agenda.modifyContact(index,newContact);
						        	System.out.println("The contact was modified successfully.");
				        			break;
				        	}else{
				        			System.out.println("The contact you want to modify does not exist.");
				        	}
			        	}else {
			        		System.out.println("There is not any contact in your agenda.");
			        	}
			            break;
			        case 3:/*View contact*/
			        	if (agenda.getContacts().size()!=0) {
				        	System.out.println("Please, enter the name of the contact you want to view.");
				        	String viewName=sc.next();
		        			sc.nextLine();
		        			int index = agenda.findContact(viewName);
				        	if (index!=-1) {
				        		System.out.println(agenda.getContact(index).getPerson().toString()+ " " + agenda.getContact(index).getMobileNum() + " " + agenda.getContact(index).getAddress() + " " + agenda.getContact(index).getNote().getText());
				        	}
				        	else {
				        		System.out.println("The contact you want to view does not exist.");
				        	}
			        	}else {
			        		System.out.println("There is not any contact in your agenda.");
			        	}
			            break;
			        case 4: /*remove*/
			        	if (agenda.getContacts().size()!=0) {
				        	System.out.println("Please, enter the name of the contact you want to remove.");
				        	String removeName=sc.next();
		        			sc.nextLine();
		        			int index = agenda.findContact(removeName);
				        	if (index!=-1) {
				        		agenda.removeFavoriteContact(agenda.getContact(index));
				        		agenda.removeContact(index);
						       	System.out.println("The contact was removed successfully.");
				        	}
				        	else {
				        		System.out.println("The contact you want to remove does not exist.");
				        	}
			        	}else {
			        		System.out.println("There is not any contact in your agenda.");
			        	}
			            break;
			        case 5: /*view all ordered*/
			        	if (agenda.getContactsOrdered().size()!=0) {
				        	for (int i=0;i<agenda.getContactsOrdered().size();i++) {
				        		System.out.println(agenda.getContactsOrdered().get(i).getPerson().toString()+ " " + agenda.getContactsOrdered().get(i).getMobileNum() + " " + agenda.getContactsOrdered().get(i).getAddress() + " " + agenda.getContactsOrdered().get(i).getNote().getText());
				        	}
			        	}else {
			        		System.out.println("There is not any contact in your agenda.");
			        	}
			        	break;
			        case 6: /*add favorite contact*/
			        	if (agenda.getContacts().size()!=0) {
				        	System.out.println("Please, enter the name of the contact you want to add to favorites.");
				        	String favName=sc.next();
		        			sc.nextLine();
		        			int index = agenda.findContact(favName);
				        	if (index!=-1) {
				        		agenda.addFavoriteContact(agenda.getContact(index));
						       	System.out.println("The favorite contact was added successfully.");
				        	}
				        	else {
				        		System.out.println("The contact you want to add to favorites does not exist.");
				        	}
			        	}else {
			        		System.out.println("There is not any contact in your agenda.");
			        	}
			        	break;
			        case 7: /* view favorite contacts*/
			        	if (agenda.getFavoriteContacts().size()!=0) {
				        	for (int i=0;i<agenda.getFavoriteContacts().size();i++) {
				        		System.out.println(agenda.getFavoriteContacts().get(i).getPerson().toString()+ " " + agenda.getFavoriteContacts().get(i).getMobileNum() + " " + agenda.getFavoriteContacts().get(i).getAddress());
				        	}
			        	}else {
			        		System.out.println("There is not any favorite contact in your agenda.");
			        	}
			        	break;
			        case 8: /* add/modify a note*/
			        	if (agenda.getContacts().size()!=0) {
				        	System.out.println("Please, enter the name of the contact that you want to add or modify the note.");
				        	String noteName=sc.next();
		        			sc.nextLine();
		        			int index = agenda.findContact(noteName);
				        	if (index!=-1) {
				        		System.out.println("Please, enter the note.");
				        		Note note = new Note(sc.nextLine());
				        		agenda.getContact(index).setNote(note);
				        		System.out.println("The note was added/modified successfully.");
				        	}
				        	else {
				        		System.out.println("The contact that you want to add/modify the note does not exist.");
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