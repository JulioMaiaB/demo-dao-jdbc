package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {

		// injecao de dependencia
		// objeto (interface) que possui acesso a todos os metodos do jdbc
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TESTE 1: seller findById ===");
		Seller seller = sellerDao.findById(8);
		System.out.println(seller);

		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		Department dep = new Department(3, null);
		List<Seller> list = new ArrayList<Seller>();
		list = sellerDao.findByDepartment(dep);
		list.forEach(x -> System.out.println(x));

		System.out.println("\n=== TEST 3: seller findAll ===");
		list = sellerDao.findAll();
		list.forEach(x -> System.out.println(x));

		System.out.println("\n=== TEST 4: seller insert ===");
		Seller newSeller = new Seller(null, "Carlos", "carlos@gmail.com", new Date(), 4000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
	}

}
