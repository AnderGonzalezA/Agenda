/**
* The Contact program implements a class that
* can be used to create contact objects which will hold people's mobile number and address and their methods.
*
* @author AnderGonzalez
* @version 1.0
* @since 2018-11-12 
*/
package com.zubiri.agenda;

public class Contact {
	private Person person;
	private int mobileNum = 0;
	private String address = "";
	private Note note= new Note("");
	//private boolean favorite = false;
	/**

     * Contact constructor

     * @param person The person whose contact will be created
     * @param mobileNum The mobile number
     * @param address The address

     */
	public Contact(Person person, int mobileNum, String address){
		this.person=person;
		this.mobileNum=mobileNum;
		this.address=address;
	}
	/**

     * Person getter method

     * @return The person of the contact

     */
	public Person getPerson() {
		return this.person;
	}
	/**

     * Mobile number getter method

     * @return The mobile number

     */
	public int getMobileNum() {
		return this.mobileNum;
	}
	/**

     * Address getter method

     * @return The address

     */
	public String getAddress() {
		return this.address;
	}
	/**

     * Note getter method

     * @return The note

     */
	public Note getNote() {
		return this.note;
	}
	/**

     * Person setter method

     * @param person The new person of the contact

     */
	public void setPerson(Person person) {
		this.person=person;
	}
	/**

     * Mobile number setter method

     * @param mobileNum The new mobile number

     */
	public void setMobileNum(int mobileNum) {
		this.mobileNum=mobileNum;
	}
	/**

     * Address setter method

     * @param address The new address

     */
	public void setAddress(String address) {
		this.address=address;
	}
	/**

     * Note setter method

     * @param note The new note

     */
	public void setNote(Note note) {
		this.note=note;
	}
	/*public void setFavorite(boolean favorite) {
		this.favorite=favorite;
	}
	public boolean getFavorite(){
		return this.favorite;
	}*/
}
