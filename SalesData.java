import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class SalesData
{
	//Instance Variable
	private ArrayList<SalesRecord> records;  // collection for data storage
	
	
	//Constructor
	public SalesData()
	{
		records = new ArrayList<SalesRecord>(); // collection for data storage
	}
	
	//----------------DATA STORAGE METHODS-------------------------------------
	// Local Methods that tells us how many rows in the file were read
	public String getNumberOfRecords()
	{
		
		return "Note3: Read a total of " + records.size() + " rows from the file";
	}
	
	//Local method that reads the file in the file path,
	// creates SalesModel objects and adds them to the records
	public ArrayList<SalesRecord> loadDataFromFile(String filePath) // loading data from csv file
	{
		try 
		{
			Scanner scanner = new Scanner(new FileReader(filePath));
			String line;
			SalesRecord record;
			
			scanner.nextLine(); // skipped reading the 1st line of the file
			System.out.println("\n\nNote1: tarted the file reading process");
			while(scanner.hasNextLine())
			{
				line = scanner.nextLine(); //get the line
				String [] results = line.split(","); // split on the ,
				int sales = Integer.parseInt(results[1]); // parse the results

				record = new SalesRecord(results[0], sales); //creating a record
				records.add(record); // add the record
				
			}
			System.out.println("Note2: Finished the file reading process");
			scanner.close();
		}
		catch(Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}
		return records;
	}
	

	//----------------DATA PROCESSING METHODS-------------------------------------
    
    //Stream function to calculate the max sales
	public String getMax()
	{
		SalesRecord highest = records.get(0); // if the 1st record is the max then we are done
		//Iterating through all of the sales records
		for (SalesRecord record: records) // if the 1st record isnt the max then the for loop finds a new max
		{
			if(highest.getSales() < record.getSales())
			{
				highest = record; // 1st we find the max sales value
			}
		}
		return highest.getDate(); //2nd we display the associated date linked to the max sales value
	}
	
    //Stream function to calculate the min sales
	public String getMin()
	{
		SalesRecord lowest = records.get(0); // if the 1st record is the min then we are done
		
		//Iterating through all of the sales records
		for (SalesRecord record: records) // if the 1st record isnt the min then the for loop finds a new min
		{
			if(lowest.getSales() > record.getSales())
			{
				lowest = record; //1st we find the min sales value
			}
		}
		return lowest.getDate(); //2nd we display the associated date linked to the min sales value
	}
	
	//Stream functions to filter entries by a particular and aggregate all the filtered sales records	
	
	
	
	
	
	
	
	
		
}
