//
// Éamonn Ó Briain
//
// 13131389
//

public class TestContactList {
	public static void main(String [] args) {

		// Initialise a contact list with four contacts
		ContactList contacts = new ContactList(7);
		Contact c1 = new Contact("John");
		Contact c2 = new Contact("Tommy", "+3534555972");
		Contact c3 = new Contact("Bishop", "777666555", "example@gmail.com");
		Contact c4 = new Contact("Tiernan", "4811321988", "secondexample@gmail.com",
			"FacebookPage", "InstagramPage", "TwitterPage");
		Contact c5 = new Contact("Fred", "12345");
		Contact c6 = new Contact("Gene");
		Contact c7 = new Contact("Wilder");
		Contact c8 = new Contact("Billy");

		System.out.println("Testing Starting...");
		printLine();

		// Tests for add method
		System.out.println("Tests for add method:");
		printLine();
		System.out.println(contacts.add(c1));
		System.out.println(contacts.add(c2));
		System.out.println(contacts.add(c3));
		System.out.println(contacts.add(c4));
		System.out.println(contacts.add(c5));
		System.out.println(contacts.add(c6));
		System.out.println(contacts.add(c7));
		System.out.println(contacts.add(c8));
		printLine();

		// Tests for nameFor method
		System.out.println("Tests for nameFor method:");
		printLine();
		System.out.println(contacts.nameFor("777666555") + "<");
		System.out.println(contacts.nameFor("777666555", 3) + "<");
		System.out.println(contacts.nameFor("666") + "<");
		printLine();

		// Tests for numberFor method
		System.out.println("Tests for numberFor method:");
		printLine();
		System.out.println(contacts.numberFor("Tommy") + "<");
		System.out.println(contacts.numberFor("hop") + "<");
		System.out.println(contacts.numberFor("Johnny") + "<");
		printLine();

		// Tests for compareTo method
		System.out.println("Tests for compareTo method:");
		printLine();
		System.out.println(c1.compareTo(c2));
		System.out.println(c1.compareTo(c3));
		System.out.println(c1.compareTo(c4));
		printLine();

		// Sort ContactList
		contacts.sort();
		
		// Tests for display method
		System.out.println("Tests for display method:");
		printLine();
		contacts.display();
		printLine();
		System.out.println("'Bishop' removed: " + contacts.remove("Bishop"));
		System.out.println("'Tommy' removed: " + contacts.remove("Tommy"));
		printLine();
		contacts.display();
		printLine();
		System.out.println("1st Contact removed: " + contacts.remove(0));
		System.out.println("3rd Contact removed: " + contacts.remove(1));
		printLine();
		contacts.display();
		printLine();
		System.out.println("'Rudolph' removed: " + contacts.remove("Rudolph"));
		System.out.println("11th Contact removed: " + contacts.remove(10));
		printLine();
		contacts.display();
		printLine();

		System.out.println("Testing complete!");
	}

	public static void printLine() {
		for(int i=0; i<50; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}