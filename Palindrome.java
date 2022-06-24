// The following program is to check whether the given string "Madam" is Palindrome or not
package week2.day1;

public class Palindrome {
public static void main(String[] args) {
// Declaring Strings and integers
	String word = "Madam"; String rev = ""; 
	int i = word.length(); int j;
// Iterating the String in reverse and storing the reversed String in "rev" 
	for (j=i-1;j>=0;j--) {
		rev = rev + word.charAt(j);
		}
// Checking the String "word" is equals to reversed String "rev" while ignoring the Letter cases
	if (word.equalsIgnoreCase(rev))
// Printing the result
	{
		System.out.println("The word: "+'"'+word+'"' +" is a Palindrome.");
	}
	else {
		System.out.println("The word: "+'"'+word+'"' +"is not a Palindrome.");
	}

}
}
