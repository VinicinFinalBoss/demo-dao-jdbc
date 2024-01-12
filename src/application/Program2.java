package application;

import java.sql.Connection;

import db.DB;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		Connection conn = DB.getConnection();
		Department dep = new Department(null,"Tourism");
		depDao.insert(dep);
		System.out.println("===== Test 1: Insert Department ===== ");
		System.out.println("Inserted new Department");
		
		

	}

}
