package LogicalPrograms;

public class Ex10_primeNumber 
{
	public static void main(String[] args) 
	{
		int num=11;
		int count=0;
		
		for(int i=2; i<num; i++)
		{
			if(num % i == 0)
			{
				count++;
				break;
			}
		}
		
		if(count==1)
		{
			System.out.println("given num is not a prime num");
		}
		else
		{
			System.out.println("given num is  a prime num");
		}
		
		//find prime num from 1 to 100
	}

}
