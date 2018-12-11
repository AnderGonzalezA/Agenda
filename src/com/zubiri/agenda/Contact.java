/**
* The Contact program implements a class that
* can be used to create contact objects which will hold people's mobile number and address and their methods.
*
* @author  Ander Gonzalez
* @version 1.0
* @since   2018-11-12 
*/
package com.zubiri.agenda;

public class Contact {
	private Person person;
	private int mobileNum = 0;
	private String address = "";
	/**

     * Contact constructor

     * @param person The person whose contact will be created
     * @param mobileNum The mobile number of the contact
     * @param address The address of the contact

     */
	public Contact(Person person, int mobileNum, String address){
		this.person=person;
		this.mobileNum=mobileNum;
		this.address=address;
	}
	
	public Person getPerson() {
		return this.person;
	}
	public int getMobileNum() {
		return this.mobileNum;
	}
	public String getAddress() {
		return this.address;
	}
	public void setPerson(Person person) {
		this.person=person;
	}
	public void setMobileNum(int mobileNum) {
		this.mobileNum=mobileNum;
	}
	public void setAddress(String address) {
		this.address=address;
	}
}
