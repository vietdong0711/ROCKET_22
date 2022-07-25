package com.vti.Backend.Exercise6.Question1;

public abstract class Phone {
	public abstract void insertContacts(String name, String phone);
	public abstract void removeContact(String name);
	public abstract void updateContact(String name, String newPhone);
	public abstract void searchContact(String name);
}
