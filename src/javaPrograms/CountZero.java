package javaPrograms;

public class CountZero {
	public static void main(String[] args) {
		int no=1025020;
		int count=0;
		while(no!=0)
		{
			int rem=no%10;
			if(rem==0)
			{
				count++;
			}
			no=no/10;
		}
		System.out.println(count); 
	}
}
