
class LearnException {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		int div;
		
		try
		{
			div = a/b;
		}
		catch (ArithmeticException e)
		{
			System.out.println("Received arithmetic exception");
			
		}
		

	}

}
