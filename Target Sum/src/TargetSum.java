
public class TargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int returnedArray[] = new int[2];
		int arr1[] = {2,7,11,15};
		int arr2[] = {2,4,6};
		int arr3[] = {4,4};
		int arr4[] = {2,3,5,5,6,8,10,11,15,17,45};
		
		returnedArray = Backend(arr1,9);
		show(arr1[returnedArray[0]]+arr1[returnedArray[1]],returnedArray);
		returnedArray = Backend(arr2,6);
		show(arr2[returnedArray[0]]+arr2[returnedArray[1]],returnedArray);
		returnedArray = Backend(arr3,8);
		show(arr3[returnedArray[0]]+arr3[returnedArray[1]],returnedArray);
		returnedArray = Backend(arr4,26);
		show(arr4[returnedArray[0]]+arr4[returnedArray[1]],returnedArray);
	}

	static int[] Backend(int arr[], int target)
	{
		int nullArray[] = {0};
		int targetArray[] = new int[2];
		
		for(int i=0; i< arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]+arr[j]==target)
				{
					targetArray[0] = i;
							targetArray[1] = j;  
							return targetArray;
					
				}
			}
		 
		}
	return nullArray;
	}
	
	static void show(int target,int arrayTarget[])
	{
		
		System.out.printf("Index: %d,%d, num[%d] + num[%d] = %d \n",arrayTarget[0],arrayTarget[1],arrayTarget[0],arrayTarget[1],target);
	}
}
