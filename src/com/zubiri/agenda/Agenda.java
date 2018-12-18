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
	private ArrayList<Contact> favoriteContacts = new ArrayList<Contact>();
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

     * Method that looks for the index of the contact with the name given

     * @param name The name of the contact
     * @return The index of the contact if it exists, otherwise -1

     */
	public int findContact(String name) {
		for (int i=0;i<contacts.size();i++) {
			if (contacts.get(i).getPerson().getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	/**

     * Method that adds a new contact to the ArrayList "contacts"

     * @param contact The new contact

     */
	public void addContact(Contact contact) {
		contacts.add(contact);
	}
	/**

     * Method that modifies a contact from the ArrayList "contacts"

     * @param index The index of the contact that will be modified
     * @param contact The new contact

     */
	public void modifyContact(int index,Contact contact) {
		contacts.set(index,contact);
	}
	/**

     * Method that removes a contact from the ArrayList "contacts"

     * @param index The index of the contact that will be removed

     */
	public void removeContact(int index) {
		contacts.remove(index);
	}
	/**

     * Method that returns a contact from the ArrayList "contacts"

     * @param index The index of the contact that will be returned
     * @return The contact required

     */
	public Contact getContact(int index){
		return contacts.get(index);
	}
	/**

     * Method that returns an ArrayList named "contactsOrdered", which is the ArrayList "contacts" sorted alphabetically

     * @return The ArrayList "contactsOrdered", which is the ArrayList "contacts" sorted alphabetically

     */
	public ArrayList<Contact> getContactsOrdered(){
		ArrayList<Contact> contactsOrdered = contacts;
		boolean contactsAlreadyOrdered = false;
		while (!contactsAlreadyOrdered) {
			boolean contactsMoved = false;
			for (int i=0;i<contactsOrdered.size()-1;i++) {
				Contact firstContact = contactsOrdered.get(i);
				Contact secondContact = contactsOrdered.get(i+1);
				if (firstContact.getPerson().getName().compareToIgnoreCase(secondContact.getPerson().getName())>0) {
					contactsOrdered.set(i, secondContact);
					contactsOrdered.set(i+1, firstContact);
					contactsMoved=true;
				}
			}
			if (!contactsMoved) {
				contactsAlreadyOrdered=true;
			}
		}
		return contactsOrdered;
	}
	/**

     * Favorite contacts getter method

     * @return The favorite contact ArrayList

     */
	public ArrayList<Contact> getFavoriteContacts(){
		return favoriteContacts;
	}
	/**

     * Favorite contacts setter method

     * @param favoriteContacts The new favorite contacts ArrayList

     */
	public void setFavoriteContacts(ArrayList<Contact> favoriteContacts){
		this.favoriteContacts=favoriteContacts;
	}
	/**

     * Method that adds a new contact to the ArrayList "favoriteContacts"

     * @param favContact The new favorite contact

     */
	public void addFavoriteContact(Contact favContact) {
		favoriteContacts.add(favContact);
	}
	/**

     * Method that removes a contact from the ArrayList "favoriteContacts"

     * @param remContact The favorite contact that will be removed

     */
	public void removeFavoriteContact(Contact remContact) {
		favoriteContacts.remove(remContact);
	}
}