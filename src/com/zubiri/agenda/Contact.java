package com.zubiri.agenda;

public class Contact {
	private Person person;
	private int mobileNum = 0;
	private String address = "";
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