// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]);
		int hundreds = n / 100 ;
		int tens = n / 10 % 10;
		int ahadot = n % 10;
		System.out.println(hundreds +" Hundreds, " + tens + " tens, and " + ahadot + " ones");
	}
}
