package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entities.Department;
import model.entities.Seller;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Department dp = new Department(1, "Financeiro");
		Seller sl = new Seller(12, "Julio", "julio@gmail.com", sdf.parse("20/03/1999"), 4000.0, dp);
		
		System.out.println(dp);
		System.out.println(sl);
		
	}
	
}
