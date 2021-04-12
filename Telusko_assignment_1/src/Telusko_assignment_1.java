public class Telusko_assignment_1 
{

	public static void main(String[] args) 
	{
		System.out.println("Q1>");
		int i,j;
		char a;
		
		for(i =0;i<6;++i)
		{
			for( j=0;j<=i;++j)
			{
				System.out.print((j+1)+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Q2>");
		
		for(i =0;i<3;++i)
		{
			a='A';
			for( j=0;j<=i;++j)
			{
				System.out.print(a +" ");
				++a;
			}
			System.out.println(" ");
		}
		
		System.out.println("Q3>");
		
		for(i =0;i<4;++i)
		{
			if(i==0 || i==3)
			System.out.println("$ $ $ $");
			else
			System.out.println("$     $");
		}
		
	}

}
