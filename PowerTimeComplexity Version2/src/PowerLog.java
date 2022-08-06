
//program to find the power X over N in O(logn) time complexity. 

public class PowerLog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double result = mathPower(2,-3);
		
		
		System.out.println("result: "+result);
	}
	
	static double mathPower(double number, int power)
	{
		double result;
		if (power<0)
		{
			power = -power;
			number = 1/number;
		}
		result = power(number, power);
	return result;
	}
	
	static double power(double number, int power)
	{
		if(power==0)
		{return 1;}
		
		 double half = power(number, power/2);
		
		if(power%2 == 0)
		{ 
		return half*half;
		}
		
				
		else
		{
			return half * half * number;
		}
	}

}
