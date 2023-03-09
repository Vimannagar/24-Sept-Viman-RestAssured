package basics;

public class JsonBody {
	
	
	public static String getBody()
	{
		return "{\r\n"
				+ "\"dashboard\": {\r\n"
				+ "\"purchaseAmount\": 910,\r\n"
				+ "\"website\": \"www.abc.com\"\r\n"
				+ "},\r\n"
				+ "\"courses\": [\r\n"
				+ "{\r\n"
				+ "\"title\": \"Selenium Python\",\r\n"
				+ "\"price\": 50,\r\n"
				+ "\"copies\": 6\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"title\": \"Cypress\",\r\n"
				+ "\"price\": 40,\r\n"
				+ "\"copies\": 4\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"title\": \"RPA\",\r\n"
				+ "\"price\": 45,\r\n"
				+ "\"copies\": 10\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "}";
	}
	
	
	public static String createUserBody()
	{
		return "{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"username\": \"testuser\",\r\n"
				+ "  \"firstName\": \"Adam\",\r\n"
				+ "  \"lastName\": \"Simons\",\r\n"
				+ "  \"email\": \"adam.simons@gmail.com\",\r\n"
				+ "  \"password\": \"Test@1234\",\r\n"
				+ "  \"phone\": \"9876543210\",\r\n"
				+ "  \"userStatus\": 0\r\n"
				+ "}";
	}

}
