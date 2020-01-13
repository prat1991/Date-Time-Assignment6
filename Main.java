import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main
{
	public static void main(String[] args) throws IOException 
	{
		
		SalesData salesData1 = new SalesData();
		salesData1.loadDataFromFile("model3.csv");
		System.out.println( salesData1.getNumberOfRecords());
		System.out.println("\n----------------Model3's Yearly Sales Report--------------");
		System.out.println("2017's Total Sales: ");
		System.out.println("2018's Total Sales: ");
		System.out.println("2019's Total Sales: ");
		System.out.println("Best Month for sales: " + salesData1.getMax());
		System.out.printf("Worst Month for sales: " + salesData1.getMin());
		
		SalesData salesData2 = new SalesData();
		salesData2.loadDataFromFile("modelS.csv");
		System.out.println( salesData2.getNumberOfRecords());
		System.out.println("\n----------------ModelS'x Yearly Sales Report--------------");
		System.out.println("2017's Total Sales: ");
		System.out.println("2018's Total Sales: ");
		System.out.println("2019's Total Sales: ");
		System.out.println("Best Month for sales: " + salesData2.getMax());
		System.out.printf("Worst Month for sales: " + salesData2.getMin());
		
		SalesData salesData3 = new SalesData();
		salesData3.loadDataFromFile("modelX.csv");
		System.out.println(salesData3.getNumberOfRecords());
		System.out.println("\n----------------Model X's Yearly Sales Report--------------");
		System.out.println("2017's Total Sales: ");
		System.out.println("2018's Total Sales: ");
		System.out.println("2019's Total Sales: ");
		System.out.println("Best Month for sales: " + salesData3.getMax());
		System.out.printf("Worst Month for sales: " + salesData3.getMin());
	}
}

