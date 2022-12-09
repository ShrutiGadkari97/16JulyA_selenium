package LogicalPrograms;

public class Ex4_reverseString
{
	public static void main(String[] args)
	{
		String org="abcd"; 			//0 to 3
		String rev = "";
		
		for(int i=org.length()-1; i>=0; i--)
		{
			rev=rev+org.charAt(i);
		}
		
		System.out.println(rev);
	}

}
