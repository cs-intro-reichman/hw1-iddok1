// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int) (Math.random()*(lim+1));
		int b = (int) (Math.random()*(lim+1));
		int c = (int) (Math.random()*(lim+1));
		System.out.println(a+", "+b+", "+c);
		int max , min , middle;
		max = Math.max(Math.max(a, b), c);
		min = Math.min(Math.min(a, b), c);
		if(max==a)
		{
			if(min==b)
				middle = c;
			else
				middle = b;	
		}
		else	
			if(max == b)
			{
				if(min == a)
				{
					middle = c;
				}
				else
					middle = a;
			}
			else
				if(min == b)
				{
					middle = a;
				}
				else
				{
					middle = b;
				}
			System.out.println(max + ", "+ middle +" "+ min);	
	}
	
}
