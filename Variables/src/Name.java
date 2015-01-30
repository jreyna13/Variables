//Javier Reyna EG1305A

import java.text.DecimalFormat;


public class Name {

	public static void main(String[] args) {
	
		String name = "Javier Reyna";
		
		System.out.print("My name is "+name);
		
		int age = 26;
		
		System.out.print(", my age is "+ age);
		
		double annualpay = 100000.00;
		
		DecimalFormat aFormatter = new DecimalFormat("###,###.##");
		
		System.out.println(" and I hope to earn $" + aFormatter.format(annualpay));
		
		System.out.println("per year.");
				
}
}
