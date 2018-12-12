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
	private ArrayList<Contact> contactArrayList = new ArrayList<Contact>();
	/**

     * Agenda default constructor

     */
	public Agenda() {}
	/**

     * Contact ArrayList getter method

     * @return The contact ArrayList

     */
	public ArrayList<Contact> getContactArrayList(){
		return contactArrayList;
	}
	/**

     * Contact ArrayList setter method

     * @param contactArrayList The new contact ArrayList

     */
	public void setContactArrayList(ArrayList<Contact> contactArrayList){
		this.contactArrayList=contactArrayList;
	}
	/**

     * Method that adds a new contact to the ArrayList "contactArrayList"

     * @param contact The contact that will be added

     */
	public void addContact(Contact contact) {
		boolean contactFound=false;
		for (int i=0;i<contactArrayList.size();i++) {
			if (contactArrayList.get(i).getPerson().getName().equals(contact.getPerson().getName())) {
				contactFound=true;
				break;
			}
		}
		if (!contactFound) {
			contactArrayList.add(contact);
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
     * @return The information of the person whose name is entered as an argument

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