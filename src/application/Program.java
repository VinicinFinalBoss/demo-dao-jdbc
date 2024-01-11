package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		Department dp = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dp);
		
		for(Seller obj: list) {
			System.out.println(obj);
		}
		System.out.println("\n=== TEST 3: seller findByDepartment ===");
		list = sellerDao.findAll();
		
		for(Seller obj: list) {
			System.out.println(obj);
		}
		System.out.println("\n=== TEST 4: seller Insert ===");
		Seller sellerObj = new Seller(null, "Vinícius", "viniciuslima@gmail.com", new Date(), 9000.0, dp);
		sellerDao.insert(sellerObj);
		System.out.println("Inserted! New id = " + sellerObj.getId());
	}
}
