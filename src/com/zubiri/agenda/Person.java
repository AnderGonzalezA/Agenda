/**
* The Person program implements a class that
* can be used to create person objects which will hold people's personal information and their methods.
*
* @author  Ander Gonzalez
* @version 1.0
* @since   2018-11-12 
*/
package com.zubiri.agenda;

import java.util.Random;
public class Person {
	private String name="";
	private int age=0;
	private int weight=0;
	private String dni="";
	/**

     * Person default constructor

     */
	public Person() {}
	/**

     * Person full constructor

     * @param name The name
     * @param age The age
     * @param weight The weight
     * @param dni The dni

     */
	public Person(String name,int age,int weight,String dni) {
		this.name=name;
		this.dni=dni;
		if (age>0&&age<100) {
			this.age=age;
		}else {
			System.out.println("You didn't enter a real age.");
		}
		if (weight>0&&weight<150) {
			this.weight=weight;
		}else {
			System.out.println("You didn't enter a real weight.");
		}
	}
	/**

     * Person constructor that which will assign the dni randomly.

     * @param name The name
     * @param age The age
     * @param weight The weight

     */
	public Person(String name,int age,int weight) {
		this.name=name;
		if (age>0&&age<100) {
			this.age=age;
		}
		if (weight>0&&weight<150) {
			this.weight=weight;
		}
		this.dni=dniByDefault();
	}
	/**

     * Name setter method

     * @param name The new name

     */
	public void setName(String name) {
		this.name=name;
	}
	/**

     * Name getter method

     * @return The name

     */
	public String getName() {
		return name;
	}
	/**

     * Age setter method

     * @param age The new age

     */
	public void setAge(int age) {
		if (age>0&&age<100) {
			this.age=age;
		}
	}
	/**

     * Age getter method

     * @return The age

     */
	public int getAge() {
		return age;
	}
	/**

     * Weight setter method

     * @param weight The new weight

     */
	public void setWeight(int weight) {
		if (weight>0&&weight<150) {
			this.weight=weight;
		}
	}
	/**

     * Weight getter method

     * @return The weight

     */
	public int getWeight() {
		return weight;
	}
	/**

     * Dni setter method

     * @param dni The new dni

     */
	public void setDni(String dni) {
		if (dni.length()==9) {
			boolean letterFound=false;
			for (int i=0;i<9;i++) {
				if (dni.charAt(i)!='0'||dni.charAt(i)!='1'||dni.charAt(i)!='2'||dni.charAt(i)!='3'||dni.charAt(i)!='4'||dni.charAt(i)!='5'||dni.charAt(i)!='6'||dni.charAt(i)!='7'||dni.charAt(i)!='8'||dni.charAt(i)!='9') {
					letterFound=true;
					break;
				}
			}
			if (!letterFound) {
				if (dni.charAt(8)!='0'&&dni.charAt(8)!='1'&&dni.charAt(8)!='2'&&dni.charAt(8)!='3'&&dni.charAt(8)!='4'&&dni.charAt(8)!='5'&&dni.charAt(8)!='6'&&dni.charAt(8)!='7'&&dni.charAt(8)!='8'&&dni.charAt(8)!='9') {
					this.dni=dni;
				}
			}
		}
	}
	/**

     * Dni getter method

     * @return The dni

     */
	public String getDni() {
		return dni;
	}
	/**

     * Method that returns if the person has an ideal weight or not

     * @return If the person has an ideal true, otherwise false

     */
	public boolean idealWeight() {
		if (this.weight==70) {
			return true;
		}
		return false;
	}
	/**

     * Method that returns the information of the person

     * @return The information of the person

     */
	public String toString() {
		return name + " " + String.valueOf(age) + " " + String.valueOf(weight) + " " + dni;
	}
	/**

     * Method that returns a random dni

     * @return A random dni

     */
	public String dniByDefault(){
		String dniString=String.valueOf(new Random().nextInt(9));
		for (int i=0;i<8;i++) {
			dniString=dniString+String.valueOf(new Random().nextInt(9));
		}
		String alphabet="abcdefghijklmnopqrstuvWxyz";
		return dniString+String.valueOf(alphabet.charAt(new Random().nextInt(alphabet.length()))).toUpperCase();
	}
	/**

     * Method that returns if the person has is adult or not

     * @return If the person is adult true, otherwise false

     */
	public boolean isAdult() {
		if (age>=18) {
			return true;
		}
		return false;
	}
}