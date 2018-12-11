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
	public void modifyContact(String name,int mobileNum,String address) {
		for (int i=0;i<contactArrayList.size();i++) {
			if (contactArrayList.get(i).getPerson().getName().equals(name)) {
				contactArrayList.get(i).setMobileNum(mobileNum);
				contactArrayList.get(i).setAddress(address);
				break;
			}
		}
	}
	public void removeContact(String name) {
		for (int i=0;i<contactArrayList.size();i++) {
			if (contactArrayList.get(i).getPerson().getName().equals(name)) {
				contactArrayList.remove(i);
				break;
			}
		}
	}
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