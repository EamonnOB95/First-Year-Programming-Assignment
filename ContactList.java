//
// Éamonn Ó Briain
//
// 13131389
//

import java.util.Arrays;


public class ContactList {

	// Instance Variables
	private Contact [] contacts;
	private int nextAvailablePos = 0;

	// Constructor methods
	public ContactList() {
		this.contacts = new Contact[150];
	}

	public ContactList(int capacity) {
		this.contacts = new Contact[capacity];
	}

	// Instance Methods

	// Method to add a new contact to the contact list if there is space available
	// Return true if there is space
	// Return false if there isn't
	public boolean add(Contact aContact) {
		if(this.nextAvailablePos < this.contacts.length) {
			this.contacts[this.nextAvailablePos] = aContact;
			this.nextAvailablePos++;
			return true;
		}
		return false;
	}

	// Method to search for a number in the contact list and
	// return the name of the contact with that number
	public String nameFor(String number, int startPos) {
		if(startPos >= nextAvailablePos) {
			return "";
		}
		for(int i=startPos; i<this.nextAvailablePos; i++) {
			if(number.equals(this.contacts[i].getPhoneNumber())) {
				return this.contacts[i].getContactName();
			}
		}
		return "";
	}

	// Overloaded method where a start position isn't specified
	// Method calls method of the same name with start position as 0
	public String nameFor(String number) {
		return this.nameFor(number, 0);
	}

	// Method to search for a name (or portion of a name) in the contact list
	// and return the number for that name
	public String numberFor(String name, int startPos) {
		if(startPos >= nextAvailablePos) {
			return "";
		}
		for(int i=startPos; i<this.nextAvailablePos; i++) {
			if(this.contacts[i].getContactName().contains(name)) {
				return this.contacts[i].getPhoneNumber();
			}
		}
		return "";
	}

	// Overloaded method where a start position isn't specified
	// Method calls method of the same name with start position as 0
	public String numberFor(String name) {
		return this.numberFor(name, 0);
	}

	// Method to display contents of contact list
	public void display() {
		for(int i=0; i<this.nextAvailablePos; i++) {
			System.out.println("Contact " + (i+1) + " of " + this.nextAvailablePos);
			System.out.println(this.contacts[i].toString());
		}
	}

	// Remove a contact if it's contact name matches the passed name
	// by passing it's position to the overloaded remove(int) method.
	public boolean remove(String name) {
		for(int i=0; i<this.nextAvailablePos; i++) {
			if(this.contacts[i].getContactName().equals(name)) {
				this.remove(i);
				return true;
			}
		}
		return false;
	}

	// Remove a contact based on it's position in the array.
	public boolean remove(int position) {
		if(position >= this.nextAvailablePos || position < 0) {
			return false;
		}
		for(int i=position; i<this.nextAvailablePos-1; i++) {
			this.contacts[i] = this.contacts[i+1];
		}
		this.nextAvailablePos--;
		this.contacts[this.nextAvailablePos] = null;
		return true;
	}

	public void sort() {
		Arrays.sort(this.contacts, 0, this.nextAvailablePos);
	}
}