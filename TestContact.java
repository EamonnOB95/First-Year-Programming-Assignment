//
// Éamonn Ó Briain
//
// 13131389
//

public class TestContact {
	public static void main(String [] args) {

		System.out.println("Testing started...");
		printLine();

		// Tests for first constructor
		System.out.println("First constructor:");
		printLine();
		Contact c1 = new Contact("Cody");
		System.out.println("getName method: " + c1.getContactName());
		c1.setContactName("Skywalker");
		System.out.println("\ntoString method: ");
		System.out.println(c1.toString());
		printLine();

		// Tests for second constructor
		System.out.println("Second constructor:");
		printLine();
		Contact c2 = new Contact("Asoko", "+35322454985154");
		System.out.println("getPhoneNumber method: " + c2.getPhoneNumber());
		c2.setPhoneNumber("+353515451");
		System.out.println("\ntoString method: ");
		System.out.println(c2.toString());
		printLine();

		// Tests for third constructor
		System.out.println("Third constructor:");
		printLine();
		Contact c3 = new Contact("Yoda", "0868225515", "example@gmail.com");
		System.out.println("getEmailAddress method: " + c3.getEmailAddress());
		c3.setEmailAddress("secondexample@gmail.com");
		System.out.println("\ntoString method: ");
		System.out.println(c3.toString());
		printLine();

		// Tests for fourth constructor
		System.out.println("Fourth constructor:");
		printLine();
		Contact c4 = new Contact("Old Ben Kenobi", "+00442155215155", "tatooinepastries@ihatesand.com", 
			"Tatooine Pastries", "@TatooinePastries", "@TatooinePastries");
		System.out.println("getFacebookHandle method: " + c4.getFacebookHandle());
		System.out.println("getInstagramHandle method: " + c4.getInstagramHandle());
		System.out.println("getTwitterHandle method: " + c4.getTwitterHandle());
		c4.setTwitterHandle("@example");
		c4.setInstagramHandle("@example");
		c4.setFacebookHandle("FacebookFacebookFacebookFacebook");
		System.out.println("\ntoString method: ");
		System.out.println(c4.toString());
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