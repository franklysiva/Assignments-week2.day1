// The following program is to reverse even words from the String "I am a Software Engineer".
package week2.day1;

public class ReverseEvenWords {
public static void main(String[] args) {
// Declaring String Literal
	String test = "I am a Software Engineer";
	String output="";
// Splitting the words and storing it in an array
	String[] a = test.split(" ");
// Iterating from zero to length of the array
	for (int i=0;i<a.length;i++ ) {
// Checking whether the string position is even or not and if it is even, storing it in a character array
		if((i+1)%2==0) {
			char[] b=a[i].toCharArray();
// Reversing the character array of even words that stored above 
			String reverse= "";
			for (int j=b.length-1;j>=0;j--) {
				reverse=reverse+b[j];
			}
// Storing the output of even words
				output = output+reverse+" ";
		}
		else {
// Storing the output of odd words
			output = output+a[i]+" ";
		}
	}
// Printing the output
	System.out.println(output);
}

}
