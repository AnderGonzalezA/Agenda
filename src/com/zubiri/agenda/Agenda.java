/**
* The Agenda program implements a class that
* can be used to create agenda objects which will hold contact's information.
*
* @author  Ander Gonzalez
* @version 1.0
* @since   2018-11-12
*/
package com.zubiri.agenda;

import java.util.ArrayList;
public class Agenda {
	private ArrayList<Contact> contactArrayList = new ArrayList<Contact>();
	public ArrayList<Contact> getContactArrayList(){
		return contactArrayList;
	}
	public void setContactArrayList(ArrayList<Contact> contactArrayList){
		this.contactArrayList=contactArrayList;
	}
	/**

     * Method that adds a new contact to the ArrayList "contactArrayList"

     * @param person The person whose contact will be added
     * @param mobileNum The mobile number of the contact
     * @param address The address of the contact

     */
	public void addContact(Person person,int mobileNum,String address) {
		boolean contactFound=false;
		for (int i=0;i<contactArrayList.size();i++) {
			if (contactArrayList.get(i).getPerson().getName().equals(person.getName())) {
				contactFound=true;
				break;
			}
		}
		if (!contactFound) {
			contactArrayList.add(new Contact(person,mobileNum,address));
		}
	}
	/**

     * Method that modifies a contact from the ArrayList "contactArrayList"

     * @param name The name of the person whose contact's information will be modified 
     * @param mobileNum The new mobile number of the contact
     * @param address The new address of the contact

     */
	public void modifyContact(String name,int mobileNum,String address) {
		for (int i=0;i<contactArrayList.size();i++) {
			if (contactArrayList.get(i).getPerson().getName().equals(name)) {
				contactArrayList.get(i).setMobileNum(mobileNum);
				contactArrayList.get(i).setAddress(address);
				break;
			}
		}
	}
	/**

     * Method that Removes a contact from the ArrayList "contactArrayList"

     * @param name The name of the person whose contact will be removed

     */
	public void removeContact(String name) {
		for (int i=0;i<contactArrayList.size();i++) {
			if (contactArrayList.get(i).getPerson().getName().equals(name)) {
				contactArrayList.remove(i);
				break;
			}
		}
	}
	/**

     * Method that returns the information of a contact from the ArrayList "contactArrayList"

     * @param name The name of the person whose contact's information will be returned
     * @return 

     */
	public String showContact(String name){
		String information = "";
		for (int i=0;i<contactArrayList.size();i++) {
			if (contactArrayList.get(i).getPerson().getName().equals(name)){
				information=information+contactArrayList.get(i).getPerson().toString()+" "+contactArrayList.get(i).getMobileNum()+" "+contactArrayList.get(i).getAddress();
				break;
			}
		}
		return information;
	}
}