
public class LargestNumber {

	static int counter=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[]= {11,2};
		int arr2[]= {2,30,56};
		int arr3[]= {85,17,56,465, 7321};
		int returnedArray[] = new int[100];
		int finalArray[] = new int[100];
		
		returnedArray =	backend(arr3);
		
		finalArray =  sort(returnedArray);

		System.out.println("Number: ");
		for(int i=finalArray.length-1;counter>= finalArray.length-i ; i--)
		System.out.print(finalArray[i]);
		 
	
	}
	
	static int[] sort(int[] sortArr)
	{
		int n;
		for(int i=0; i< sortArr.length; i++)
		{
			for(int j=0; j< sortArr.length; j++)
			{if(sortArr[i]<sortArr[j])
			{
				n = sortArr[i];
				sortArr[i]=sortArr[j];
				sortArr[j] = n;
			}
			}
		}
		
		 
	return sortArr;
	}
	
	static int[] backend(int[] arr)
	{
		int n;
		int storage[] = new int[100];
		 
		
		for(int i=0; i< arr.length; i++)
		{
			 
			
			while(arr[i]/10 != 0)
			{
				
				storage[counter] = arr[i]%10;
				counter++;
				 arr[i]= arr[i]/10;
			}
			storage[counter] = arr[i]%10;
			counter++;
		}
			
		
		 
		 
	
	return storage;
	}

}
