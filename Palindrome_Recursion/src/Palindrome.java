
// Valid Palindrome using Recursive Function

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String check[] = {"AKA", "JAVA", "LEVEL", "MADAM","56565", "LOCOL","Himanshu"};
		String status;
		
		for(int i=0; i<check.length; i++)
		{
		status = String.valueOf(checkPalindrome(check[i]));
		System.out.printf("String: %s ,Status: %s \n",check[i],status);
		
		}
	}
	
	static boolean checkPalindrome(String str)
	{
		String newStr;
		int length = str.length();
		
		if(!(str.charAt(0) == str.charAt(length-1) ))
			return false;
		else
		{
			newStr = removeElement(str);
		    checkPalindrome(newStr);
		}
		
		return true;
				
	}

	static String removeElement(String passed)
	{
		String str[] = new String[passed.length()];
		
		for (int i=1; i<passed.length()-1;i++)
		{
			str[i-1] = passed.valueOf(i);
		}
	
	return (str.toString());
	}
	
}
