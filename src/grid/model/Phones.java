package grid.model;

public class Phones 
{
private String phones;

public String getPhones()
{
	return phones;
}

public void setPhones(String phones)
{
	this.phones = phones;
}

public String toString()
{
	String description = "The current phone model is " + phones;
	return description;
}

public Phones()
{
	this.phones = "Phone";
}
}
