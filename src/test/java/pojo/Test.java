package pojo;

public class Test {
	
	String name;
	
	
	public String getName()// getter 
	{
		return name;
	}
	
	public void setName(String name)//setter
	{
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		t.setName("Cesar");
		
		String returnedvalue = t.getName();
		System.out.println(returnedvalue);
		
	}
	

}
