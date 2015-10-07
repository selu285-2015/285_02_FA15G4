package com.ruskin.project.server;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ContactList
{
	protected List<Contact> contacts;

	public ContactList()
	{
		this.contacts = new ArrayList<>();
	}

	public ContactList(final List<Contact> contacts)
	{
		this.contacts = contacts;
	}

	public List<Contact> getContacts()
	{
		return contacts;
	}

	public void setContacts(final List<Contact> contacts)
	{
		this.contacts = contacts;
	}

	@Override
	public String toString()
	{
		return "ContactList [contacts=" + contacts + "]";
	}
}
