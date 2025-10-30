// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		int currentValue = Integer.parseInt(args[0]);
		System.out.println(currentValue);
		double rate = Double.parseDouble(args[1]);
		double n = Double.parseDouble(args[2]);
		double yield = currentValue*(Math.pow((1+rate/100),n));
		System.out.println("After "+(int)n+ " years, $"+currentValue+" saved at "+ rate+"% will yield $"+(int)(yield));
	}
}