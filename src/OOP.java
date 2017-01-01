import java.util.*;

public class OOP {
	// Constructor
	public OOP(){
		
	}
	// Display Array in Normal Order	
	public void normal(String[] cars){
		for(int i=0;i<cars.length;i++){
			System.out.println(cars[i]);
		}
	}
	// Display Array in Reverse Order
	public void reverse(String[] cars){
		for(int i=cars.length-1;i >= 0;i--){
			System.out.println(cars[i]);
		}
	}	
	// Find the Equilibrium Index
	public void equilibrum(int index, int values[]){
		// Add all values from the left side of the chosen index
		// Add all values from the right side of the chosen index
		// Check if the sum of the left and right side are equal
		// If they are equal, then they are equilibrium
        // Index position
        int leftSize = index - 1;
        int rightSize = index + 1;
        // Sum counters
        int leftSum = 0;
        int rightSum = 0;
        // Add all values in the left side
        for(int i=0;i<=leftSize;i++){
        	leftSum = leftSum+values[i];
        }
        // Add all values in the right side
        for(int i=rightSize;i<values.length;i++){
        	rightSum = rightSum+values[i];
        }
        // Both Sides are equal
        // It is equilibrium
        if(leftSum == rightSum){
        	System.out.print("True");
        } 
        // Both sides are not equal
        else {
        	System.out.print("False");
        }
	}
	
	// Return size of string
	public int stringSize(String str){
		int size = str.length();
		return size;
		
	}
	public void Histogram(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("how many imput values [max: 30]? ");
		
		int size = keyboard.nextInt();
		System.out.println("Enter Numbers");
		
		int myArray[] = new int[size];
		// Add input values into array
		for(int i=0;i<myArray.length;i++) {
			myArray[i] = keyboard.nextInt();
		}
		//Arrays.sort(myArray);
		int occurrence[]= new int[40];
		System.out.println("Number Occurrences");
		
		// Count the occurrences
		for(int j=0;j<myArray.length;j++){
			occurrence[myArray[j]]++;
		}
		for(int j=0;j<occurrence.length;j++) {
			if(occurrence[j]!=0){
				System.out.println(j+" "+occurrence[j]);
			}
		}
		keyboard.close();
	}
	// Return number of occurrences of a particular number
	public int findOccurence(int values[], int target){
		int result = 0;
		int occurence[] = new int[values.length];
		for(int i=0;i<values.length;i++){
			occurence[values[i]]++;
		}
		for(int j = 0;j<occurence.length;j++){
			if(j == target){
				result = occurence[j];
			}
		}
		return result;
		
	}
	// Remove duplicates using HashSet
	public void removeDuplicates(int values[]){
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<values.length;i++){
			list.add(values[i]);
		}
		// HashSet doesn't accept duplicates by default
		// It will only take unique values
		Set<Integer> set = new LinkedHashSet<Integer>(list);
		for(int item : set){
			System.out.print(item);
		}

	}

	public void findDuplicates(){
		
	}
	public void fib(){
		
	}
	public int binarySearch(int values[], int size, int element){
		int low = 0;
		int high = size - 1;
		int result = -1;
		
		while(high>=low){
			int middle = (low + high) / 2;
			if(values[middle] == element) {
				// Find the first occurence in the array
				result = values[middle];
				high = middle - 1;
			}
		}
		return result;
		
	}
	public void linkedList(){
		LinkedList ll = new LinkedList();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		ll.addLast("Z");
		ll.addFirst("A");
		ll.add(1, "A2");
		System.out.println(ll);
	}
	// Find largest and smallest values in array
	public void FindLargest(int binValues[]){
		int largest = binValues[0];
		int smallest = binValues[0];
		for(int i=0;i<binValues.length;i++){
			if(binValues[i] > largest){
				largest = binValues[i];
			} 
			if(binValues[i] < smallest){
				smallest = binValues[i];
			}			
		}
		System.out.println("Largest: "+largest+" "+"Smallest: "+smallest);
	}
	public void seatMap(){
		int size = 8;
		HashMap<String, List<String>> seatRow = new HashMap<String, List<String>>();
		Scanner keyboard = new Scanner(System.in);
		String stop = "Q";
		
		String k = null;
		for(int i=1;i<size;i++) {
			k = Integer.toString(i);
			List<String> seats = new ArrayList<String>();
			seats.add("A");
			seats.add("B");
			seats.add("C");
			seats.add("D");
			seatRow.put(k, seats);
		}
		
		for(Map.Entry<String, List<String>> entry: seatRow.entrySet()){
			String key = entry.getKey();
			List<String> values = entry.getValue();
			System.out.println(key+"  "+values.get(0)+values.get(1)+"  "+values.get(2)+values.get(3));
			
		}
	}
	


}
