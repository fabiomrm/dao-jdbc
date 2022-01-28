package application;

import com.daojdbc.model.dao.DAOFactory;
import com.daojdbc.model.dao.DepartmentDAO;
import com.daojdbc.model.entities.Department;

public class Program2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        DepartmentDAO departmentDAO = DAOFactory.createDepartmentDAO();

        System.out.println("=== TEST 01: department - findById ===");
        Department dep = departmentDAO.findById(1);
        System.out.println(dep);

    }
}
