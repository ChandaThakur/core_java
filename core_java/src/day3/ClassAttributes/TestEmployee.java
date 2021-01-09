package day3.ClassAttributes;

public class TestEmployee {
	
	public static void main(String[] args) {
			
			Employee ex1 =new Employee();
			
			System.out.println(ex1.getEpId());
			System.out.println(ex1.getEpName());
			
			System.out.println("updating values....");
			ex1.setEpId(93036);
			ex1.setEpName("chanda");
			
			System.out.println(ex1.getEpId());
			System.out.println(ex1.getEpName());
			
			System.out.println("using parameterizsed constructor...");
			
			Employee ex2 =new Employee(1232,"asdf");
			
			System.out.println(ex2.getEpId());
			System.out.println(ex2.getEpName());
			
			System.out.println("********************");
			
		System.out.println(ex2);
			
		}

}

