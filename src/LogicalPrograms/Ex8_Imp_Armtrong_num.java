package LogicalPrograms;

public class Ex8_Imp_Armtrong_num
{
	public static void main(String[] args) 
	{
		int OrgNum=153;		//1+125+27=153
		int sum=0;
		
		for(int i=153; i>=0; i=i/10)
		{
			int rem = i % 10;
			sum = sum + (rem*rem*rem);
		}
		
		if(OrgNum==sum)
		{
			System.out.println("given num" + OrgNum + "is an armstrong num");
		}
		else
		{
			System.out.println("given num" + OrgNum + "is not an armstrong num");
		}
		
//		int rem = OrgNum%10;  // 153%10= 3
//		System.out.println(rem);
//
//		OrgNum=OrgNum/10;  //153/10 =15
//		System.out.println(OrgNum);
		

	}

}
