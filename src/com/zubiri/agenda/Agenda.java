/**
* The Agenda program implements a class that
* can be used to create agenda objects which will hold contact's information.
*
* @author AnderGonzalez
* @version 1.0
* @since 2018-11-12
*/
package com.zubiri.agenda;

import java.util.ArrayList;
public class Agenda {
	private ArrayList<Contact> contacts = new ArrayList<Contact>();
	/**

     * Agenda default constructor

     */
	public Agenda() {}
	/**

     * Contacts getter method

     * @return The contact ArrayList

     */
	public ArrayList<Contact> getContacts(){
		return contacts;
	}
	/**

     * Contacts setter method

     * @param contacts The new contacts ArrayList

     */
	public void setContacts(ArrayList<Contact> contacts){
		this.contacts=contacts;
	}
	/**

     * Method that adds a new contact to the ArrayList "contacts"

     * @param contact The contact that will be added

     */
	public int findContact(String name) {
		for (int i=0;i<contacts.size();i++) {
			if (contacts.get(i).getPerson().getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	public void addContact(Contact contact) {
		contacts.add(contact);
	}
	/**

     * Method that modifies a contact from the ArrayList "contactArrayList"

     * @param name The name of the person whose contact's information will be modified 
     * @param mobileNum The new mobile number of the contact
     * @param address The new address of the contact

     */
	public void modifyContact(int index,Contact contact) {
		contacts.set(index,contact);
	}
	/**

     * Method that Removes a contact from the ArrayList "contactArrayList"

     * @param name The name of the person whose contact will be removed

     */
	public void removeContact(int index) {
		contacts.remove(index);
	}
	/**

     * Method that returns the a contact from the ArrayList "contactArrayList"

     * @param name The name of the person whose contact's information will be returned
     * @return The information of the person whose name is entered as an argument

     */
	public Contact getContact(int index){
		return contacts.get(index);
	}
}