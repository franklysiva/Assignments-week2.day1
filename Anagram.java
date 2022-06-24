// Following Program is to check whether the two strings "stops" and "potss" are anagrams or not.

package week2.day1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
	
	// String literals declared	
		String word1 = "stops";
		String word2 = "potss";
	// Checking words length are equal to rule out non-equal length words are not anagrams 
	
		if (word1.length() == word2.length()) {
	
	// Converting strings to character arrays
			
			char[] text1 = word1.toCharArray();
			char[] text2 = word2.toCharArray();
			
	// Sorting arrays
			
			Arrays.sort(text1);
			Arrays.sort(text2);
			
	// Checking whether the sorted arrays have equal values
			
			if (text1.equals(text2));

	// Printing our results 
			{
				System.out.println("Both " + '"' + word1 + '"' + " and " + '"' + word2 + '"' + " are anagrams.");
			}
		}
			else {
				System.out.println("Both " + '"' + word1 + '"' + " and " + '"' + word2 + '"' + " are not anagrams.");
			}
	}
}
