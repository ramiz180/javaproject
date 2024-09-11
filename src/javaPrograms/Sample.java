package javaPrograms;

public class Sample {

	public static void main(String[] args) 
	{
		String[] s1={"HI","HELLO","HI","HELLO","BYE"};
		
			for (int i = 0; i < s1.length; i++) 
			{
				int count=0;
				for (int j = 0; j < s1.length; j++) 
				{
					if(s1[i]==s1[j])
					{
						count++;
					}
					
				}
				if(count==1)
				{
					System.out.println(s1[i]);
				}
				
			
		}
		

	}

}
