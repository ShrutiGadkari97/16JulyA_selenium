package LogicalPrograms;

public class Ex12_Reverse_num_without_string_function
{
	public static void main(String[] args)
	{
		int num=123;
		int revNum=0;
		
		for(int i=num; i>0; i=i/10)
		{
			int rem=i%10;
			revNum=revNum*10 + rem;
		}
		
		System.out.println(revNum);
		
		
		
		
//		while (num > 0)
//		{
//			int rem = num % 10;     
//			
//			revNum = revNum * 10 + rem;    
//			
//			num = num / 10;     

		
	}

}
