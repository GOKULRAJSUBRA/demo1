package methods;

public class Snippet extends TestCustomException1 {
	 // main method  
	    public static void main(String args[])  
	    {  
	        try  
	        {  
	            // calling the method   
	            validate(13);  
	        }  
	        catch (InvalidAgeException ex)  
	        {  
	            System.out.println("Caught the exception");  
	    
	            // printing the message from InvalidAgeException object  
	            System.out.println("Exception occured: " + ex);  
	        }  
	  
	        System.out.println("rest of the code...");    
	    }  
	}  


