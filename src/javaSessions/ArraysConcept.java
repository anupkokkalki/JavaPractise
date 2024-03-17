package javaSessions;

public class ArraysConcept {

	public static void main(String[] args) {
		
		//static Array: size is fixed
		//can store only similar type of data: 
			
		
		
		//int array:
		int k[] = new int[4];
		//li = 0
		//hi = 3 --> length - 1
		//length = 4 --> hi+1
		//range: 0 to 3
		
		//k[-1] = 60;//AIOB
		k[0] = 10;
		k[1] = 20;
		k[2] = 30;
		k[3] = 40;
		//k[4] = 50;//ArrayIndexOutOfBoundsException -- AIOB
		
		System.out.println(k[0]);
		System.out.println(k[3]);
		//System.out.println(k[4]);//AIOB
		
		//2. double array:
		double d[] = new double[2];
		d[0] = 12.33;
		d[1] = 34.44;
		
		//3. char array:
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = 'A';
		c[2] = '0';
		
		//String array:
		String browsers[] = new String[4];
		browsers[0] = "chrome";
		browsers[1] = "firefox";
		browsers[2] = "safari";
		browsers[3] = "safari";
		
		System.out.println(browsers[0]);
		System.out.println(browsers[2]);
		System.out.println(browsers[3]);
		
		System.out.println("Note 1>: lenght=highest index+1, highest index =lenght-1, lowest index= 0always ");
		System.out.println("Note 2>: understand conceptually static array and dynamic array, when both are used");
		System.out.println("Note 3>: static array usecases-BusTicketBooking, flightBooking, when counter is static");
		System.out.println("Note 4>: Dynamic array use case when the counter is not standard like the inventory, stockDuring festive sessions");
		System.out.println("Note 5>: Difference between static and dynamic array- limitation with scaling when static array, when larger array is \n	used there is memory wasteage");
		System.out.println("Note 6>: Static Array - A static array in Java is an array with a fixed size that you specify when you declare it. \n	Once the size is set, /n it cannot be changed. ");
		System.out.println("Note 7>: Dynamic Array - A dynamic array, typically implemented using the \"ArrayList class\" in Java,\n	allows you to create an array-like structure that can grow or shrink dynamically as needed.");

		System.out.println("Note 8>: Disadvantages of array data structure:");
        System.out.println("	1. Fixed size: Arrays have a fixed size that is determined at the time of creation. \n	 This means that if the size of the array needs to be increased, a new array must be created and the data must be copied from the old array to the new array, \n 	which can be time-consuming and memory-intensive.");
        System.out.println("	2. Memory allocation issues: Allocating a large array can be problematic, \n	 particularly in systems with limited memory. If the size of the array is too large, the system may run out of memory, \n 	which can cause the program to crash.");
        System.out.println("	3. Insertion and deletion issues: Inserting or deleting an element from an array can be \n	 inefficient and time-consuming because all the elements after the insertion or deletion point must be shifted to\n 	 accommodate the change.");
        System.out.println("	4. Wasted space: If an array is not fully populated, there can be wasted space in the \n	 memory allocated for the array. This can be a concern if memory is limited.");
        System.out.println("	5. Limited data type support: Arrays have limited support for complex data types such \n	 as objects and structures, as the elements of an array must all be of the same data type.");
        System.out.println("	6. Lack of flexibility: The fixed size and limited support for complex data types can \n	 make arrays inflexible compared to other data structures such as linked lists and trees.");
		

	}

}