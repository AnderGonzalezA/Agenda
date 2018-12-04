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
					+ "4 Remove a contact.\n"
					+ "5 Check if a contact's weight is ideal.\n"
					+ "6 Check if a contact is an adult.");
			// Check that the user enters a number
			if (sc.hasNextInt()) {
				int option = sc.nextInt();
				// Jump the token '/n'
				sc.nextLine();
			    switch ( option ) {
			        case 1:
			        	System.out.println("Please, enter the name.");
	        			String name = sc.next();
	        			sc.nextLine();
			        	System.out.println("Please, enter the age.");
			        	int age = sc.nextInt();
			        	sc.nextLine();
			        	System.out.println("Please, enter the weight.");
			        	int weight = sc.nextInt();
			        	System.out.println("Please enter the dni if you know it, otherwise leave it empty.");
			        	String dni = sc.next().trim();
			        	sc.nextLine();
			        	if (dni.equals("\n")) {
			        		Person newPerson = new Person(name,age,weight);
				        	System.out.println("Please, enter the mobile number.");
				        	int mobileNum = sc.nextInt();
				        	sc.nextLine();
				        	System.out.println("Please, enter the address");
				        	String address = sc.nextLine();
				        	agenda.addPerson(newPerson, mobileNum, address);
			        	}else {
			        		Person newPerson = new Person(name,age,weight,dni);
				        	System.out.println("Please, enter the mobile number.");
				        	int mobileNum = sc.nextInt();
				        	sc.nextLine();
				        	System.out.println("Please, enter the address");
				        	String address = sc.nextLine();
				        	agenda.addPerson(newPerson, mobileNum, address);
			        	}
			        	System.out.println("The contact was added successfully.");
			            break;
			        case 2:
			        	System.out.println("Please, enter the name of the contact");
			        	String modName=sc.next();
			        	for (int i=0;i<agenda.getPersonArrayList().size();i++) {
			        		
			        	}
			        	System.out.println();
			            break;
			        case 3:
			        	System.out.println("Please, enter a positive number");
	        			// Open a loop
			        	boolean finished3=false;
			        	while (finished3==false) {
			        		// Check that the user enters a number
			        		if (sc.hasNextInt()) {
			        			// Create a string object with the number's value
			        			String usernumber = sc.next();
								// Jump the token '/n'
								sc.nextLine();
					        	// Check that the number is positive
					        	if (Integer.parseInt(usernumber)>0) {
					        		// Print the inverted number
					        		for (int index=usernumber.length()-1;index>=0;index--) {
					        			System.out.print(usernumber.charAt(index));
					        		}
					        		System.out.print("\n");
					        		// Get out of the loop
					        		finished3 = true;
					        	}
					        	else {
					        		System.out.println("That is not a positive number, try it again");
					        	}
			        		}
			        		else {
			        			System.out.println("That is not a positive number, try it again");
			        			// Jump the token '/n'
			        			sc.nextLine();
			        			
			        		}
			        	}
			            break;
			        case 4:
			        	System.out.println("Please, enter a binary number");
	        			// Open a loop
			        	boolean finished4 = false;
			        	while (finished4==false) {
			        		// Check that the user enters a number
			        		if (sc.hasNextInt()) {
			        			// Create a string object with the number's value
			        			String usernumber = sc.next();
								// Jump the token '/n'
								sc.nextLine();
			        			// Check that all the digits are 1 or 0
			        			int index = 0;
			        			boolean encountered = false;
			        			while ((index < usernumber.length()) && (!encountered)) {
			        				if (usernumber.charAt(index)!='0' && usernumber.charAt(index)!='1') {
			        					encountered = true;
			        				}
			        			index++;
			        		    }
			        		    if (!encountered) {
			        		    	// Make the conversion from binary to decimal
			        				double decimal=0;
			        				int index2=0;
			        				for (int index3=usernumber.length()-1;index3>=0;index3--) {
			        					decimal=decimal+ Character.getNumericValue(usernumber.charAt(index3))*Math.pow(2,index2);
					        			index2++;
					        		}
			        				System.out.println("The binary number given's decimal value is: " + decimal);
			        				// Get out of the loop
			        				finished4 = true;
			        			}
			        			else {
			        				System.out.println("That is not a binary number, try it again");
			        			}
			        		}
			        		else {
			        			System.out.println("That is not a binary number, try it again");
			        			// Jump the token '/n'
			        			sc.nextLine();
			        		}
			        	}
			            break;
			        case 5:
			        	System.out.println("Please, enter a sentence.");
			        	// Create a string object with the user's sentence
	        			String sentence = sc.nextLine();
	        			// Open a loop
			        	boolean finished5=false;
			        	while (finished5==false) {
			        		System.out.println("Please, enter a letter.");
			        		// Create a string object with the user's letter
			        		String letter = sc.next();
							// Jump the token '/n'
							sc.nextLine();
			        		// Check that the user entered just a character
							if(letter.length()<2) {
								// Create an array with the sentence's words
								String[] words =sentence.split(" ");
								// Count how many words of the sentence start with the letter of the user
								int counter=0;
								for (String word: words) {
								    if (letter.charAt(0)==word.charAt(0)) {
								        counter++;
								    }
								}
								System.out.println(counter + " words of the sentence given start with the letter " + letter + ".");
								// Get out of the loop
								finished5 = true;
							}
							else {
								System.out.println("Please, enter just a letter.");
							}
			        	}
			            break;
			        case 6:
			        	System.out.println("Please, enter a sentence.");
			        	// Create a string object with the user's sentence
	        			String sentence2 = sc.nextLine();
	        			// Open a loop
			        	boolean finished6=false;
			        	while (finished6==false) {
			        		System.out.println("Please, enter a letter.");
			        		// Create a string object with the user's letter
			        		String letter = sc.next();
							// Jump the token '/n'
							sc.nextLine();
			        		// Check that the user entered just a character
							if(letter.length()<2) {
								// Create an array with the sentence's words
								String[] words =sentence2.split(" ");
								// Count how many words of the sentence end with the letter of the user
								int counter=0;
								for (String word: words) {
								    if (letter.charAt(0)==word.charAt(word.length()-1)) {
								        counter++;
								    }
								}
								System.out.println(counter + " word(s) of the sentence given end with the letter " + letter + ".");
								// Get out of the loop
								finished6 = true;	
							}
							else {
								System.out.println("Please, enter just a letter.");
							}
			        	}
			            break;
			        case 7:
			        	System.out.println("Please, enter a word.");
			        	// Create a string object with the user's token
			        	String word = sc.next();
						// Jump the token '/n'
						sc.nextLine();
			        	// Define a variable with the value of the word's last index number
			        	int index2 = word.length()-1;
			        	int index=0;
			        	// Control if the word's inverted characters are equal
			        	boolean encountered= false;
			        	while (!encountered && index2>=0) {
			        		if (word.charAt(index)!=word.charAt(index2)) {
			        			encountered=true;
			        		}
			        		index++;
			        		index2--;
			        	}
	        			if (encountered) {
	        	        	System.out.println("The word given isn't palindrome");
	        			}
	        			else {
	        	        	System.out.println("The word given is palindrome");
	        			}
			            break;
			        default:
			        	System.out.println("You didn't select a possible option");
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