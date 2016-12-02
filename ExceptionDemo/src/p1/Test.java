package p1;

//1. create your own exception
class InvalidBookingException extends Exception
{
	public InvalidBookingException()
	{
		System.out.print("Booking cannot be done");
	}
}

public class Test {
	int total,x;
	//2. Specify the situation under which we expect custom exception
	public void checkTotal()throws InvalidBookingException
	{
		total=5;
		x=6;
		if(x>total)
		{
			throw new InvalidBookingException();
		}
	}

	public static void main(String[] args)throws InvalidBookingException {
		//3. How to Handle custom Exception
		Test t1= new Test();
		try
		{
			t1.checkTotal();
		}
		catch(InvalidBookingException ex)
		{
			System.out.println(" as available Tickets are less");
			throw ex; // Rethrowing the exception
		}
		System.out.println("Example on custom Exception ended");
	}

}
 








