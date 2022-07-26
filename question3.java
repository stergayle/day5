package training;

class CustomException extends Exception
{
	
}


public class question3 {

	
	
	public static void main(String[] args) {

		try
		{
			throw new CustomException();
		}
		catch (CustomException e)
		{
			
		}

	}

}

