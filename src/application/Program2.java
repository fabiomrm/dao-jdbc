package application;

import com.daojdbc.model.dao.DAOFactory;
import com.daojdbc.model.dao.DepartmentDAO;
import com.daojdbc.model.entities.Department;
import com.daojdbc.model.entities.Seller;

import java.util.ArrayList;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        DepartmentDAO departmentDAO = DAOFactory.createDepartmentDAO();

        System.out.println("=== TEST 01: department - findById ===");
        Department dep = departmentDAO.findById(1);
        System.out.println(dep);

        System.out.println("\n=== TEST 02: department - insert ===");
        Department newDep = new Department(null, "kitchen");
        departmentDAO.insert(newDep);

        System.out.println("\n====TEST 03: department - findAll====");
        List<Department> departments = departmentDAO.findAll();
        for(Department d : departments) {
            System.out.println(d);
        }


    }
}
