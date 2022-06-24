// The following program is to find the number of character types in the given string ""$$ Welcome to 2nd Class of Automation $$"
package week2.day1;

public class FindTypes {
	public static void main(String[] args) {
// Declaring String and integers
		String test = "$$ Welcome to 2nd Class of Automation $$";
		int letter = 0, space = 0, num = 0, specialChar = 0;
// Converting string to character array
		char[] a = test.toCharArray();
// Traversing through each character of the String
		for (int i=0;i<test.length();i++) {
// Checking whether the character is letter and adding a count to letter, if the character is a letter
			if(Character.isLetter(a[i])) {
				letter=letter+1;
			}
// Checking the character is a space character and adding a count to space, if the character is a space character
			else if(Character.isSpaceChar(a[i])) {
				space=space+1;
			}
// Checking the character is a number and adding a count to num, if the character is a number
			else if(Character.isDigit(a[i])) { 
				num=num+1;
			}
// Checking whether the character is not a String,space character or a number and adding a count to special character
			else {
				specialChar=specialChar+1;
			}
		}
// Printing our String and counts of each types - Letter, Spaces, Numbers and Special Characters
		System.out.println("String is: "+test);
		System.out.println("Letters: " +letter);
		System.out.println("Spaces: " +space);
		System.out.println("Numbers: "+num);
		System.out.println("Special Characters: " +specialChar);
	}
}
