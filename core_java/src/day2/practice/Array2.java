package day2.practice;

public class Array2 {
	
	public static void main(String[] args) {
		String[] names = {"abc","ghj","leo"};
		
		String[] subject = {"English","Hindi","Maths","Science","SST"};
		
		int[][] marks = {{70,40,69,80,70},{81,58,90,94,60},{80,45,67,76,39}};
		
		for(String x: names) {
			System.out.println("Name:" +x);
			
			for(String y: subject) {
				System.out.println("Subject:" +y);
				
			for(int i=0; i<marks.length;i++) {
					
					for(int j=0; j< marks[1].length;j++) {
						
						System.out.println("Marks:" +marks[i][j]);
						
					}

					
					System.out.println("");
				}
					

			}
			
		}
		
		
	}

}
