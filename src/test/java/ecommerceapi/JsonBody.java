package ecommerceapi;

public class JsonBody {
	
	public static String getLoginBody()
	{
		return "{\r\n"
				+ "    \"userEmail\": \"gouravjawale28@gmail.com\",\r\n"
				+ "     \"userPassword\": \"Test@1234\"\r\n"
				+ "}";
	}
	
	
	public static String getPlaceOrderBody(String prdid)
	{
		return "{\"orders\": [\r\n"
				+ "        {\r\n"
				+ "        \"country\": \"India\", \r\n"
				+ "        \"productOrderedId\" : \""+prdid+"\"\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}";
	}

}
