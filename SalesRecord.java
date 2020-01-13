public class SalesRecord
{
	//Instance Variables
	private String date;
	private int sales;
	
	//Constructor
	public SalesRecord(String date, int sales)
	{
		this.date=date; // updating the instance variable
		this.sales=sales; // updating the instance variable
	}
	
	//Getter & Setter Methods for
	// getting & setting the state of the instance variables
	public String getDate()
	{
		return date; // getting the state of the instance variable
	}

	public void setDate(String date)
	{
		this.date = date; //setting the state of the instance variable
	}

	public int getSales()
	{
		return sales; //getting the state of the instance variable
	}

	public void setSales(int sales)
	{
		this.sales = sales; //setting the state of the instance variable
	}
	
	@Override
	public String toString()
	{
		return "Date: " + date + ", " + "Sales: " + sales;
	}
}
