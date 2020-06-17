package diagram;

public class DiagramBlock {
	
	public static void main(String[] args) {
		String gender =  args[0];
		int overallHeight = 0;
		if ("female".equals(gender)) {
			int height = Integer.parseInt(args[1]);
			if (height < 170) {
				overallHeight = height + 7;
				System.out.println("I'm a " + gender + " and my height with heels is " + overallHeight);
			}else{
				overallHeight = height + 2;
				System.out.println("I'm a " + gender + " and my height with heels is " + overallHeight);
			}
		}else{
			System.out.println("I'm a " + gender + " and I don't wear heels :) ");
		}
	}
}
