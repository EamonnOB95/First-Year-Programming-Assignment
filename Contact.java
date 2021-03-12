//
// Éamonn Ó Briain
//
// 13131389
//

public class Contact implements Comparable<Contact> {

	// Instance variables
	private String contactName = "";
	private String phoneNumber = "";
	private String emailAddress = "";
	private String facebookHandle = "";
	private String instagramHandle = "";
	private String twitterHandle = "";

	// Constructor methods
	public Contact(String name) {
		this.contactName = name;
	}

	public Contact(String name, String number) {
		this.contactName = name;
		this.phoneNumber = number;
	}

	public Contact(String name, String number, String email) {
		this.contactName = name;
		this.phoneNumber = number;
		this.emailAddress = email;
	}

	public Contact(String name, String number, String email, String facebook, String instagram, String twitter) {
		this.contactName = name;
		this.phoneNumber = number;
		this.emailAddress = email;
		this.facebookHandle = facebook;
		this.instagramHandle = instagram;
		this.twitterHandle = twitter;
	}

	// Instance methods

	// Method to return display string for contact
	// Quick note: In the brief it mentions to include the \n in the return string
	// I was unsure if this meant the actual newline or you wanted to see the \n in the output using \\n.
	// I left it as the newline since part 4 didn't show a \n in the actual output and it didn't make sense
	// to me to output the \n. - Eamonn
	public String toString() {
		String returnString = "";

		// Contact Name
		if(this.contactName.isEmpty() == false) {
			returnString += String.format("%-17s: %30s\n", "Name", formatDisplayString(this.contactName));
		}
		// Phone Number
		if(this.phoneNumber.isEmpty() == false) {
			returnString += String.format("%-17s: %30s\n", "Phone Number", formatDisplayString(this.phoneNumber));
		}
		// Email Address
		if(this.emailAddress.isEmpty() == false) {
			returnString += String.format("%-17s: %30s\n", "Email Address", formatDisplayString(this.emailAddress));
		}
		// Facebook Handle
		if(this.facebookHandle.isEmpty() == false) {
			returnString += String.format("%-17s: %30s\n", "Facebook Handle", formatDisplayString(this.facebookHandle));
		}
		// Instagram Handle
		if(this.instagramHandle.isEmpty() == false) {
			returnString += String.format("%-17s: %30s\n", "Instagram Handle", formatDisplayString(this.instagramHandle));
		}
		// Twitter Handle
		if(this.twitterHandle.isEmpty() == false) {
			returnString += String.format("%-17s: %30s\n", "Twitter Handle", formatDisplayString(this.twitterHandle));
		}

		return returnString;
		
	}

	// compareTo method based on contact name.
	public int compareTo(Contact aContact) {
		return this.contactName.compareTo(aContact.getContactName());
	}

	// Private Methods

	// This method formats the string for the toString() method
	// The else part of this method has been adapted from MyToolBox.java for use in this part of the assignment.
	// Normally, I would simply call the centre method from that class.
	// However, since I'm only submitting the two files for this assignment, I wanted to make sure it
	// works in it's own right.
	private String formatDisplayString(String displayString) {
		if(displayString.length() > 30) {
			return displayString.substring(0, 27) + "...";
		}
		else {
			String spaces = "                                     ";
		
			// Calculate spaces to add on either side
			int leftSpaces = (30 - displayString.length()) / 2;
			int rightSpaces = leftSpaces;
			
			// If there is an odd number of spaces to add, extra space goes on the LHS
			if(((30 - displayString.length()) % 2) == 1) {
				leftSpaces += 1;
			}

			// Add spaces
			displayString = spaces.substring(0, leftSpaces) + displayString + spaces.substring(0, rightSpaces);

			return displayString;
		}
	}

	// Getter and setter methods
	// Contact Name
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactName() {
		return this.contactName;
	}
	// Phone Number
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	// Email Address
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getEmailAddress() {
		return this.emailAddress;
	}
	// Facebook Handle
	public void setFacebookHandle(String facebookHandle) {
		this.facebookHandle = facebookHandle;
	}
	public String getFacebookHandle() {
		return this.facebookHandle;
	}
	// Instagram Handle
	public void setInstagramHandle(String instagramHandle) {
		this.instagramHandle = instagramHandle;
	}
	public String getInstagramHandle() {
		return this.instagramHandle;
	}
	// Twitter Handle
	public void setTwitterHandle(String twitterHandle) {
		this.twitterHandle = twitterHandle;
	}
	public String getTwitterHandle() {
		return this.twitterHandle;
	}
}