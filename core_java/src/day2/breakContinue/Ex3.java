package day2.breakContinue;

public class Ex3 {
	
	public static void main(String[] args) {
		
		int i=0;
		while(i<10) {
			if(i==4) {
				break;
			}
			
			if(i==1) {
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

}
