package com.zubiri.agenda;
import java.util.Random;
public class Person {
	private String name="";
	private int age=0;
	private int weight=0;
	private String dni="";
	public Person() {}
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
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		if (age>0&&age<100) {
			this.age=age;
		}
	}
	public int getAge() {
		return age;
	}
	public void setWeight(int weight) {
		if (weight>0&&weight<150) {
			this.weight=weight;
		}
	}
	public int getWeight() {
		return weight;
	}
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
	public String getDni() {
		return dni;
	}
	public boolean idealWeight() {
		if (this.weight==70) {
			return true;
		}
		return false;
	}
	public String toString() {
		return name + " " + String.valueOf(age) + " " + String.valueOf(weight) + " " + dni;
	}
	public String dniByDefault(){
		String dniString=String.valueOf(new Random().nextInt(9));
		for (int i=0;i<8;i++) {
			dniString=dniString+String.valueOf(new Random().nextInt(9));
		}
		String alphabet="abcdefghijklmnopqrstuvWxyz";
		return dniString+String.valueOf(alphabet.charAt(new Random().nextInt(alphabet.length())));
	}
	public boolean isAdult() {
		if (age>=18) {
			return true;
		}
		return false;
	}
}