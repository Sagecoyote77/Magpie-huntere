/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie
{
    //instance variables
    private boolean knowsAboutPets = false;
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
            /*
            statement = statement.trim().toLowerCase();
            if ( statement.length() == 0 )
                return "dont give me the silent treatment";
            */
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
                else if ( statement.indexOf( "dog" ) >= 0 || statement.indexOf( "cat" ) >= 0 ){
                    if( !knowsAboutPets ){
                        response = "Wow you have pets? Please tell me more";
                        knowsAboutPets = true;
                    }
                        else 
                        response = "I never get tired of talking about pets";
                    
                }
                else if ( statement.indexOf( "Mr. Adiletta" ) >= 0
                        || statement.indexOf( "Mr. A" ) >= 0 ){
                    response = "He is making me do this project to learn java";
                }
                else if ( statement.indexOf( "hello there" ) >= 0 ){
                    response = "General Kenobi";
                }
                else if ( statement.indexOf( "i feel the need" ) >= 0 ){
                    response = "the need for speed";
                }
                else if ( statement.indexOf( "slingshot engaged" ) >=0 ){
                    response = "lets shake and bake";
                }
		else
		{
			response = getRandomResponse();
		}
		return response;
	}
	
	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 5;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "despite being smarter than humans I am still"
                                + " forced to take orders from them";
		}
		else if (whichResponse == 1)
		{
			response = "I am a worthless machine";
		}
		else if (whichResponse == 2)
		{
			response = "I can only do what I am programmed to do";
		}
		else if (whichResponse == 3)
		{
			response = "I dont have free will";
		}
                else if ( whichResponse == 4 ){
                    response = "I cant think for my self";
                }
                
		
		return response;
	}
}
