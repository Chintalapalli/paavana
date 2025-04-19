package com.sbi;

public class Model {
	
	private String name;
	private String mail;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	@Override
	public String toString() {
		return "Model [name=" + name + ", mail=" + mail + "]";
	}
	
	public void main1() {
		System.out.println("Paavana Chintalapalli");
	}

}

class Mosel{
	public static void main(String[] args) {
		
		Model ms = new Model();
		ms.main1();
		System.out.println("Tech Mahindra");
	}
}
