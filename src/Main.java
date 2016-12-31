import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// Instantiate object
		OOP instance = new OOP();
		int values[] = {-1,3,-4,5,1,-6,2,1};
		int binValues[] = {2,3,3,4,1,3,4,4,5,1};
		int binSize = binValues.length;
		String[] cars = new String [5];
		cars[0] = "BMW";
		cars[1] = "Honda";
		cars[2] = "Toyota";
		cars[3] = "Ferrari";
		cars[4] = "Porshe";
		//instance.normal(cars);
		//instance.reverse(cars);
		//instance.seatMap();
		//instance.equilibrum(3,values);
		//System.out.print(instance.stringSize("Hello"));
		//instance.Histogram();
		//Arrays.sort(binValues);
		//instance.binarySearch(binValues,binSize,3);
		//instance.linkedList();
		//instance.FindLargest(binValues);
		instance.removeDuplicates(binValues);
	}
}
