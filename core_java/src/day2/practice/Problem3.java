package day2.practice;

public class Problem3 {
	
	public static void main(String[] args) {
		int[] Sal = {20000,25000,55000,47000,38000};
		int find =55000;
		
		for(int x: Sal)
		{
			if(x==find)
			{
				System.out.println("Found");
			}
			else
			{
				System.out.println("Not");
				
			}
		}
	}

}
