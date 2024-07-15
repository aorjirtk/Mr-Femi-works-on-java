
public class LargestAndSmallestNumberFunction{

	public static int largestAndSmallestNumbers(int number){

		while(counter < 10){
		System.out.print("Enter the number: ");
		int number = input.nextInt();

		if(largestNumber < number){
		largestNumber = number ;
		}
		if(smallestNumber==0 || number < smallestNumber){
		smallestNumber = number;
		}
		
		counter++;
		}
	return (smallestNumber);
	return (largestNumber);

	}

}